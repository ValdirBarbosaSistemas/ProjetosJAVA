package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

		System.out.println("Forma Tradicional...");
		for (String nome : aprovados) {
			System.out.println(nome);
		}

		System.out.println("\nLAMBDA #01...");

		aprovados.forEach((nomes) -> {
			System.out.println(nomes + "!!!");
		});
		/*
		 * OBS: Caso seja apenas um único parâmetro, não é necessário o uso de
		 * parênteses e nem o uso de chaves '{}' como no exemplo abaixo.
		 * "aprovados.forEach(nome -> System.out.println(nome + "!!!")); MAS, LEMBRANDO
		 * QUE FICA A GOSTO DO DESENVOLVEDOR
		 */

		System.out.println("\nSimplificando ainda mais... METHOD REFERENCE");
		aprovados.forEach(System.out::println);
		/*
		 * "Quanto menos código, mais difícil é de se ler quando não se tem experiência"
		 * O que ele ta fazendo é que como só tem um parâmetro ele percorre cada um dos
		 * elementos e voce quer passar cada um dos nomes diretamento como parametro
		 * para o System.out.println nesse caso podemos usar o METHOD REFERENCE. NESTE
		 * CASO O METHOD REFERENCE SÓ FUNCIONA PARA FUNCÕES DE UMA ÚNICA LINHA DE
		 * EXPRESSÃO
		 */

		// Outra forma de fazer o lambda de uma maneira personalizada para imprimir no
		// console
		System.out.println("\nLAMBDA #02...");

		aprovados.forEach((novoNome) -> meuImprimir(novoNome));

		System.out.println("\nSimplificando ainda mais... METHOD REFERENCE #02...");
		aprovados.forEach(Foreach::meuImprimir);

	}

	// Metodo estatico
	static void meuImprimir(String nome) {
		System.out.println("Olá, meu nome é " + nome);
	}
}
