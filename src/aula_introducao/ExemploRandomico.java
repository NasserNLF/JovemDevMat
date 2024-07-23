package aula_introducao;

import java.util.Random;

public class ExemploRandomico {
	public static void main(String[] args) {
		Random random = new Random();
		
		//Número Aleatório inteiro
		System.out.println(random.nextInt());
		
		//Número aleatório até 100
		System.out.println(random.nextInt(100));
		
		//Número Double aletorio
		System.out.println(random.nextDouble());
		
		
		
	}
}
