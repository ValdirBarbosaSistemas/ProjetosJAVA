package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		//Deque e ArrayDeque são declarações para se fazer uma PILHA

		/*
		 * Existe uma diferença ao adicionar elementos em uma pilha no Java. No caso de
		 * pilha existem 2 tipos que no caso são o 'add' e o 'push'. No add quando voce
		 * adiciona elementos em uma pilha de um determinado tamanho (ex. Pilha de
		 * tamanho 100) Se ultrapassar o tamanho ele dá um valor booleano (true ou
		 * false). No caso do push ele retorna um ERRO.
		 */

		livros.add("O pequeno príncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");

		System.out.println(livros.peek());
		// Como estamos lidando com Pilha então neste caso ele retornará o último item
		// da pilha 'LIFO'Os demais métodos são praticamente os mesmos da Fila e Lista

	}
}
