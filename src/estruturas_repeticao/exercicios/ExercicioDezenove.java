package estruturas_repeticao.exercicios;

import javax.swing.JOptionPane;

public class ExercicioDezenove {
	public static void main(String[] args) {
		String frase = "Situação final dos alunos:\n";
		double notas = 0, somaNotas;
		int qtdNotas, op = 0;
		
		do {
			somaNotas= 0;
			qtdNotas = 0;
			op = Integer.parseInt(JOptionPane.showInputDialog("Programa de cálculo de média de alunos:\n"
					+ "1) Cadastro de alunos\n2) Resultados"));
			switch(op) {
			case 1:
				frase += JOptionPane.showInputDialog("Nome do aluno: ");
				do {
					notas = Double.parseDouble(JOptionPane.showInputDialog("Nota: (9999 para parar)"));
					if(notas != 9999) {
						somaNotas += notas;
						qtdNotas++;
					}
				}while(notas != 9999);
				frase += " | Média: " + (somaNotas/qtdNotas) + "\n";
				break;
			case 2:
				break;
			default:
					JOptionPane.showMessageDialog(null, "Opção inválida");
			}
			
		}while(op!= 2);
		JOptionPane.showMessageDialog(null, frase);
	}
}
