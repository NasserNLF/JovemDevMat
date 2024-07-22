package estruturas_repeticao.exercicios;

import javax.swing.JOptionPane;

public class ExercicioTres {
	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor inteiro: "));
		int resultado = 0;

		for (int i = 1; i < n2; i++) {
			resultado += n1 * n1;
		}
		JOptionPane.showMessageDialog(null, String.format("%d elevado a %d resulta em: %d", n1, n2, resultado));
	}

}
