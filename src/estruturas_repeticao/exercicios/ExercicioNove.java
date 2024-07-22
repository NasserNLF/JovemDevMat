package estruturas_repeticao.exercicios;

import javax.swing.JOptionPane;

public class ExercicioNove {
	public static void main(String[] args) {
		int op = 0;
		double media = 0;
		String fraseString = "Situação final dos alunos:\n";
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("1)Inserção de aluno no sistema\n2)Situações Finais"));
			switch(op) {
			case 1:
				fraseString += JOptionPane.showInputDialog("Digite o nome do aluno: ") + ": ";
				media = Double.parseDouble(JOptionPane.showInputDialog("Insira a média do aluno: "));
				if (media >= 7) {
					fraseString += "Aprovado\n";
				}else if(media >= 2) {
					fraseString += "Em recuperação\n";
				}else {
					fraseString += "Reprovado\n";
				}
			}
		}while(op !=2);
		JOptionPane.showMessageDialog(null, fraseString);
	}

}
