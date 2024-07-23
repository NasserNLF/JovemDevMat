package estruturas_repeticao.exercicios;

import javax.swing.JOptionPane;

public class ExercicioVinteEquatro {
	public static void main(String[] args) {

		int funcionarios = 2, servicos = 3, pecas = 0, funMaiorVlr = 0, funMenorVlr = 0;
		double valorTotal = 0, valorFuncionario = 0, valorServico = 0, maiorVlr = 0, menorVlr = 0;
		String fraseFinal = "Relatório Final!\n";

		for (int i = 0; i < funcionarios; i++) {
			valorFuncionario = 0;
			fraseFinal += "Funcionário " + (i + 1) + "\n";
			for (int j = 0; j < servicos; j++) {
				valorServico = 0;
				pecas = Integer.parseInt(JOptionPane.showInputDialog(
						String.format("Funcionário %d:\nServiço %d:\nQuantidade de Peças?", (i + 1), (j + 1))));
				for (int p = 0; p < pecas; p++) {
					// Resposta Letra A
					valorServico += Double
							.parseDouble(JOptionPane.showInputDialog(String.format("Valor Peça %d", (p + 1))));
				}
				// Resposta LETRA C
				fraseFinal += "Serviço " + (j + 1) + ": R$" + valorServico + "\n";
				valorFuncionario += valorServico;
			}
			// Resposta LETRA B
			fraseFinal += "Total Funcionário: R$" + valorFuncionario + "\n\n";

			// Resposta Letra D e E
			if (i == 0 || valorFuncionario > maiorVlr) {
				funMaiorVlr = i;
				maiorVlr = valorFuncionario;
			}

			if (i == 0|| valorFuncionario < menorVlr) {
				funMenorVlr = i;
				menorVlr = valorFuncionario;
			}
			//Resposta LETRA A
			valorTotal += valorFuncionario;
		}
		
		fraseFinal += String.format("O valor total arrecadado foi de R$%.2f\nO funcionário com maior valor foi: %d\nO funcionário com menor valor foi: %d", valorTotal,
				(funMaiorVlr + 1), (funMenorVlr + 1));
		JOptionPane.showMessageDialog(null, fraseFinal);
	}
}
