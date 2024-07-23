package estruturas_repeticao.exercicios;

import javax.swing.JOptionPane;

public class ExercicioVinteAvinteEdois {
	public static void main(String[] args) {
		// Q = clientes e N = filas
		int q = 2, n = 2, op = 0, qtdDepositos = 0, qtdRetiradas = 0, numeroFilaComMaisDepositos = 0,
				numeroFilaComMenosRetiradas = 0, varAuxDep = 0, varAuxRet = 0;
		double depositos = 0, retiradas = 0;
		String nomeCliente = "";
		String relatorioQuantidade = "Exercício 21\nRelatório final!\n\n";

		for (int i = 0; i < n; i++) {
			// Limpando as varíaveis no início do Looping
			qtdDepositos = 0;
			qtdRetiradas = 0;
			for (int j = 0; j < q; j++) {
				nomeCliente = JOptionPane.showInputDialog("Nome do Cliente " + (j + 1) + " da fila " + (i + 1) + ":");
				op = Integer.parseInt(JOptionPane.showInputDialog("1) Depósito\n2) Retirada"));
				// Cálculo da atividade 20
				switch (op) {
				case 1:
					depositos += Double.parseDouble(JOptionPane.showInputDialog("Quantidade a depositar?"));
					qtdDepositos++;
					break;
				case 2:
					retiradas += Double.parseDouble(JOptionPane.showInputDialog("Quantidade a retirar?"));
					qtdRetiradas++;
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida! Será desconsiderado do cálculo");
					break;
				}
			}
			// Montagem da Mensagem da Atividade 21
			relatorioQuantidade += String.format("Fila %d:\nDepósitos: %d\nRetiradas: %d\n", (i + 1), qtdDepositos,
					qtdRetiradas);

			// Verificação atividade 22
			if (numeroFilaComMaisDepositos == 0 || qtdDepositos > varAuxDep) {
				// Receberá o maior valor para a comparação no próximo Looping
				varAuxDep = qtdDepositos;
				numeroFilaComMaisDepositos = i + 1;
			}

			if (numeroFilaComMenosRetiradas == 0 || qtdRetiradas < varAuxRet) {
				// Receberá o maior valor para a comparação no próximo Looping
				varAuxRet = qtdRetiradas;
				numeroFilaComMenosRetiradas = i + 1;
			}
		}
		// Saída atividade 20
		JOptionPane.showMessageDialog(null, "Exercício 20\nO total de depósitos foi de R$" + depositos
				+ "\nOtotal de retiradas foi de R$" + retiradas);
		// Saída atividade 21
		JOptionPane.showMessageDialog(null, relatorioQuantidade);
		// Saída atividade 22
		JOptionPane.showMessageDialog(null, String.format(
				"Exercício 22\nA fila com mais depósito foi a de número %d\nA fila com menos retiradas foi a de número %d",
				numeroFilaComMaisDepositos, numeroFilaComMenosRetiradas));
	}
}
