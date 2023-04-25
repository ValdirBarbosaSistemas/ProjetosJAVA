package estruturacontrole;

import java.util.Scanner;

public class WhileDeterminado {
	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		double somaDasNotas = 0;
		double nota = 0;
		int cont = 0; //contador para incremento até sair do laço
		
		while (cont < 3) {
			nota = numero.nextDouble();
			somaDasNotas += nota;
			cont++; // se a variável nao for incrementada, ela vai ficar em loop infinito
		}
		numero.close();
		System.out.printf("A soma é %.2f", somaDasNotas / 3);
	}
}
