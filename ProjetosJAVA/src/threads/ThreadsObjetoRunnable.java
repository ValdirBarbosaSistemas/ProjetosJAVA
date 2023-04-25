package threads;

public class ThreadsObjetoRunnable {
	
	/**
	 * Para podermos utilizar a Thread como objeto, teremos que usar a Interface
	 * Runnable para colocarmos as nossas tarefas e podermos utilizar o thread como
	 * objeto. Vejamos no exemplo abaixo.
	 * 
	 */
	
	private static Runnable thread01 = new Runnable() {
		
		@Override
		public void run() {
			/**
			 *  Como podemos observar, quando instanciamos
			 *  a interface Runnable, ele de forma autom�tica
			 *  j� implementa o m�todo da thread RUN. E ser�
			 *  por aqui que colocaremos a nossa tarefa/rotina.
			 */
			
			// C�digo da rotina que quero executar em segundo plano
			for (int i = 0; i < 10; i++) {
				System.out.println("Executando uma rotina em segundo plano (Envio de EMAIL)");

				//Quando se usa o Thread.sleep, � necess�rio envolver em um try/catch
				try {
					Thread.sleep(1000);// Execu��o em 1 segundo
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// Fim do c�digo em segundo plano
			}
		}
	};
	
	private static Runnable thread02 = new Runnable() {
		
		@Override
		public void run() {
		
			/**
			 *  Implementa��o de outra rotina como exemplo para 
			 *  mostrar como se trabalha com thread paralela ou
			 *  processamento concorrente.
			 */
			
			for (int i = 0; i < 10; i++) {
				System.out.println("Executando uma rotina em segundo plano (Envio de NFCe)");

				//Quando se usa o Thread.sleep, � necess�rio envolver em um try/catch
				try {
					Thread.sleep(4000);// Execu��o em 4 segundos
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// Fim do c�digo em segundo plano
			}
		}
	};
	
	public static void main(String[] args) {
		
		/**
		 * Para chamarmos a Thread como objeto, utilizaremos
		 * agora o construtor da thread passando como argumento
		 * a implementa��o criada logo acima.
		 */
		
		Thread threadEmail = new Thread(thread01);
		threadEmail.start(); //Iniciando a thread
		
		Thread threadNotaFiscal = new Thread(thread02);
		threadNotaFiscal.start();
	}
}
