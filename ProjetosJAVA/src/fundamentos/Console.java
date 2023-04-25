package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		/* System.out.print(); IMPRIME SEM A QUEBRA DE LINHA
		 * System.out.println(); IMPRIME COM A QUEBRA DE LINHA
		 * System.out.printf(); IMPRIME COM FORMATAÇÃO
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos. \n", nome, sobrenome, idade);
		entrada.close();
	}
}
