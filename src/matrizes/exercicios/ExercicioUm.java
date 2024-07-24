package matrizes.exercicios;

import javax.swing.JOptionPane;

public class ExercicioUm {
	public static void main(String[] args) {
		int op = 0, qtdAlunos = 0, qtdProvas = 0;
		double somaNotas = 0;
		String menu = "Menu Inicial!\n" + "1 - Cadastrar alunos e notas\n"
				+ "2 - Listar todos os alunos, médias e situações\n" + "3 - Buscar aluno específico\n"
				+ "4 - Listar alunos aprovados\n" + "5 - Listar alunos em recuperação\n"
				+ "6 - Listas alunos reprovados\n" + "7 - Sair";

		double[][] notas = new double[10][10];
		String[] nomes = new String[10];

		// TESTES
//		nomes[0] = "NASSER";
//		nomes[1] = "LETICIA";
//		nomes[2] = "JOSÉ";
//		nomes[3] = "MARIA";
//		nomes[4] = "LUCAS";
//		nomes[5] = "MATHEUS";
//
//		notas[0][0] = 10;
//		notas[0][1] = 9;
//		notas[1][0] = 10;
//		notas[1][1] = 8;
//		notas[2][0] = 5;
//		notas[2][1] = 7;
//		notas[3][0] = 7;
//		notas[3][1] = 5;
//		notas[4][0] = 2;
//		notas[4][1] = 1;
//		notas[5][0] = 3;
//		notas[5][1] = 1;
//		
//		qtdAlunos = 6;
//		qtdProvas = 2;

		do {
			String fraseAux = "";
			String relatorio = "RELATÓRIO:\n\n";
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			// Opções
			switch (op) {
			case 1:
				if (qtdAlunos == 0) {
					qtdProvas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de provas feitas pela turma?"));
					// Declaração de matrizes
					notas = new double[++qtdAlunos][qtdProvas];
					nomes = new String[qtdAlunos];
					nomes[--qtdAlunos] = JOptionPane.showInputDialog("Nome do aluno: (9999 para parar)");
					if (!nomes[qtdAlunos].equals("9999")) {
						for (int j = 0; j < notas[qtdAlunos].length; j++) {
							notas[qtdAlunos][j] = Double.parseDouble(JOptionPane.showInputDialog(("Nota "+ (j+1) + ":")));
						}
					}
					}else{
						notas = new double[qtdAlunos][qtdProvas];
						nomes[qtdAlunos] = JOptionPane.showInputDialog("Nome do aluno: (9999 para parar)");
						if (!nomes[qtdAlunos].equals("9999")) {
							qtdAlunos++;
							notas = new double[qtdAlunos][qtdProvas];
							for (int j = 0; j < notas[qtdAlunos].length; j++) {
								notas[qtdAlunos][j] = Double
										.parseDouble(JOptionPane.showInputDialog(("Nota " + (j + 1) + ":")));
							}
						}else {
							notas = new double[--qtdAlunos][qtdProvas];
						}
					}
					break;
				
				
				
//				qtdAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de alunos na sala:"));
//				qtdProvas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Provas: "));
//
//				// Declaração de matrizes
//				notas = new double[qtdAlunos][qtdProvas];
//
//				// Declaração de vetores
//				nomes = new String[qtdAlunos];
//
//				// Cadastro aluno e notas
//				for (int i = 0; i < notas.length; i++) {
//					nomes[i] = JOptionPane.showInputDialog("Nome do aluno " + (i + 1) + ":").toUpperCase();
//					for (int j = 0; j < notas[i].length; j++) {
//						notas[i][j] = Double.parseDouble(JOptionPane
//								.showInputDialog("Nota da Prova " + (j + 1) + " feita por " + nomes[i] + ":"));
//					}
//				}
//				break;
			case 2:
				// Verificação se já algo cadastrado
				if (qtdAlunos == 0 && qtdProvas == 0) {
					JOptionPane.showMessageDialog(null, "Cadastre primeiro os alunos!");
				} else {
					// Listagem de todos os alunos
					for (int i = 0; i < notas.length; i++) {
						somaNotas = 0;
						fraseAux = "\n";
						fraseAux += "Aluno: " + nomes[i];
						for (int j = 0; j < notas[i].length; j++) {
							somaNotas += notas[i][j];
						}
						// Média
						fraseAux += String.format("\nMédia: %.2f", (somaNotas / qtdProvas));

						// Situação
						if (somaNotas / (double) qtdProvas >= 7) {
							fraseAux += "\nSituação: Aprovado";
						} else if (somaNotas / (double) qtdProvas < 7 && somaNotas / qtdProvas > 3) {
							fraseAux += "\nSituação: Em recuperação";
						} else {
							fraseAux += "\nSituação: Reprovado";
						}

						// Montagem do relatório
						relatorio += fraseAux;
					}
					// Mostrando o relatório
					JOptionPane.showMessageDialog(null, relatorio);
				}
				break;
			case 3:
				// Verificação se já algo cadastrado
				if (qtdAlunos == 0 && qtdProvas == 0) {
					JOptionPane.showMessageDialog(null, "Cadastre primeiro os alunos!");
				} else {
					relatorio = "Não encontrado!";
					int pos = 0;
					somaNotas = 0;
					String buscaNome = JOptionPane.showInputDialog("Nome do aluno que você deseja buscar: ")
							.toUpperCase();

					// Loop até achar o aluno
					do {
						if (buscaNome.equals(nomes[pos])) {
							relatorio = "Aluno encontrado!\n\n";
							for (int j = 0; j < notas[pos].length; j++) {
								somaNotas += notas[pos][j];
							}
							// Média
							relatorio += String.format("Média: %.2f", somaNotas / qtdProvas);

							// Situação
							if (somaNotas / (double) qtdProvas >= 7) {
								relatorio += "\nSituação: Aprovado";
							} else if (somaNotas / (double) qtdProvas < 7 && somaNotas / qtdProvas > 3) {
								relatorio += "\nSituação: Em recuperação";
							} else {
								relatorio += "\nSituação: Reprovado";
							}
						}
						pos++;
					} while (relatorio.equals("Não encontrado!") && pos < qtdAlunos);
					JOptionPane.showMessageDialog(null, relatorio);
				}
				break;
			case 4:
				// Verificação se já tem algo cadastrado
				if (qtdAlunos == 0 && qtdProvas == 0) {
					JOptionPane.showMessageDialog(null, "Cadastre primeiro os alunos!");
				} else {
					relatorio += "APROVADOS:\n\n";
					// Passando por todas as notas e seleção dos alunos
					for (int i = 0; i < notas.length; i++) {
						somaNotas = 0;
						for (int j = 0; j < notas[i].length; j++) {
							somaNotas += notas[i][j];
						}
						if (somaNotas / qtdProvas >= 7) {
							relatorio += nomes[i] + "\n";
						}
					}
					// Verificação se houve algum aluno que satifez a condição
					if (relatorio.equals("RELATÓRIO:\n\nAPROVADOS:\n\n")) {
						JOptionPane.showMessageDialog(null, "Não houve APROVADOS!");
					} else {
						JOptionPane.showMessageDialog(null, relatorio);
					}
				}
				break;
			case 5:
				// Verificação se já tem algo cadastrado
				if (qtdAlunos == 0 && qtdProvas == 0) {
					JOptionPane.showMessageDialog(null, "Cadastre primeiro os alunos!");
				} else {
					relatorio += "EM RECUPERAÇÃO:\n\n";
					// Passando por todas as notas e seleção dos alunos
					for (int i = 0; i < notas.length; i++) {
						somaNotas = 0;
						for (int j = 0; j < notas[i].length; j++) {
							somaNotas += notas[i][j];
						}
						if (somaNotas / qtdProvas < 7 && somaNotas / qtdProvas > 3) {
							relatorio += nomes[i] + "\n";
						}
					}
					// Verificação se houve algum aluno que satifez a condição
					if (relatorio.equals("RELATÓRIO:\n\nEM RECUPERAÇÃO:\n\n")) {
						JOptionPane.showMessageDialog(null, "Não houve alunos EM RECUPERAÇÃO!");
					} else {
						JOptionPane.showMessageDialog(null, relatorio);
					}
				}
				break;
			case 6:
				// Verificação se já tem algo cadastrado
				if (qtdAlunos == 0 && qtdProvas == 0) {
					JOptionPane.showMessageDialog(null, "Cadastre primeiro os alunos!");
				} else {
					relatorio += "REPOROVADOS:\n\n";
					// Passando por todas as notas e seleção dos alunos
					for (int i = 0; i < notas.length; i++) {
						somaNotas = 0;
						for (int j = 0; j < notas[i].length; j++) {
							somaNotas += notas[i][j];
						}
						if (somaNotas / qtdProvas < 3) {
							relatorio += nomes[i] + "\n";
						}
					}
					// Verificação se houve algum aluno que satifez a condição
					if (relatorio.equals("RELATÓRIO:\n\nREPROVADOS:\n\n")) {
						JOptionPane.showMessageDialog(null, "Não houve alunos REPROVADOS!");
					} else {
						JOptionPane.showMessageDialog(null, relatorio);
					}
				}
				break;
			case 7:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida");

			}

		} while (op != 7);

	}

}
