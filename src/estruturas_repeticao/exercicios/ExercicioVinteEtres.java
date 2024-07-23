package estruturas_repeticao.exercicios;

import javax.swing.JOptionPane;

public class ExercicioVinteEtres {
	public static void main(String[] args) {
		int n = 5, x = 0, divisores = 0;
		String frase = "Dos números listados. São números primos:\n";
		for (int i = 0; i < n; i++) {
			x = Integer.parseInt(JOptionPane
					.showInputDialog("Programa de Análise de números primos:\nDigite o número positivo inteiro:"));
			if (x < 0) {
				JOptionPane.showMessageDialog(null, "Número Inválido!\nEle será desconsiderado da análise!");
			} else {
				divisores = 0;
				for (int j = x; j > 0; j--) {
					if (x % j == 0) {
						divisores++;
					}
				}
			}
			if (divisores <= 2) {
				frase += x + "\n";
			}
		}
		JOptionPane.showMessageDialog(null, frase);
	}

}
