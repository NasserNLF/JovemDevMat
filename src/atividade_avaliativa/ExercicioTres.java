package atividade_avaliativa;

import javax.swing.JOptionPane;

public class ExercicioTres {
	public static void main(String[] args) {
		double velocidadeInternet = Double.parseDouble(JOptionPane.showInputDialog(
				"Programa para descobrir tempo de download de arquivos\nInforme a velocidade da sua internet: (mb/s)"));
		double tamanhoArquivo = Double.parseDouble(JOptionPane.showInputDialog("Informe o tamanho do arquivo: (mb)"));


		JOptionPane.showMessageDialog(null, String.format(
				"Formatando os valores para apenas 2 casas decimais após a vírgula\nDemorará %d minutos e %d segundos para o download!",
				(int) ((tamanhoArquivo / velocidadeInternet) / 60), (int) ((tamanhoArquivo / velocidadeInternet) % 60)));

	}

}
