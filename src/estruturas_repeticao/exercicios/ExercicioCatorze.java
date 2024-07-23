package estruturas_repeticao.exercicios;

import javax.swing.JOptionPane;

public class ExercicioCatorze {
	public static void main(String[] args) {
		String nome = JOptionPane
				.showInputDialog("Programa para a análise de médias!\nDigite o nome do primeiro aluno:");
		String nomeMelhorAluno = nome;
		double media = Double.parseDouble(JOptionPane.showInputDialog("Digite a média do aluno: "));
		double mediaMelhorAluno = media;
		int op = 0;

		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("1) Cadastro de novo aluno\n2) Resultados"));

			switch (op) {
			case 1:
				nome = JOptionPane.showInputDialog("Nome do aluno: ");
				media = Double.parseDouble(JOptionPane.showInputDialog("Média do aluno: "));

				if (media > mediaMelhorAluno) {
					nomeMelhorAluno = nome;
					mediaMelhorAluno = media;
				}
			case 2:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida!");
			}

		} while (op != 2);
		JOptionPane.showMessageDialog(null, String.format("O aluno com a maior média é %s com %.2f", nomeMelhorAluno, mediaMelhorAluno ));
	}

}
