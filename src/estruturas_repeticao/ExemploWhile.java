package estruturas_repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {
	public static void main(String[] args) {
		double valorOrcamento = Double.parseDouble(JOptionPane.showInputDialog("Valor do orçamento: "));
		double valorGasto = 0;

		// Condição
		while (valorOrcamento > valorGasto) {
			valorOrcamento -= Double.parseDouble(JOptionPane.showInputDialog("Valor gasto:"));
		}
		JOptionPane.showMessageDialog(null, "Você não pode gastar mais!");

	}

}
