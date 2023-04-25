package estruturacontrole;

import java.util.Scanner;

/*
 * Esse método WHILE serve para saber a média do aluno sem saber quantas notas irão precisar para isso,
 * ou seja, um WHILE INDETERMINADO
 */
/*public class WhileIndeterminado {
	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		double somaDasNotas = 0;
		double nota = 0;
		int numeroDeNotas = 0;

		while (nota != -1) {
			nota = numero.nextDouble();
			if (nota <= 10 && nota >= 0) {
				somaDasNotas += nota; // LEMBRE-SE, estou acrescentando o valor de nota a variável somaDasNotas
				numeroDeNotas++; // LEMBRE-SE INCREMENTO
			}
		}
		numero.close();
		System.out.printf("A média é %.2f", somaDasNotas / numeroDeNotas);
	}
}
*/
public class WhileIndeterminado {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String valor = "";
		while(!valor.equalsIgnoreCase("sair")) { //enquanto não for digitado 'sair' faça...
			System.out.println("Voce diz: ");
			valor = entrada.nextLine();
		}
		entrada.close();
	}
}