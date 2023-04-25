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
			 *  a interface Runnable, ele de forma automática
			 *  já implementa o método da thread RUN. E será
			 *  por aqui que colocaremos a nossa tarefa/rotina.
			 */
			
			// Código da rotina que quero executar em segundo plano
			for (int i = 0; i < 10; i++) {
				System.out.println("Executando uma rotina em segundo plano (Envio de EMAIL)");

				//Quando se usa o Thread.sleep, é necessário envolver em um try/catch
				try {
					Thread.sleep(1000);// Execução em 1 segundo
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// Fim do código em segundo plano
			}
		}
	};
	
	private static Runnable thread02 = new Runnable() {
		
		@Override
		public void run() {
		
			/**
			 *  Implementação de outra rotina como exemplo para 
			 *  mostrar como se trabalha com thread paralela ou
			 *  processamento concorrente.
			 */
			
			for (int i = 0; i < 10; i++) {
				System.out.println("Executando uma rotina em segundo plano (Envio de NFCe)");

				//Quando se usa o Thread.sleep, é necessário envolver em um try/catch
				try {
					Thread.sleep(4000);// Execução em 4 segundos
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// Fim do código em segundo plano
			}
		}
	};
	
	public static void main(String[] args) {
		
		/**
		 * Para chamarmos a Thread como objeto, utilizaremos
		 * agora o construtor da thread passando como argumento
		 * a implementação criada logo acima.
		 */
		
		Thread threadEmail = new Thread(thread01);
		threadEmail.start(); //Iniciando a thread
		
		Thread threadNotaFiscal = new Thread(thread02);
		threadNotaFiscal.start();
	}
}
