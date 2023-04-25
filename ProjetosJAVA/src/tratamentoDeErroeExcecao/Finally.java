package tratamentoDeErroeExcecao;

import java.util.Scanner;

public class Finally {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		try {
			System.out.println(7 / entrada.nextInt());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally...");
			entrada.close();
			/*
			 * O Finally serve para executar qualquer coisa mesmo gerando o erro. Ele tem
			 * essa finalidade de executar o programa independentemente de qualquer coisa.
			 * Inclusive ele pode até ser chamado SEM O CATCH.
			 */
		}
		System.out.println("Fim do programa!");
	}
}
