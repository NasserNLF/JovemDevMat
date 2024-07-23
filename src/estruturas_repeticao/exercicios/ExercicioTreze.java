package estruturas_repeticao.exercicios;

import javax.swing.JOptionPane;

public class ExercicioTreze {
	public static void main(String[] args) {
		String nomeDoMaisIdoso = JOptionPane
				.showInputDialog("Programa de análise de idades!\n" + "Digite o primeiro nome:");
		String nomeDoMaisNovo = nomeDoMaisIdoso;
		String nome = "";
		int op = 0, idade = 0;
		int idadeMaisIdoso = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
		int idadeMaisNovo = idadeMaisIdoso;

		// Loop de repetição para análise
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("1) Inserir nova pessoa\n2)Resultados"));

			switch (op) {
			case 1:
				nome = JOptionPane.showInputDialog("Nome: ");
				idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
				// Verificação
				if (idade > idadeMaisIdoso) {
					nomeDoMaisIdoso = nome;
					idadeMaisIdoso = idade;
				} else if (idade < idadeMaisNovo) {
					nomeDoMaisNovo = nome;
					idadeMaisNovo = idade;
				}
				break;
			case 2:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida");

			}

		} while (op != 2);
		JOptionPane.showMessageDialog(null,
				String.format("A pessoa mais idosa é %s com %d anos\n" + "A pessoa mais nova é %s com %d anos",
						nomeDoMaisIdoso, idadeMaisIdoso, nomeDoMaisNovo, idadeMaisNovo));

	}

}
