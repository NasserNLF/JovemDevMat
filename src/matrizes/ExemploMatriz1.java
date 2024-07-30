package matrizes;

import java.util.Random;

public class ExemploMatriz1 {
	public static void main(String[] args) {
		// Criação da matriz
		int[][] matriz = new int[4][4];

		// Classe de números randomicos
		Random r = new Random();

		// Declaração dos valores
		matriz[0][0] = r.nextInt(10);
		matriz[0][1] = r.nextInt(10);
		matriz[0][2] = r.nextInt(10);
		matriz[0][3] = r.nextInt(10);
		matriz[1][0] = r.nextInt(10);
		matriz[1][1] = r.nextInt(10);
		matriz[1][2] = r.nextInt(10);
		matriz[1][3] = r.nextInt(10);
		matriz[2][0] = r.nextInt(10);
		matriz[2][1] = r.nextInt(10);
		matriz[2][2] = r.nextInt(10);
		matriz[2][3] = r.nextInt(10);
		matriz[3][0] = r.nextInt(10);
		matriz[3][1] = r.nextInt(10);
		matriz[3][2] = r.nextInt(10);
		matriz[3][3] = r.nextInt(10);

		/*
		 * Somar cada linha e apresentar? Linha 1: x Linha 2: x ...
		 */

		// Mostrando matriz no formato original
		for (int i = 0; i < matriz.length; i++) {
			// A cada linha a variável soma é resetada
			int somaLinha = 0;
			// Para colunas sempre especificar a linha da matriz
			for (int j = 0; j < matriz[i].length; j++) {
				// \t é tab
				System.out.print(matriz[i][j] + "\t");
				somaLinha += matriz[i][j];
			}
			System.out.print("|Soma da linha: " + somaLinha);
			// Para pular linha
			System.out.println();
		}

		// Somando as colunas agora
		for (int i = 0; i < matriz.length; i++) {
			int somaColuna = 0;
			for (int j = 0; j < matriz[i].length; j++) {
				somaColuna += matriz[j][i];
			}
			System.out.println("Soma da coluna " + (i + 1) + ": " + somaColuna);
		}

		// Somando a Diagonal principal da matriz
		int somaDiagonal = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == j) {
					somaDiagonal += matriz[i][j];
				}
			}
		}
		System.out.println("Soma da diagonal: " + somaDiagonal);

	}
}
