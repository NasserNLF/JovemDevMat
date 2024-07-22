package estruturas_repeticao.exercicios;

import javax.swing.JOptionPane;

public class ExercicioQuatro {
	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro:"));
		int resultado = 1;

		for (int i = n1; i > 0; i--) {
			resultado *= i;
		}
		JOptionPane.showMessageDialog(null, "O fatorial do número inserido é igual a " + resultado);
	}

}
