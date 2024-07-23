package vetores.exercicios;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		int op = 0, qtdCad = 0;

		// Vetores
		String[] nomes = new String[100];
		int[] nums = new int[100];

		do {
			String frase = "CONTATO NÃO ENCONTRADO!";
			// Menu
			op = Integer.parseInt(JOptionPane.showInputDialog("LISTA DE TELEFONES\n\n" + "1 - Cadastrar contato\n"
					+ "2 - Buscar contato por nome\n" + "3 - Buscar contato por telefone\n" + "4 - Sair"));
			switch (op) {
			case 1:
				// Cadastro usuário
				if (qtdCad < 100) {
					nomes[qtdCad] = JOptionPane.showInputDialog("Nome do Contato: ").toUpperCase();
					nums[qtdCad] = Integer.parseInt(JOptionPane.showInputDialog("Número do " + nomes[qtdCad]));
					qtdCad++;
				} else {
					JOptionPane.showMessageDialog(null, "Lista de contatos cheia");
				}
				break;
			case 2:
				// Loop para averiguar contato por nome
				String nomeBusca = JOptionPane.showInputDialog("Qual nome você gostaria de procurar").toUpperCase();
				int pos = 0;
				do {
					if (nomeBusca.equals(nomes[pos])) {
						frase = String.format("CONTATO ENCONTRADO!\n\n" + "Nome: %s\n" + "Telefone: %d", nomes[pos],
								nums[pos]);
					}
					pos++;
				} while (frase.equals("CONTATO NÃO ENCONTRADO!") && (pos < qtdCad));
				JOptionPane.showMessageDialog(null, frase);
				break;
			case 3:
				// Loop para averiguar contato por número
				int numBusca = Integer.parseInt(JOptionPane.showInputDialog("Qual número você gostaria de procurar?"));
				pos = 0;
				do {
					if (numBusca == nums[pos]) {
						frase = String.format("CONTATO ENCONTRADO!\n\n" + "Nome: %s\n" + "Telefone: %d", nomes[pos],
								nums[pos]);
					}
					pos++;
				} while (frase.equals("CONTATO NÃO ENCONTRADO!") && (pos < qtdCad));
				JOptionPane.showMessageDialog(null, frase);
				break;
			case 4:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida!");

			}

		} while (op != 4);
	}
}
