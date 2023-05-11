package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {

	/*
	 * O DAO é um padrão de projeto que serve para 'separar' os 'scripts'
	 * relacionados ao banco de dados das 'estruturas' de programação em si, ou
	 * seja, voce pode inserir, consultar, deletar (fazer as estruturas do sql) tudo
	 * que for 'relacionado' ao banco se cria a partir de uma classe e tudo o que
	 * for 'relacionado' a estrutura de programação em outra classe. (MINHA
	 * CONCEPÇÃO).
	 */

	// Atributos
	private Connection conexao;

	// Método para criar uma conexao ao banco de dados

	private Connection getConexao() {
		try {

			if (conexao != null && !conexao.isClosed()) {
				return conexao;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		conexao = FabricaConexao.getConexao();
		return conexao;
	}

	// Método para fechar uma conexão com o banco de dados

	public void close() {
		try {
			getConexao().close();
		} catch (SQLException e) {
			e.getMessage();
		} finally {
			conexao = null;
		}
	}

	// Método para incluir os dados no banco

	public int incluir(String sql, Object... atributos) { // OBS: estudar (VAR ARG)
		/*
		 * (VAR ARG) = voce pode adicionar mais de um atributo se voce quiser,ou seja,
		 * uma lista de atributos.
		 */
		try {
			/*
			 * Como o método é um 'int', eu quero retornar o id que foi gerado a partir
			 * dessa inclusão. E para isso devemos usar o 'auto-generate key' do
			 * 'PreparedStatement' que serve para retornar os id's gerados. Vê abaixo...
			 */
			PreparedStatement stmt = getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

			// Chamando o método que foi criado logo abaixo
			adicionarAtributos(stmt, atributos);

			if (stmt.executeUpdate() > 0) {
				ResultSet resultado = stmt.getGeneratedKeys();
				if (resultado.next()) {
					return resultado.getInt(1);
				}
			}

			return -1;

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	// Método para 'setar' cada um dos atributos que recebeu como parâmetro no método incluir
	private void adicionarAtributos(PreparedStatement stmt, Object[] atributos) throws SQLException {
		int indice = 1;
		for (Object atributo : atributos) {
			if (atributo instanceof String) {
				stmt.setString(indice, (String) atributo);
			} else if (atributo instanceof Integer) {
				stmt.setInt(indice, (Integer) atributo);
			}
			indice++;
		}
	}
}
