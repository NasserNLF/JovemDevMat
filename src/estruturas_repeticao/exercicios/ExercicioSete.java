package estruturas_repeticao.exercicios;

import javax.swing.JOptionPane;

public class ExercicioSete {
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro para fazer um cálculo: "));
		double resultado = 0;
		for (double i = 1; i <= n; i++) {
			resultado +=  1 / i;
		}
		JOptionPane.showMessageDialog(null, "A conta 1/1 + 1/2 + ... + 1/n = " + resultado);
	}

}
