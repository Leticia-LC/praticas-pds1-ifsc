package ex1;

import javax.swing.JOptionPane;


public class Exercício1 {
	
	public static void main(String[] args) {

		double totalPagamento;

		double precoLitro = Double.valueOf (JOptionPane.showInputDialog (" valor do preço do litro:"));
		Integer quantidadeLitros = Integer.valueOf (JOptionPane.showInputDialog ("quantidade de litros:"));

		totalPagamento = precoLitro*quantidadeLitros;


		JOptionPane.showInputDialog ("total pagamento:" ,totalPagamento);
		}
		}
