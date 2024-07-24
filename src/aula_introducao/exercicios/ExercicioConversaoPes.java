package aula_introducao.exercicios;

import javax.swing.JOptionPane;

public class ExercicioConversaoPes {
	public static void main(String[] args) {
		double pes = Double
				.parseDouble(JOptionPane.showInputDialog("Programa de conversão de medidas\nPasse uma medida em pés:"));
		JOptionPane.showMessageDialog(null, "Podemos converter " + pes + " pés em\n" + (pes * 12) + " polegadas,\n "
				+ (pes / 3) + "jardas e em \n" + ((pes / 3) / 1760) + " milhas");

		// Formatação com casas decimais
		JOptionPane.showMessageDialog(null,
				String.format("Conversão com arredondamento de casas decimais %.5f milhas", ((pes / 3) / 1760)));
	}
}
