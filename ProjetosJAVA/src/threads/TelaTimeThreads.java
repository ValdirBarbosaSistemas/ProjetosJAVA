package threads;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThreads extends JDialog {

	private static final long serialVersionUID = 1L;

	// Componentes 01
	private JPanel jPanel = new JPanel(new GridBagLayout()); // Painel de componentes
	private JLabel descricaoHora = new JLabel("Time Thread01");
	private JTextField mostraTempo = new JTextField();

	// Componentes 02
	private JLabel descricaoHora2 = new JLabel("Time Thread02");
	private JTextField mostraTempo2 = new JTextField();

	// Componente de botao
	private JButton jButton = new JButton("Start");
	private JButton jButton2 = new JButton("Stop");

	private Runnable thread1 = new Runnable() {

		@Override
		public void run() {

			while (true) {
				mostraTempo
						.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};

	private Runnable thread2 = new Runnable() {

		@Override
		public void run() {

			while (true) {
				mostraTempo2
						.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};

	private Thread thread1Time;
	private Thread thread2Time;

	// Construtor
	public TelaTimeThreads() {

		setTitle("Minha Tela de Time com Threads");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null); // Diz que a tela ficar� no centro
		setResizable(false); // N�o ir� deixar aumentar a tela

		// GridBagConstraints � o gerenciador de posicionamento e layout do Java
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0; // Come�ando na posi��o zero
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2; // Valor inicial
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);

		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoHora, gridBagConstraints);
		mostraTempo.setPreferredSize(new Dimension(200, 25));
		mostraTempo.setEditable(false);// Colocando o campo de escrita como INATIVO
		gridBagConstraints.gridy++; // Colocando abaixo do gridX
		jPanel.add(mostraTempo, gridBagConstraints);

		add(jPanel, BorderLayout.WEST); // Adicionando o JPanel ao JDIALOG

		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(descricaoHora2, gridBagConstraints);
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		mostraTempo2.setEditable(false);// Colocando o campo de escrita como INATIVO
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
				thread1Time = new Thread(thread1);
				thread1Time.start();

				thread2Time = new Thread(thread2);
				thread2Time.start();
				
				jButton.setEnabled(false);
				jButton2.setEnabled(true);
			}
		});

		jButton2.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				thread1Time.stop();
				thread2Time.stop();

				jButton.setEnabled(true);
				jButton2.setEnabled(false);
				

			}

		});

		setVisible(true); // Ir� ser vis�vel a tela
	}
}
