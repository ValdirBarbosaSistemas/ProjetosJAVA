package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas1 {
	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaConexao.getConexao(); // Criação da conexao
		String sql = "SELECT * FROM pessoas"; // Definição do sql

		Statement stmt = conexao.createStatement();
		// stmt.execute(sql); (FORMA PADRÃO DE SE FAZER) FORMA CORRETA ABAIXO
		ResultSet resultado = stmt.executeQuery(sql);
		/*
		 * O ResultSet serve para voce mostrar o resultado em uma variável no sql. Ou
		 * seja, pegar o resultado do banco de dados e trazer para uma variável que no
		 * caso é 'resultado'.
		 */
		List<Pessoa> pessoas = new ArrayList<>();

		while (resultado.next()) {
			// Enquanto 'resultado' for verdadeiro... 'me dê o próximo'
			int codigo = resultado.getInt("Codigo"); // Pegando o valor do código da pessoa
			String nome = resultado.getString("Nome");// Pegando o valor da String pessoa
			pessoas.add(new Pessoa(nome, codigo));
		}

		for (Pessoa p : pessoas) {
			System.out.println(p.getCodigo() + " ==> " + p.getNome()); // Mostrando o resultado
		}

		stmt.close();
		conexao.close();
	}
}
