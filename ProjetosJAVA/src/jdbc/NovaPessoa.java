package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o nome da pessoa: ");
		String nome = entrada.next();

		/*
		 * O modo abaixo é um modo seguro para não se ter 'invasão dos dados' que é
		 * chamado de 'sql injection'
		 * 
		 */
		Connection conexao = FabricaConexao.getConexao(); // Criando uma conexão

		String sql = "INSERT INTO pessoas (nome, codigo) VALUES (?, ?)"; // Criando um comando sql
		PreparedStatement stmt = conexao.prepareStatement(sql); // Forma segura de se receber os dados
		stmt.setString(1, nome);/*
								 * Primeiro parâmetro que no caso é o nome (STRING porque o parâmetro é uma
								 * String)
								 */
		stmt.setInt(2, 10); /*
							 * Segundo parâmetro e o código id 10, ou seja, os próximos registros que
							 * entrarem, virão a partir do código '10' (INT porque o parâmetro é um int)
							 */
		/*
		 * Devido aos VALUES estarem em (?, ?), que é uma forma segura de se inserir
		 * dados, usamos o 'PreparedStatement' que é uma forma mais segura do
		 * 'Statement'. Pois usando o statement ele ainda dá 'brecha' para algum tipo de
		 * invasão. Daí a forma de se utilizar um método para setar o índice e o valor
		 * declarado.
		 */
		stmt.execute(); // Executando o sql SEM O PARÂMETRO, POIS JÁ FOI DECLARADO NO PREPARED STATEMENT

		System.out.println("Pessoa incluída com sucesso!");
		stmt.close();
		entrada.close();
	}
}
