package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o código: ");
		int codigo = entrada.nextInt();

		Connection conexao = FabricaConexao.getConexao();
		String sql = "DELETE FROM pessoas WHERE codigo = ?";

		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);

		if (stmt.executeUpdate() > 0) {
			System.out.println("Pessoa excluída com sucesso!!!");
		} else {
			System.out.println("NADA FEITO!!!");
		}

		/*
		 * O 'executeUpdate' retorna um inteiro. (VER DOCUMENTAÇÃO), ou seja, ele
		 * retorna a quantidade de linhas que foram afetadas a partir da execução Se
		 * retorna 0 quer dizer que não foi alterada NADA. Se ele retorna 1,2 ou 3 quer
		 * dizer que foram excluídas 1,2 ou 3 linhas.
		 */
		entrada.close();
		conexao.close();
	}
}
