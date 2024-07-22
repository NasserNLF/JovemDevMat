package atividade_avaliativa;

import javax.swing.JOptionPane;

public class ExercicioCinco {
	public static void main(String[] args) {
		double valorProduto = Double.parseDouble(JOptionPane.showInputDialog(
				"Programa para calcular valor do produto conforme a quantidade de prestações!\nValor do produto:"));
		int quantidadeParcelas = Integer.parseInt(JOptionPane.showInputDialog(
				"Quantidade de parcelas que você gostaria de dividir o valor\n(Para compra à vista digite 1)"));

		if (quantidadeParcelas == 1) {
			JOptionPane.showMessageDialog(null, String.format(
					"O valor recebeu um desconto de 10\nAssim você pagará uma parcela de R$%.2f\n(Todos os valores foram formatados para possuir apenas 2 casas decimais após a vírgula)",
					(valorProduto * 0.9)));
		} else if ((quantidadeParcelas > 1) && (quantidadeParcelas < 4)) {
			JOptionPane.showMessageDialog(null, String.format(
					"Pagando em %d parcelas, você pagará R$%.2f em cada uma\nTotalizando R$%.2f\nSEM JUROS\n(Todos os valores foram formatados para possuir apenas 2 casas decimais após a vírgula)!",
					quantidadeParcelas, (valorProduto / quantidadeParcelas), valorProduto));
		} else {
			JOptionPane.showMessageDialog(null, String.format(
					"Pagando em %d parcelas, o produto terá um juro de 15 sobre o valor inicial da compra\nAssim você pagará R$%.2f em cada uma\nTotalizando R$%.2f\n(Todos os valores foram formatados para possuir apenas 2 casas decimais após a vírgula)",
					quantidadeParcelas, ((valorProduto * 1.15) / quantidadeParcelas), (valorProduto * 1.15)));
		}
	}

}
