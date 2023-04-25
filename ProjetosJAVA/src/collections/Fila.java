package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		// Na Fila a palavra LinkedList é a declaração da FILA
		
		/*
		 * Existe uma diferença ao adicionar elementos em uma fila no Java. No caso de
		 * fila existem 2 tipos que no caso são o 'add' e o 'offer'. No add quando voce
		 * adiciona elementos em uma fila de um determinado tamanho (ex. Fila de tamanho
		 * 100) Se ultrapassar o tamanho ele dá um erro. No caso do offer ele retorna
		 * true ou false, ou seja, caso ultrapasse o limite da fila ele dá false.
		 */

		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");

		/*
		 * Existem também 2 métodos no Java de pegar um elemento de uma fila. No caso
		 * 'Peek' e o 'element'. No caso do Peek ele pega o primeiro elemento da fila e
		 * não remove e no caso do element também ele pega o primeiro elemento da fila e
		 * não remove. A diferença dos 2 está em relação quando a fila estiver VAZIA. O
		 * Peek ele irá retornar NULO e o element retornará um ERRO.
		 */

		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());

		/*
		 * DEMAIS métodos que são muito parecido com as demais collections fila.size();
		 * fila.clear(); fila.isEmpty(); fila.contains(); entre outros...
		 * 
		 */

		System.out.println(fila.poll()); // Serve para pegar o primeiro elemento da fila e já remove automaticamente
	}
}
