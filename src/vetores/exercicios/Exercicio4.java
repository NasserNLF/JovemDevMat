package vetores.exercicios;

import javax.swing.JOptionPane;

public class Exercicio4 {
	public static void main(String[] args) {
		int op = 0, op2 = 0, op3 = 0, qtdCad = 0;
		String relatorio = "";
		String fraseAux = "";
		// Vetores
		String[] nomes = new String[350];
		int[] idades = new int[350];

		do {
			// Menu
			op = Integer.parseInt(JOptionPane.showInputDialog("COMPETIÇÃO!\n\n" + "1 - Cadastro de atleta\n"
					+ "2 - Consulta de atletas\n" + "3 - Consulta de categorias\n" + "4 - Sair"));
			switch (op) {
			case 1:
				nomes[qtdCad] = JOptionPane.showInputDialog("Nome do atleta: ").toUpperCase();
				idades[qtdCad] = Integer.parseInt(JOptionPane.showInputDialog("Idade do atleta: "));
				// Verificação se o atleta possue idade válida
				if (idades[qtdCad] < 5) {
					JOptionPane.showMessageDialog(null,
							"O Atleta não possue idade para participar do torneio!\nIdade mínima: 5 anos");
					nomes[qtdCad] = "";
					idades[qtdCad] = 0;
				} else {
					qtdCad++;
				}
				break;
			case 2:
				// Construção do relatório de consulta de atletas
				relatorio = "RELATÓRIO!\n\n";
				do {
					op2 = Integer.parseInt(
							JOptionPane.showInputDialog("1 - Incluir atleta no relatório\n" + "2 - Emitir relatório"));
					switch (op2) {
					case 1:
						// Montagem Strings
						String nomeBusca = JOptionPane.showInputDialog("Qual atleta você gostaria de incluir?")
								.toUpperCase();
						fraseAux = "";
						int pos = 0;
						do {
							if (nomeBusca.equals(nomes[pos])) {
								fraseAux += "Atleta: " + nomes[pos];

								if (idades[pos] >= 5 && idades[pos] <= 7) {
									fraseAux += "\nCategoria: Infantil A\n\n";
								} else if (idades[pos] >= 8 && idades[pos] <= 10) {
									fraseAux += "\nCategoria: Infantil B\n\n";
								} else if (idades[pos] >= 11 && idades[pos] <= 17) {
									fraseAux += "\nCategoria: Juvenil\n\n";
								} else {
									fraseAux += "\nCategoria: Adulto\n\n";
								}
							}
							pos++;
						} while (fraseAux.equals("") && (pos < qtdCad));

						if (fraseAux.equals("")) {
							JOptionPane.showMessageDialog(null, "Atleta não encontrado");
						} else {
							relatorio += fraseAux;
						}
						break;
					case 2:
						JOptionPane.showMessageDialog(null, relatorio);
						break;
					default:
						JOptionPane.showMessageDialog(null, "Opção inválida");
					}
				} while (op2 != 2);
				break;
			case 3:
				// Construção do relatório que busca atletas por categoria
				relatorio = "RELATÓRIO\n\n";
				do {
					fraseAux = "";
					op3 = Integer.parseInt(
							JOptionPane.showInputDialog("1 - Incluir categoria no relatório\n2 - Emitir relatório"));
					int selCat = 0;
					switch (op3) {
					case 1:
						selCat = Integer.parseInt(JOptionPane.showInputDialog(
								"1 - Infantil A\n" + "2 - Infantil B\n" + "3 - Juvenil\n" + "4 - Adulto\n5 - Sair"));
						switch (selCat) {
						case 1:
							// INFANTIL A - 5 A 7
							for (int i = 0; i < qtdCad; i++) {
								if (idades[i] >= 5 && idades[i] <= 7) {
									fraseAux += nomes[i] + "\n";
								}
							}
							if (fraseAux.equals("")) {
								JOptionPane.showMessageDialog(null, "A categoria não possue nenhum atleta!");
							} else {
								relatorio += "Categoria Infantil A\nAtletas:\n" + fraseAux + "\n";
							}
							break;
						case 2:
							// INFANTIL B - 8 A 10
							for (int i = 0; i < qtdCad; i++) {
								if (idades[i] >= 8 && idades[i] <= 10) {
									fraseAux += nomes[i] + "\n";
								}
							}
							if (fraseAux.equals("")) {
								JOptionPane.showMessageDialog(null, "A categoria não possue nenhum atleta!");
							} else {
								relatorio += "Categoria Infantil B\nAtletas:\n" + fraseAux + "\n";
							}
							break;
						case 3:
							// JUVENIL - 11 A 17
							for (int i = 0; i < qtdCad; i++) {
								if (idades[i] >= 11 && idades[i] <= 17) {
									fraseAux += nomes[i] + "\n";
								}
							}
							if (fraseAux.equals("")) {
								JOptionPane.showMessageDialog(null, "A categoria não possue nenhum atleta!");
							} else {
								relatorio += "Categoria Juvenil\nAtletas:\n" + fraseAux + "\n";
							}
							break;
						case 4:
							// ADULTO - MAIOR QUE 18
							for (int i = 0; i < qtdCad; i++) {
								if (idades[i] >= 18) {
									fraseAux += nomes[i] + "\n";
								}
							}
							if (fraseAux.equals("")) {
								JOptionPane.showMessageDialog(null, "A categoria não possue nenhum atleta!");
							} else {
								relatorio += "Categoria Adultos\nAtletas:\n" + fraseAux + "\n";

							}
							break;
						case 5:
							break;
						default:
							JOptionPane.showMessageDialog(null, "Opção Inválida");
							break;
						}
						break;
					case 2:
						JOptionPane.showMessageDialog(null, relatorio);
						break;
					default:
						JOptionPane.showMessageDialog(null, "Opção Inválida");
					}

				} while (op3 != 2);
				break;
			case 4:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida");
			}

		} while (op != 4);
	}
}
