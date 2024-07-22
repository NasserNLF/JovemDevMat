package estruturas_repeticao;

import javax.swing.JOptionPane;

public class ExemploDoWhile {
	public static void main(String[] args) {
		double valorOrcamento = Double.parseDouble(JOptionPane.showInputDialog("Valor do orçamento: "));

		// Condição
		do {
			valorOrcamento -= Double.parseDouble(JOptionPane.showInputDialog("Valor gasto:"));
		} while (valorOrcamento > 0);
		JOptionPane.showMessageDialog(null, "Você não pode gastar mais!");

	}
}
