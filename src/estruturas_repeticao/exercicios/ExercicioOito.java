package estruturas_repeticao.exercicios;

import javax.swing.JOptionPane;

public class ExercicioOito {
	public static void main(String[] args) {
		double valor = Double.parseDouble(JOptionPane.showInputDialog(
				"Programa de simlação de movimentações na conta bancária no mês!\nValor inicial da conta corrente:"));
		char op;

		do {
			op = JOptionPane.showInputDialog(
					"Simulação!\n1) Depósito (Digite D)\n2) Retirada (Digite R)\n3) Saída da Simulação (Digite S)")
					.toUpperCase().charAt(0);
			switch (op) {
			case 'D':
				valor += Double.parseDouble(JOptionPane.showInputDialog("Valor a ser depositado: "));
				break;

			case 'R':
				valor -= Double.parseDouble(JOptionPane.showInputDialog("Valor a ser retirado: "));
				break;
			case 'S':
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida");
				break;
			}
		} while (op != 'S');
		
		JOptionPane.showMessageDialog(null, "O saldo final ficou igual a R$" + valor);
	}
}
