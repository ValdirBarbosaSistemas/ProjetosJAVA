package arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivos {
	public static void main(String[] args) throws IOException {
		
		/**
		 * Para se criar um arquivo, precisamos de dois objetos. Um
		 * para criar e outro para escrever.Ou seja, como vemos abaixo
		 * criamos um objeto para a criacao do arquivo dizendo o caminho
		 * onde sera criado, e outro e o objeto onde sera escrito a 
		 * mensagem 'escrever_no_arquivo'.
		 */
		
		File arquivo = new File("D:\\Projetos_Programacao\\ProjetosJAVA\\ProjetosJAVA\\src\\arquivos\\arquivo.txt");//Caminho onde sera criado
		
		if(!arquivo.exists()) {//condicao para criar o arquivo
			arquivo.createNewFile();
		}
		
		FileWriter escrever_no_arquivo = new FileWriter(arquivo);//Objeto para escrever algo no arquivo
		
		//Para se criar um texto no arquivo, há uma rotina para ser executada
		escrever_no_arquivo.write("Meu texto no arquivo criado");//inicio da rotina
		escrever_no_arquivo.write("\n");
		escrever_no_arquivo.write("Minha segunda linha de texto");
		escrever_no_arquivo.flush();//salvar o arquivo
		escrever_no_arquivo.close();//fechar o 'arquivo'
	}
}
