package vetores;

import java.util.Random;

public class ExemploVetores2 {
	public static void main(String[] args) {
		String[] meses = new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto",
				"Setembro", "Outubro", "Novembro", "Dezembro" };
		for (String mes : meses) {
			System.out.println(mes);
		}
		
		//Sorteio
		System.out.println(meses[new Random().nextInt(6)]);
	}
}
