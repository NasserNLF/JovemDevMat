package estruturas_repeticao.exercicios;

import javax.swing.JOptionPane;

public class ExercicioOnze {
	public static void main(String[] args) {
		double real = Double.parseDouble(JOptionPane.showInputDialog("Digite qualquer valor: "));
		double menorValor = real;

		do {
			real = Double.parseDouble(
					JOptionPane.showInputDialog("Digite qualquer outro valor:\n(Para encerrar digite 9999)"));
			if (real < menorValor) {
				menorValor = real;
			}
		} while (real != 9999);
		JOptionPane.showMessageDialog(null, "O menor valor digitado foi: " + menorValor);
	}
}
