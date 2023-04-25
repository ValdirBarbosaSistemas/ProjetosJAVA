package streamAPI;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimirObjetos {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("João", "Maria", "José");

		// Forma padrão de fazer o FOR
		for (int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}

		// ForEach
		for (String nome : aprovados) {
			System.out.println(nome);
		}

		// Forma de fazer com Iterator
		/*
		 * O Iterator é uma interface do java que tem dois métodos, ele tem um método
		 * que retorna verdadeiro ou falso ou seja, "Tem próximo? (hasNext)" se tiver,
		 * ele manda o próximo elemento, caso não ele para.
		 */
		System.out.println("Modo Iterator...");
		Iterator<String> it = aprovados.iterator();
		while (it.hasNext()) { // Tem próximo? caso verdadeiro ele dá o próximo elemento
			System.out.println(it.next()); // Me dê o próximo, caso não tenha ele sai do laço
		}

		// Modo com StreamAPI

		/*
		 * Uma stream também é uma Interface e também um conjunto de objetos. Algumas
		 * funcionalidades ocorre de forma interna, como por exemplo, percorrer uma
		 * variável, somar, etc.
		 */
		System.out.println("Modo StreamAPI...");
		Stream<String> st = aprovados.stream();// Declaraçaõ da Stream do tipo String
		st.forEach(System.out::println); // Laço interno ou operação interna
	}
}