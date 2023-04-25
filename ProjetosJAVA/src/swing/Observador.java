package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {
	public static void main(String[] args) {
		JFrame janela = new JFrame("Observador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		/*
		 * Dessa maneira ele fecha a janela com o clique do mouse, pois POR PADRÃO teria
		 * que implementar
		 */

		janela.setSize(600, 200);
		// Tamanho da tela

		// Criação do botão
		JButton botao = new JButton("Clicar");
		janela.add(botao); // Adicionou o botão na tela

		janela.setVisible(true);// Janela agora aparece quando executado

		janela.setLayout(new FlowLayout()); // Visibilidade do botão em cima da janela

		janela.setLocationRelativeTo(null); // Centraliza a tela como base pelo computador

		/*
		 * botao.addActionListener(new ActionListener() { // Adicionando ação no botão O
		 * 'ActionListener' é uma interface funcional, ou seja, ele cria uma CLASSE
		 * ANÔNIMA devido a não poder instanciar uma interface funcional no java.
		 * 
		 * @Override public void actionPerformed(ActionEvent e) {
		 * System.out.println("Evento ocorreu aqui!"); } });
		 */

		// MANEIRA CORRETA
		botao.addActionListener(e -> {
			System.out.println("Ocorreu um evento aqui!!!");
		});

	}
}
