package aula_introducao;

import javax.swing.JOptionPane;

public class ExemploEntradaSaidaJoptionPane {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Qual o seu nome?");
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu peso?"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Qual a sua altura?"));
		double imc = peso / (altura * altura);
		String msg = nome + "\nSeu IMC é de " + imc; 
		JOptionPane.showMessageDialog(null, msg);
	}

}
