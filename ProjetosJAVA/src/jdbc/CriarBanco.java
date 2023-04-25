package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
	public static void main(String[] args) throws SQLException {
		// Variável para o endereço do banco
		final String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
		// Variável para o usuário de acesso
		final String usuario = "root";
		// Variável para a senha de acesso
		final String senha = "V@ldir";
		Connection conexao = DriverManager.getConnection(url, usuario, senha);

		// Criando uma execução de criação de banco de dados
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");
		System.out.println("Banco criado com sucesso!!!");
		conexao.close();
		
		/**
		 * ---------Para aprendizado---------
		 * 
		 * Statement - Serve para voce montar um comando SQL para ser executado
		 * ResultSet - Vai representar um objeto contendo o resultado da nossa
		 * consulta na forma de tabela. Com isso, podemos ter acesso a linhas e
		 * colunas da tabela.Resumindo, vamos fazer a consulta no Statement e 
		 * Guardar o resultado no ResultSet.
		 */
	}
}
