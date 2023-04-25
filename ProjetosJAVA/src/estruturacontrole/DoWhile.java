package estruturacontrole;

import java.util.Scanner;

/*public class DoWhile {
	public static void main(String[] args) {
		Scanner numero = new Scanner (System.in);
		double somaDasNotas = 0;
		double nota = 0;
		int numeroDeNotas = 0;
		
		do {
			nota = numero.nextDouble();
			if (nota <= 10 && nota >= 0) {
				somaDasNotas += nota;
				numeroDeNotas++;
			}
		} while (nota != -1);
		numero.close();
		System.out.printf("A media é %.2f", somaDasNotas / numeroDeNotas);
	} 
}      /* A realidade é que no Do/While se faz primeiro o bloco de código 
		*para depois fazer a repetição. E também é a única expressão que o ';' fica no final da expressão */
public class DoWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String texto = "";
		do {
			System.out.println("Voce precisa falar as palavras magicas...");
			System.out.println("Quer sair?");
			texto = entrada.nextLine();
		}	while (!texto.equalsIgnoreCase("por favor"));
		System.out.println("Obrigado!");
		entrada.close();
	}
}
