package aula_introducao;

import java.util.Scanner;

public class ExemploEntradaSaidaScanner {
	public static void main(String[] args) {
		//Criação do objeto
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual o seu nome?");
		String nome = sc.nextLine();
		System.out.println("Qual o seu peso?");
		double peso = sc.nextDouble();
		System.out.println("Qual a sua altura? (m)");
		double altura = sc.nextDouble();
		sc.close(); //Sempre fechar
		double imc = peso / (altura * altura);
		System.out.println(nome + "\nSeu IMC é de " + imc);

	}
}
