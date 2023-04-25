package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Maps {
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();
		/*
		 * A declaracao de MAP se faz desse modo (Ex. Codigo do usuário e o nome do
		 * usuário), ou seja, a questão de 'chave/valor'
		 */

		/*
		 * No map não temos o método add (adicionar), ou seja, para adicionar o elemento
		 * no map teríamos que utilizar o PUT e os elementos declarados
		 */
		usuarios.put(1, "Roberto"); // Adicionando elementos

		/*
		 * A diferença entre o PUT e o ADD é que no PUT voce adiciona na primeira vez e
		 * quando for na SEGUNDA VEZ ele SUBSTITUI O VALOR
		 */
		usuarios.put(1, "Adriana");
		usuarios.put(2, "Aline");
		usuarios.put(3, "Ricardo");

		System.out.println(usuarios.size());
		// Neste caso ele só irá mostrar o tamanho 1 do elemento, pois como ele
		// substituiu acontece isso
		System.out.println(usuarios.keySet()); // Irá retornar a quantidade de chaves que existe
		System.out.println(usuarios.values()); // Irá retornar a quantidade de valores que existe
		System.out.println(usuarios.entrySet()); // Irá retornar a quantidade de CHAVE E VALOR que existe

		System.out.println(usuarios.get(1)); // Irá pegar o conteúdo da chave

		for (int chave : usuarios.keySet()) {
			System.out.println(chave);
			// Irá percorrer todas as chaves
		}

		for (String valor : usuarios.values()) {
			System.out.println(valor);
			// Irá percorrer todos os valores
		}

		for (Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.print(registro.getKey());
			System.out.println(registro.getValue());
		}
	} // Irá percorrer TODAS AS CHAVE/VALOR dos elementos
}
