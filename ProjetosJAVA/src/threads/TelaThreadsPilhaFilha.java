package threads;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaThreadsPilhaFilha extends JDialog {
			
	private static final long serialVersionUID = 1L;

	// Componentes 01
	private JPanel jPanel = new JPanel(new GridBagLayout()); // Painel de componentes
	private JLabel descricaoHora = new JLabel("Nome");
	private JTextField mostraTempo = new JTextField();

	// Componentes 02
	private JLabel descricaoHora2 = new JLabel("Email");
	private JTextField mostraTempo2 = new JTextField();

	// Componente de botao
	private JButton jButton = new JButton("Adicionar");
	private JButton jButton2 = new JButton("Stop");

	//Quando a tela for executada, a implementacao da fila vai vir junto	
	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();
	
	
	// Construtor
	public TelaThreadsPilhaFilha() {

		setTitle("Minha Tela de Threads Pilha/Fila");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null); // Diz que a tela ficara no centro
		setResizable(false); // Nao ira deixar aumentar a tela

		// GridBagConstraints e o gerenciador de posicionamento e layout do Java
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0; // Comecando na posicao zero
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2; // Valor inicial
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);

		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoHora, gridBagConstraints);
		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++; // Colocando abaixo do gridX
		jPanel.add(mostraTempo, gridBagConstraints);

		add(jPanel, BorderLayout.WEST); // Adicionando o JPanel ao JDIALOG

		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(descricaoHora2, gridBagConstraints);
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(mostraTempo2, gridBagConstraints);

		gridBagConstraints.gridwidth = 1;

		jButton.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy++;
		jPanel.add(jButton, gridBagConstraints);

		jButton2.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx++;
		jPanel.add(jButton2, gridBagConstraints);

		// Adicionando a ação no botão start
		jButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) { // Executa o clique do botao
				for (int i = 0; i <= 100; i++) {
				//Aqui esta simulando um envio para 100 pessoas	
					ObjetoFilaThread filaThread = new ObjetoFilaThread();
					filaThread.setNome(mostraTempo.getText());
					filaThread.setEmail(mostraTempo2.getText());
					
					fila.add(filaThread);
				}
			}
		});

		jButton2.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				fila.stop();
				fila = null;
			}

		});

		fila.start();
		setVisible(true); // Ira ser visivel a tela
	}
	
}
