package br.com.cursoemvideo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperadorLogico {

	private JFrame frame;
	private JTextField txtAno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperadorLogico window = new OperadorLogico();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OperadorLogico() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ano de nascimento");
		lblNewLabel.setBounds(24, 11, 117, 14);
		frame.getContentPane().add(lblNewLabel);
		
		txtAno = new JTextField();
		txtAno.setBounds(165, 8, 86, 20);
		frame.getContentPane().add(txtAno);
		txtAno.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular idade");
		
		btnNewButton.setBounds(89, 58, 117, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Idade");
		lblNewLabel_1.setBounds(24, 103, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Situacao");
		lblNewLabel_2.setBounds(24, 128, 71, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblIdade = new JLabel("0");
		lblIdade.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIdade.setBounds(205, 103, 46, 14);
		frame.getContentPane().add(lblIdade);
		
		JLabel lblSituacao = new JLabel("<vazio>");
		lblSituacao.setBounds(148, 128, 103, 14);
		frame.getContentPane().add(lblSituacao);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int ano=Integer.parseInt(txtAno.getText());
				int idade=2021-ano;
				lblIdade.setText(Integer.toString(idade));
				String situacao=(idade>=18)?"maior de idade":"menor de idade";
				lblSituacao.setText(situacao);
			}
		});
	}
}
