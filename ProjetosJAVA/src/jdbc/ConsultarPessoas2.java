package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {
	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);

		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";
		/*
		 * O 'like' serve para consultar partes de um trecho de frase, ou seja, 
		 * %val% ele irá pegar um trecho que contenha a parte 'val' 
		 * Ma% caso queira pesquisar frase que COMEÇA com a palavra 'Ma' 
		 * %al caso queira pesquisar frase que TERMINE com a palavra 'al'
		 */

		System.out.println("Informe o valor da pesquisa: ");
		String valorNome = entrada.nextLine();

		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + valorNome + "%"); // Consultando um trecho da palavra
		ResultSet resultado = stmt.executeQuery();

		List<Pessoa> pessoas = new ArrayList<>();

		while (resultado.next()) {
			int codigo = resultado.getInt("Codigo");
			String nome = resultado.getString("Nome");
			pessoas.add(new Pessoa(nome, codigo));
		}

		for (Pessoa p : pessoas) {
			System.out.println(p.getCodigo() + " ==> " + p.getNome());
		}

		stmt.close();
		conexao.close();
		entrada.close();
	}
}
