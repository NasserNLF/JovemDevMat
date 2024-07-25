package estruturas_repeticao.exercicios;

import javax.swing.JOptionPane;

public class ExercicioDoze {
	public static void main(String[] args) {
		int op = 0, idade = 0, tubaronenses = 0, jaguarunenses = 0, menoresDe17 = 0;
		String cidade = "";
		do {
			op = Integer.parseInt(JOptionPane
					.showInputDialog("Programa de cadastro de alunos\n1) Cadastro de aluno\n2) Relatório final"));
			switch (op) {
			case 1:
				@SuppressWarnings("unused")
				String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
				cidade = JOptionPane.showInputDialog("Digite a cidade do aluno").toUpperCase();
				idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno"));

				// Verificação das cidades
				if (cidade.equals("TUBARÃO")) {
					tubaronenses++;
				} else if (cidade.equals("JAGUARUNA")) {
					jaguarunenses++;
				}

				// Verificação de idades
				if (idade < 17) {
					menoresDe17++;
				}
				break;
			case 2:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida!");
			}
		} while (op != 2);
		JOptionPane.showMessageDialog(null,
				String.format(
						"a) Quantidade de alunos que moram em TUBARÃO: %d\n"
								+ "b) Quantidade de alunos que moram em JAGUARUNA: %d\n"
								+ "c) Quantidade de alunos que possuem menos de 17 anos: %d",
						tubaronenses, jaguarunenses, menoresDe17));
	}
}
