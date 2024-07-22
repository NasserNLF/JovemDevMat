package atividade_avaliativa;

import javax.swing.JOptionPane;

public class ExercicioDois {
	public static void main(String[] args) {
		double taxa = Double.parseDouble(JOptionPane.showInputDialog(
				"Programa de conversão de real em dólar\nDigite quanto está valendo um dólar em reais hoje:"));
		double quantidadeReais = Double.parseDouble(JOptionPane
				.showInputDialog("Agora digite quantos reais você gostaria de trocar para a medição em dólares:"));

		JOptionPane.showMessageDialog(null, String.format(
				"R$%.2f correspondem a U$%.2f\n(Todos os valores foram formatados para possuir apenas 2 casas decimais após a vírgula)",
				quantidadeReais, (quantidadeReais / taxa)));
	}
}
