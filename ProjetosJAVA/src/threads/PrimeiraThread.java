package threads;

import javax.swing.JOptionPane;

public class PrimeiraThread {

	public static void main(String[] args) {

		new Thread() { // Para se usar a Thread basta chamar o construtor envolvendo em chaves

			public void run() { //No run � onde fica o c�digo da rotina de processo

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
			};
		}.start(); // O START Liga/inicia a thread que fica processando em segundo plano.

		
		// Fluxo normal do sistema, cadastro de venda, emiss�o de nota fiscal, etc.
		JOptionPane.showMessageDialog(null, "Sistema rodando...");

		/**
		 * Sem a Thread, o sistema fica "lento" pois ele executa primeiro o for para
		 * depois mostrar a mensagem na tela. E isso n�o � o correto.
		 */
	}

}
