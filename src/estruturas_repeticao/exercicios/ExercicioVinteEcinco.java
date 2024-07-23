package estruturas_repeticao.exercicios;

import javax.swing.JOptionPane;

public class ExercicioVinteEcinco {
	public static void main(String[] args) {
		int qtdPrvAluno = 0, qtdPrvSala = 0, cont = 0;
		double mediaAluno, mediaTotal = 0;

		do {
			mediaAluno = Double.parseDouble(JOptionPane.showInputDialog(
					"Programa de Cálculo de Média Geral!\n\nMédia do aluno " + (cont + 1) + "\n(9999 para parar)"));
			qtdPrvAluno = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de provas feitas:\n(9999 para parar)" ));
			
			if (mediaAluno != 9999 && qtdPrvAluno != 9999) {
				//Somando os valores para aplicar a média ponderada no final
				mediaTotal += mediaAluno*qtdPrvAluno;
				qtdPrvSala += qtdPrvAluno;
			}
			cont++;
		} while (mediaAluno != 9999 && qtdPrvAluno != 9999);
		JOptionPane.showMessageDialog(null, "A média da sala foi de " + mediaTotal/qtdPrvSala);
	}
}
