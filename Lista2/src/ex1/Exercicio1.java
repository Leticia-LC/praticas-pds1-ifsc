package ex1;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Exercicio1 extends JFrame {

	private JPanel pane;
	private JTextField text1;
	private JTextField text2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio1 frame = new Exercicio1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Exercicio1() {
		ArrayList<Double> num = new ArrayList<>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		pane = new JPanel();
		pane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(pane);
		pane.setLayout(null);
		
		text1 = new JTextField();
		text1.setBounds(96, 11, 86, 20);
		pane.add(text1);
		text1.setColumns(10);
		
		text2 = new JTextField();
		text2.setEditable(false);
		text2.setColumns(10);
		text2.setBounds(96, 60, 86, 20);
		pane.add(text2);
		
		JLabel lblNewLabel = new JLabel("Números: ");
		lblNewLabel.setBounds(28, 14, 46, 14);
		pane.add(lblNewLabel);
		
		JLabel lblResultado = new JLabel("Resultado: ");
		lblResultado.setBounds(28, 63, 58, 14);
		pane.add(lblResultado);
		
		JButton cadastrar = new JButton("Cadastrar");
		cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double n1 = Double.valueOf(text1.getText());
				
				num.add(n1);
			}
		});
		cadastrar.setBounds(91, 110, 101, 23);
		pane.add(cadastrar);
		
		JButton exibir = new JButton("Exibir");
		exibir.addActionListener(new ActionListener() { 
			
			public void actionPerformed(ActionEvent e) {
				
				Integer cont = 0;
				for(int i = 0; i < num.size(); i++) {
					if(num.get(i) %2 == 0) {
						cont++;
					}
				}
				
				text2.setText(String.valueOf(cont));
				
			}
		});
		exibir.setBounds(91, 144, 101, 23);
		pane.add(exibir);
	}
}

