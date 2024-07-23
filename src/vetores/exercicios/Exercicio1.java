package vetores.exercicios;

import java.lang.classfile.Opcode;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {

		int op = 0, qtdCad = 0;
		String relatorio = "Relatório final!\n\n";

		// Vetores
		double[] precos = new double[50];
		int[] qtdEst = new int[50];
		String[] mercadorias = new String[50];
		
		//Começo do teste
		/*mercadorias[0] = "A";
		mercadorias[1] = "B";
		mercadorias[2] = "C";
		mercadorias[3] = "D";
		mercadorias[4] = "E";
		
		qtdEst[0] = 0;
		qtdEst[1] = 8;
		qtdEst[2] = 50;
		qtdEst[3] = 50;
		qtdEst[4] = 50;
		
		precos[0] = 1;
		precos[1] = 1400;
		precos[2] = 110;
		precos[3] = 99;
		precos[4] = 7;
		
		qtdCad = 5; */
		//Fim do teste

		do {
			// Início do Menu
			op = Integer.parseInt(JOptionPane.showInputDialog(
					"1 - Cadastrar mercadorias\n" + "2 - Gerar Relatório\n\n" + "9 - Sair e ver relatório gerado"));
			switch (op) {
			// Cadastro
			case 1:
				if (qtdCad < 50) {
					mercadorias[qtdCad] = JOptionPane.showInputDialog("Nome da Mercadoria: ");
					precos[qtdCad] = Double.parseDouble(JOptionPane.showInputDialog("Preço da Mercadoria: "));
					qtdEst[qtdCad] = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de unidades em estoque"));
					qtdCad++;
				} else {
					JOptionPane.showMessageDialog(null, "Número máximo de mercadorias registradas");
				}
				break;
			case 2:
				int menorEst = 0, maiorVlr = 0, qtdEstMen10 = 0, qtdVlrMai100EstMai10 = 0, qtdEstZer = 0;
				// Montagem do Relatório
				for (int i = 0; i < qtdCad; i++) {
					// Verificação estoque menor de 10
					if (qtdEst[i] < 10) {
						qtdEstMen10++;
					}
					// Verificação valor maior de 100 e estoque maior de 10
					if ((precos[i] > 100) && (qtdEst[i] > 10)) {
						qtdVlrMai100EstMai10++;
					}
					// Verificação qual mercadoria possue o menor estoque
					if (qtdEst[i] < qtdEst[menorEst]) {
						menorEst = i;
					}
					// Verificação qual mercadoria possí o maior preço
					if (precos[i] > precos[maiorVlr]) {
						maiorVlr = i;
					}
					// Cáculo de mercadorias com estoque zerado
					if (qtdEst[i] == 0) {
						qtdEstZer++;
					}
				}
				relatorio += String.format("-Quantidade de mercadorias com menos de 10 unidades no estoque: %d\n"
						+ "-Quantidade de mercadorias que custam mais de 100 reais e possuem estoque com mais de 10 unidades: %d\n"
						+ "-Valor da mercadoria que tem o menor estoque: %.2f\n"
						+ "-Estoque da mercadoria que possue o maior preço: %d\n"
						+ "-Percentual das mercadorias que estão com o estoque zerado %.2f %", qtdEstMen10,
						qtdVlrMai100EstMai10, precos[menorEst], qtdEst[maiorVlr],
						((qtdEstZer / (double) qtdCad) * 100));
				break;
			case 9:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida");
			}
		} while (op != 9);
		JOptionPane.showMessageDialog(null, relatorio);
	}

}
