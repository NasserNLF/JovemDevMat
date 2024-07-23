package estruturas_repeticao.exercicios;

import javax.swing.JOptionPane;

public class ExercicioDez {
	public static void main(String[] args) {
		int op = 0, generoMasculino = 0, generoFeminino = 0;
		String frase = "Relação Final:\n";
		char genero = 'N';
		do {
			op = Integer.parseInt(JOptionPane
					.showInputDialog("Programa para cálculo de genêros na sala de aula\n1) Cadastrar\n2) Resultados"));
			switch (op) {
			case 1:
				frase += JOptionPane.showInputDialog("Nome do aluno(a): ") + " Genêro: ";
				genero = JOptionPane.showInputDialog("Genero do aluno(a):").toUpperCase().charAt(0);
				switch (genero) {
				case 'M':
					frase += "Masculino\n";
					generoMasculino++;
					break;
				case 'F':
					frase += "Feminino\n";
					generoFeminino++;
					break;
				default:
					frase += "Não definido\n";
					JOptionPane.showMessageDialog(null, "Genêro indefinido!");
					break;
				}
			case 2:
				break;

			}

		} while (op != 2);
		JOptionPane.showMessageDialog(null, frase + "Total:\nGenêro Masculino: " + generoMasculino + "\nGenêro Feminino: " + generoFeminino);
	}
}
