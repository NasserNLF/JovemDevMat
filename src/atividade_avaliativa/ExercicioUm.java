package atividade_avaliativa;

import javax.swing.JOptionPane;

public class ExercicioUm {
	public static void main(String[] args) {
		double a = Double.parseDouble(JOptionPane
				.showInputDialog("Programa para resolver uma equação de segundo grau\nPasse o valor de A da equação:"));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Passe o valor de B"));
		double c = Double.parseDouble(JOptionPane.showInputDialog("Passe o valor de C"));

		double raiz = Math.sqrt((b * b) - 4 * a * c);
		double equacao1 = (-b + raiz) / (2 * a);
		double equacao2 = (-b - raiz) / (2 * a);

		JOptionPane.showMessageDialog(null, String.format(
				"Os valores que satisfazem a equação são\nx' = %.2f\nx'' = %.2f\nTodos os resultados foram formatados para possuir apenas 2 casas decimais após a vírgula",
				equacao1, equacao2));

		JOptionPane.showMessageDialog(null, String.format(
				"Os valores que satisfazem a equação são\nx' = %.2f\nx'' = %.2f\nTodos os resultados foram formatados para possuir apenas 2 casas decimais após a vírgula",
				(-b + Math.sqrt((b*b) - 4 * a* c)) / (2 * a), 
				(-b - Math.sqrt((b*b) - 4 * a* c)) / (2 * a)));

	}
}
//package atividade_avaliativa;
//
//import javax.swing.JOptionPane;
//
//public class ExercicioUm {
//    public static void main(String[] args) {
//        double a = Double.parseDouble(JOptionPane.showInputDialog("Programa para resolver uma equação de segundo grau\nPasse o valor de A da equação:"));
//        double b = Double.parseDouble(JOptionPane.showInputDialog("Passe o valor de B"));
//        double c = Double.parseDouble(JOptionPane.showInputDialog("Passe o valor de C"));
//
//        JOptionPane.showMessageDialog(null, String.format(
//                "Os valores que satisfazem a equação são\nx' = %.2f\nx'' = %.2f\nTodos os resultados foram formatados para possuir apenas 2 casas decimais após a vírgula",
//                (-b + Math.sqrt((b * b) - 4 * a * c) / (2 * a)),
//                (-b - Math.sqrt((b * b) - 4 * a * c)) / (2 * a)));
//    }
//}
