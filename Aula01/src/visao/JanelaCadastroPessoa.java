package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.FuncionarioDAO;
import modelo.Funcionario;

import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;

public class JanelaCadastroPessoa extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField textoCPF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCadastroPessoa frame = new JanelaCadastroPessoa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JanelaCadastroPessoa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 380, 239);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(8, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(140, 152, 89, 23);
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				String cpf = textoCPF.getText();
				
				if(nome.isEmpty()) {
					JOptionPane.showMessageDialog(null,"Nenhum nome preenchido!");
				}
				if(cpf.isEmpty()) {
					JOptionPane.showMessageDialog(null,"Nenhum cpf preenchido!");
				}
				
				Funcionario func = new Funcionario();
				func.setNome(nome);
				func.setCpf(Long.valueOf(cpf));
				
				FuncionarioDAO banquinhoDeDados = FuncionarioDAO.getInstancia();
				bdPessoa.inserir(func);
				
				
				
				
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnSalvar);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(99, 52, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setText("Letícia L. da Cunha");
		txtNome.setBounds(140, 49, 105, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("CPF:");
		lblNewLabel_2.setBounds(107, 93, 23, 14);
		contentPane.add(lblNewLabel_2);
		
		textoCPF = new JTextField();
		textoCPF.setText("106.479.279-00");
		textoCPF.setBounds(140, 90, 105, 20);
		contentPane.add(textoCPF);
		textoCPF.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Aceito os termos");
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setBackground(new Color(204, 255, 255));
		chckbxNewCheckBox.setBounds(137, 117, 105, 23);
		contentPane.add(chckbxNewCheckBox);
	}
}
