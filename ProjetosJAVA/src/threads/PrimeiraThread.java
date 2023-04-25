package threads;

import javax.swing.JOptionPane;

public class PrimeiraThread {

	public static void main(String[] args) {

		new Thread() { // Para se usar a Thread basta chamar o construtor envolvendo em chaves

			public void run() { //No run é onde fica o código da rotina de processo

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
			};
		}.start(); // O START Liga/inicia a thread que fica processando em segundo plano.

		
		// Fluxo normal do sistema, cadastro de venda, emissão de nota fiscal, etc.
		JOptionPane.showMessageDialog(null, "Sistema rodando...");

		/**
		 * Sem a Thread, o sistema fica "lento" pois ele executa primeiro o for para
		 * depois mostrar a mensagem na tela. E isso não é o correto.
		 */
	}

}
