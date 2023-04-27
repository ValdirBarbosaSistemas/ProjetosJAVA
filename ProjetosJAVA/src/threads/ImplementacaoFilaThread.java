package threads;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<>();

	/**
	 * Em Threads, se usa também collections para armazenar dados em uma thread. No
	 * código acima vemos que o 'ConcurrentLinkedQueue' é uma collection para
	 * armazenar threads em uma fila.
	 */

	// metodo para adicionar os objetos
	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}

	@Override
	public void run() {

		while (true) {

			synchronized (pilha_fila) { // Serve para 'Bloquear' o acesso a esta lista por outros processos
				Iterator<ObjetoFilaThread> iteracao = pilha_fila.iterator(); // Fazendo iteracao com os objetos para
				// serem adicionados na pilha
				
				while (iteracao.hasNext()) { // Enquanto conter dados na lista irá processar

					ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();

					/*
					 * System.out.println(processar.getEmail());
					 * System.out.println(processar.getNome());
					 */
					
					iteracao.remove();
					
					try {
						Thread.sleep(1000);// Dar tempo para uma descarga de memória
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {// Processou toda lista? Dá um tempo para limpeza de memória
				e.printStackTrace();
			}
		}
	}

}