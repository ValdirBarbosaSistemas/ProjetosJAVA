package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	public static void main(String[] args) throws SQLException {
		// Criando uma conexão
		final String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
		/*
		 * jdbc = em que local vou estar acessando o banco de dados 
		 * mysql = Nome do drive que vai acessar 
		 * localhost = nome do servidor
		 */
		final String usuario = "root";
		final String senha = "V@ldir";

		// Criando uma conexão
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		/*
		 * Neste caso aprendemos que isso é um método que vai lançar uma exeção checada,
		 * ou seja, teremos que tratar, que no caso teria que ser com um try/catch ou
		 * poderíamos lançar a mesma para 'outra' pessoa poder tratar
		 */

		System.out.println("Conexão realizada com sucesso!");
		conexao.close();
	}
}
