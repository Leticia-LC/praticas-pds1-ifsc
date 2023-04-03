package ex3;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {


	private JPanel pane;
	private JTextField textProfessor;
	private JTextField textAluno;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}



	public Janela() {
		ArrayList<String> professores = new ArrayList<>();
		ArrayList<String> alunos = new ArrayList<>();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 127);
		pane = new JPanel();
		pane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(pane);
		pane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Professor: ");
		
		lblNewLabel.setBounds(10, 11, 46, 14);
		pane.add(lblNewLabel);
		
		textProfessor = new JTextField();
		textProfessor.setBounds(66, 8, 86, 20);
		pane.add(textProfessor);
		textProfessor.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Aluno: ");
		
		lblNewLabel_1.setBounds(10, 50, 46, 14);
		pane.add(lblNewLabel_1);
		
		textAluno = new JTextField();
		textAluno.setBounds(66, 47, 86, 20);
		pane.add(textAluno);
		textAluno.setColumns(10);
		
		JButton aluno = new JButton("Cadastrar");
		aluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String p1 = textAluno.getText();
				alunos.add(p1);
			}
		});
		aluno.setBounds(174, 46, 104, 23);
		pane.add(aluno);
		
		JButton prof = new JButton("Cadastrar");
		
		prof.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String p1 = textProfessor.getText();
				professores.add(p1);
			}
		});
		prof.setBounds(174, 7, 104, 23);
		pane.add(prof);
		
		JButton exibirProf = new JButton("Exibir");
		
		exibirProf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, professores);
			}
		});
		exibirProf.setBounds(288, 7, 104, 23);
		pane.add(exibirProf);
		
		JButton exibirAluno = new JButton("Exibir");
		
		exibirAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, alunos);
			}
		});
		exibirAluno.setBounds(288, 46, 104, 23);
		pane.add(exibirAluno);
	}

}
