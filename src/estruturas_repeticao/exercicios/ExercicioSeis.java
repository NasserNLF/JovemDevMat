package estruturas_repeticao.exercicios;

import javax.swing.JOptionPane;

public class ExercicioSeis {
	public static void main(String[] args) {
		String nomes = "";
		int idades = 0, numeroDePessoas = 0, op = 0;

		do {
			op = Integer.parseInt(JOptionPane
					.showInputDialog("Programa de Cálculo de Idade!\n1) Inserir Nova Pessoa\n2) Resultados\nOpção:"));
			switch (op) {
			case 1:
				nomes += JOptionPane.showInputDialog("Insira o nome da Pessoa: ") + ", ";
				idades += Integer.parseInt(JOptionPane.showInputDialog("Insira a idade da pessoa: "));
				numeroDePessoas++;
				break;
			case 2:
				JOptionPane.showMessageDialog(null,
						String.format("O cálculo das idades de %s é igual a %d\nE a média delas é igual a %f", nomes,
								idades, (idades / (double) numeroDePessoas)));
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida!\nReiniciando o programa!");
				break;
			}
		} while (op != 2);
	}

}
