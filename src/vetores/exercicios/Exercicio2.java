package vetores.exercicios;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		int qtdCor = Integer.parseInt(JOptionPane.showInputDialog("Quantas cores tu quer digitar?"));
		String[] cores = new String[qtdCor];
		String fraseFinal = "De trás para frente:\n\n";
		for(int i = 0; i < qtdCor; i++) {
			cores[i] = JOptionPane.showInputDialog("Nome da Cor: ");
		}
		
		//Saída de forma contrária
		for(int i = (qtdCor - 1); i >= 0; i--) {
			if (i == (qtdCor - 1)) {
				fraseFinal += cores[i] + "";
 			}else {
				fraseFinal += ", " + cores[i];
			}
		}
		
		JOptionPane.showMessageDialog(null, fraseFinal);
	}
	

}
