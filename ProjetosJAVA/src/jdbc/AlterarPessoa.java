package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarPessoa {
	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a pessoa pelo código: ");
		int valorCodigo = entrada.nextInt();

		Connection conexao = FabricaConexao.getConexao();
		String sqlSelect = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
		String sqlUpdate = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		PreparedStatement stmt = conexao.prepareStatement(sqlSelect);
		stmt.setInt(1, valorCodigo);
		ResultSet resultado = stmt.executeQuery();

		if (resultado.next()) {
			Pessoa p = new Pessoa(resultado.getString(2), resultado.getInt(1));
			System.out.println("O nome atual é: " + p.getNome());
			entrada.nextLine(); // Pular a linha
			System.out.print("Informe agora como será o novo nome: ");
			String valorNome = entrada.nextLine();

			stmt.close(); // Fechando a conexao sql para a criação de outra
			stmt = conexao.prepareStatement(sqlUpdate); // Criando o update sql
			stmt.setString(1, valorNome);
			stmt.setInt(2, valorCodigo);
			stmt.execute(); // Executando o comando sql

			System.out.println("Pessoa alterada com sucesso!!!");
		} else {
			System.out.println("Pessoa não encontrada!!!");
		}

		conexao.close();
		entrada.close();
	}
}
