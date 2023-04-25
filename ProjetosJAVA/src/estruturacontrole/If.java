package estruturacontrole;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1, n2;
		System.out.print("Digite a primeira nota: ");
		n1 = entrada.nextInt();
		System.out.print("Digite a segunda nota: ");
		n2 = entrada.nextInt();
		double media = (n1 + n2) / 2;
		if (media <= 10 && media >= 7) {
			System.out.print("Aluno APROVADO!!!");
		}
		entrada.close();
	}
}