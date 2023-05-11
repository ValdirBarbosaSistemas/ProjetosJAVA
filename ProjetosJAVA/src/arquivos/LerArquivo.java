package arquivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerArquivo {
	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream entradaArquivo = new FileInputStream("D:\\Projetos_Programacao\\ProjetosJAVA\\ProjetosJAVA\\src\\arquivos\\arquivo2.txt");//Caminho do arquivo onde está localizado

		Scanner lerAquivo = new Scanner(entradaArquivo, "UTF-8");//Criacao da variavel onde sera lido o arquivo

		List<Pessoa> pessoas = new ArrayList<>();
		
		while (lerAquivo.hasNext()) {//Enquanto 'lerArquivo' tiver dado...
			String linha = lerAquivo.nextLine();//Pegar as informacoes da proxima linha...

			//System.out.println(linha);
			
			//Caso houver alguma linha em branco e querermos imprimir os valores sem a mesma, usamos o codigo abaixo...
			
			if(linha!= null && !linha.isEmpty()) {//Se a linha for diferente de null e a linha NAO estiver vazia
				//System.out.println(linha);
				
				String [] dados = linha.split("\\;");
				Pessoa pessoa = new Pessoa();
				pessoa.setNome(dados[0]);
				pessoa.setEmail(dados[1]);
				pessoa.setIdade(Integer.parseInt(dados[2]));

				pessoas.add(pessoa);
			}
		}
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
	}
}
