package ex2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Exercicio2 extends JFrame {

	private JPanel pane;
	private JTextField textNumero;
	private JTextField textMaior;
	private JTextField textMenor;
	private JButton exibir;

	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					Exercicio2 frame = new Exercicio2();
					frame.setVisible(true);
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Exercicio2() {
		ArrayList<Double> numero = new ArrayList<>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		pane = new JPanel();
		pane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(pane);
		pane.setLayout(null);
		
		textNumero = new JTextField();
		textNumero.setBounds(93, 11, 86, 20);
		pane.add(textNumero);
		textNumero.setColumns(10);
		
		textMaior = new JTextField();
		textMaior.setEditable(false);
		textMaior.setBounds(93, 64, 86, 20);
		pane.add(textMaior);
		textMaior.setColumns(10);
		
		textMenor = new JTextField();
		textMenor.setEditable(false);
		textMenor.setBounds(93, 113, 86, 20);
		pane.add(textMenor);
		textMenor.setColumns(10);
		
		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double n1 = Double.valueOf(textNumero.getText());
				
				numero.add(n1);
			}
		});
		btnCadastrar.setBounds(82, 158, 101, 23);
		pane.add(btnCadastrar);
		
		JLabel lblNewLabel = new JLabel("Número: ");
		lblNewLabel.setBounds(10, 14, 46, 14);
		pane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Maior: ");
		lblNewLabel_1.setBounds(10, 67, 46, 14);
		pane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Menor: ");
		lblNewLabel_2.setBounds(10, 116, 46, 14);
		pane.add(lblNewLabel_2);
		
		exibir = new JButton("Exibir");
		exibir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double menor = Double.MAX_VALUE;
				Double maior = Double.MIN_VALUE;
				
				for (int i = 0; i < numero.size(); i++) {
					if(numero.get(i) > maior) {
						maior = numero.get(i);
					}
					if(numero.get(i)<menor) {
						menor = numero.get(i);
					}
				}
				
				textMaior.setText(String.valueOf(maior));
				textMenor.setText(String.valueOf(menor));
			}
		});
		exibir.setBounds(82, 195, 101, 23);
		pane.add(exibir);
	}

}

