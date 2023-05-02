package arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivos {
	public static void main(String[] args) throws IOException {

		/**
		 * Para se criar um arquivo, precisamos de dois objetos. Um para criar e outro
		 * para escrever.Ou seja, como vemos abaixo criamos um objeto para a criacao do
		 * arquivo dizendo o caminho onde sera criado, e outro e o objeto onde sera
		 * escrito a mensagem 'escrever_no_arquivo'.
		 */

		File arquivo = new File("D:\\Projetos_Programacao\\ProjetosJAVA\\ProjetosJAVA\\src\\arquivos\\arquivo.txt");// Caminho onde sera criado

		if (!arquivo.exists()) {// condicao para criar o arquivo
			arquivo.createNewFile();
		}

		FileWriter escrever_no_arquivo = new FileWriter(arquivo);// Objeto para escrever algo no arquivo

		// Para se criar um texto no arquivo, há uma rotina para ser executada
		escrever_no_arquivo.write("Meu texto no arquivo criado");// inicio da rotina
		escrever_no_arquivo.write("\n");
		escrever_no_arquivo.write("Minha segunda linha de texto");
		escrever_no_arquivo.flush();// salvar o arquivo
		escrever_no_arquivo.close();// fechar o 'arquivo'

		File arquivo2 = new File("D:\\Projetos_Programacao\\ProjetosJAVA\\ProjetosJAVA\\src\\arquivos\\arquivo2.txt");
		
		if(!arquivo2.exists()) {
			arquivo.createNewFile();
		}
		
		//Escrevendo um objeto no arquivo
		FileWriter escrever_no_arquivo2 = new FileWriter(arquivo2);
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Alex");
		pessoa1.setIdade(50);
		pessoa1.setEmail("pessoa1@gmail.com");

		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Ricardo");
		pessoa2.setIdade(30);
		pessoa2.setEmail("pessoa2@gmail.com");

		Pessoa pessoa3 = new Pessoa();
		pessoa3.setNome("Valdir");
		pessoa3.setIdade(36);
		pessoa3.setEmail("pessoa3@gmail.com");

		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);

		for (Pessoa pessoa : pessoas) {
			escrever_no_arquivo2.write(pessoa.getNome() + "; " + pessoa.getIdade() + "; " + pessoa.getEmail() + "\n");
		}
		
		escrever_no_arquivo2.flush();
		escrever_no_arquivo2.close();
	}
}
