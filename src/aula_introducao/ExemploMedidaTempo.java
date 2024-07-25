package aula_introducao;

import javax.swing.JOptionPane;

public class ExemploMedidaTempo {
	public static void main(String[] args) {

		String[] nomes = new String[100000];

		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = "nome " + i;
		}

		String nomeBusca = JOptionPane.showInputDialog("Qual nome você gostaria de buscar?");
		String ret = "Não encontrado";
		
		//Pega o tempo Inicial
		long t1 = System.nanoTime();
		for (String s : nomes) {
			if (s.equals(nomeBusca)) {
				ret = "Achei";
			}
		}
		System.out.println(ret);
		
		//Pega o tempo final
		long t2 = System.nanoTime();
		
		System.out.println(t2-t1);
	}
}
