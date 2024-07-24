package matrizes;

import javax.swing.JOptionPane;

public class ExemploMatriz2 {
	// Cadastro de atletas, distâncias e tempos para correr a distância
	public static void main(String[] args) {
		
		int qtdAtletas = Integer.parseInt(JOptionPane.showInputDialog("Qtd de atletas: "));
		int qtdDistancias = Integer.parseInt(JOptionPane.showInputDialog("Qtd de distâncias: "));
		
		String[] atletas = new String[qtdAtletas];
		String[] distancias = new String[qtdDistancias];
		
		int[][] tempos = new int[qtdAtletas][qtdDistancias];
		
		for(int i = 0; i < distancias.length; i++) {
			distancias[i] = JOptionPane.showInputDialog("Distância " + (i+1) + ":");
		}
		
		//CADASTRO
		for(int i = 0; i <tempos.length; i++) {
			atletas[i] = JOptionPane.showInputDialog("Atleta " + (i+1) + ":");
			for(int j = 0; j < tempos[i].length; j++) {
				tempos[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Tempo de " + atletas[i] + " para a distância de "+ distancias[j] +" KM"));
			}
		}
		
		String result = "";
		//RELATÓRIO
		for(int i = 0; i <tempos.length; i++) {
			int soma = 0;
			for( int j = 0; j <tempos[i].length; j++) {
				soma += tempos[i][j];
			}
			result += atletas[i] + " - " + ((double) soma/distancias.length + "\n");
		}
		JOptionPane.showMessageDialog(null, result);
		
	
	}
}
