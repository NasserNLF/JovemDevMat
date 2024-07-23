package vetores;

import javax.swing.JOptionPane;

public class ExemploVetores {
	public static void main(String[] args) {
		// Declaração dos Vetores
		String[] nomes = new String[100]; // Vetor com 5 posições
		String nome = "";
		int qt = 0; // Contador

//		//Cadastro
//		for (int i =0; i < nomes.length; i++) {
//			nomes[i] = JOptionPane.showInputDialog("Nome " + (i+1) + ":" );
//		}
//		
//		//Mostrando na tela
//		for (String nome : nomes) {
//			System.out.println(nome);
//		}
//		
		// Cadastro
		do {
			if (qt < 100) {
				nome = JOptionPane.showInputDialog("Nome: (enter para sair)");
				if (!nome.equals("")) {
					nomes[qt] = nome;
					qt++;
				}
			} else {
				JOptionPane.showMessageDialog(null, "Memória cheia");
			}
		} while (!nome.equals(""));

//		//Mostrando na tela
//		for (String n : nomes) {
//			System.out.println(n);
//			
//		}

		for (int i = 0; i < qt; i++) {
			System.out.println(nomes[i]);
		}

	}
}
