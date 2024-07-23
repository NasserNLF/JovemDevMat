package vetores;

import javax.swing.JOptionPane;

public class ExemploVetor3 {
	public static void main(String[] args) {
		String menu = "1 - Cadastrar\n" + "2 - Nome da pessoa mais velha\n" + "3 - Buscar pessoa\n" + "9 - Sair";
		int op = 0, qtd = 0;
		String[] nomes = new String[10];
		int[] idades = new int[100];

		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				// Verificação da memória para o cadastro
				if (qtd < 100) {
					nomes[qtd] = JOptionPane.showInputDialog("Nome " + (qtd + 1) + ":");
					idades[qtd] = Integer.parseInt(JOptionPane.showInputDialog("Idade do " + nomes[qtd] + ":"));
					qtd++;
				} else {
					JOptionPane.showMessageDialog(null, "Memória cheia");
				}
				break;
			case 2:
				// Busca o mais velho percorrendo a lista
				String nomeMaisVelho = nomes[0];
				int idadeMaisVelho = idades[0];
				for (int i = 1; i < qtd; i++) {
					if (idades[i] > idadeMaisVelho) {
						idadeMaisVelho = idades[i];
						nomeMaisVelho = nomes[i];
					}
				}
				JOptionPane.showMessageDialog(null, "Pessoa mais velha: " + nomeMaisVelho);
				break;
			case 3:
				String nomeBusca = JOptionPane.showInputDialog("Buscar qual nome?");
				String achou = "Nome não encontrado";
				int pos = 0;
				// Loop definido para não percorrer a lista inteira
				do {
					if (nomes[pos].equals(nomeBusca)) {
						achou = "Encontrado " + nomes[pos] + " está na posição " + (pos + 1);
					}
					pos++;
				} while (pos < qtd && achou.equals("Nome não encontrado"));
				JOptionPane.showMessageDialog(null, achou);
				break;
			case 9:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida!");
			}
		} while (op != 9);
	}
}
