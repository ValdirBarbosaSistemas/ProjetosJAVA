package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {
	/*
	 * Abaixo a Criação de um método estático na classe 'FabricaConexao' para que quando
	 * sempre criar uma conexão ou algo do tipo, chamar o método em vez de ficar
	 * sempre criando em uma classe
	 */
	public static Connection getConexao() {
		try {
			Properties prop = getProperties(); // Chamando o método properties
			final String url = prop.getProperty("banco.url"); // Chamando a url criada no properties
			final String usuario = prop.getProperty("banco.usuario"); // Chamando o usuario criado no properties
			final String senha = prop.getProperty("banco.senha"); // Chamando a senha criada no properties
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException | IOException e) {
			throw new RuntimeException(e);
		}
	}

	/*
	 * O método abaixo serve justamente para executar os comandos que estão salvos
	 * no arquivo 'conexao.properties' para não deixar aberto na classe
	 * FabricaConexao.
	 */
	private static Properties getProperties() throws IOException {// Lançando o IOException para tratar o erro
		Properties prop = new Properties(); // Criando a classe Properties
		String caminho = "/jdbc/conexao.properties"; // Caminho do arquivo conexao.properties
		prop.load(FabricaConexao.class.getResourceAsStream(caminho)); // Carregando o arquivo properties
		return prop;
	}
}
