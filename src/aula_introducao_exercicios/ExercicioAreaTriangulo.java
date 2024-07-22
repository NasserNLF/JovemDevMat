package aula_introducao_exercicios;

import javax.swing.JOptionPane;

public class ExercicioAreaTriangulo {
	public static void main(String[] args) {
		double base = Double
				.parseDouble(JOptionPane.showInputDialog("Calculando área de um triângulo\nMedida da base? (m)"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Medida da altura? (m)"));
		JOptionPane.showMessageDialog(null, "A área do triângulo é igual a " + ((base * altura) / 2) + " metros");

	}
}
