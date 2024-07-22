package estruturas_repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {
	public static void main(String[] args) {
		for (int i = 0; i < 160; i += 2) {
			// Essa saída de dados coloca os dados na mesma linha
			System.out.print(i + " ");
		}

		// Apenas para pular a linha
		System.out.println("");

		for (int i = 20; i > 0; i--) {
			System.out.print(i + " ");
		}

		// Apenas para pular a linha
		System.out.println();

		int pontoInicial = Integer.parseInt(JOptionPane.showInputDialog("Início do Loop: "));
		int pontoFinal = Integer.parseInt(JOptionPane.showInputDialog("Fim do Loop: "));

		if (pontoInicial < pontoFinal) {
			for (int i = pontoInicial; i < pontoFinal; i++) {
				System.out.print(i + " ");
			}
		} else {
			for (int i = pontoInicial; i > pontoFinal; i--) {
				System.out.print(i + " ");
			}
		}
	}

}
