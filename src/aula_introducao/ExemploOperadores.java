package aula_introducao;

public class ExemploOperadores {
	public static void main(String[] args) {
		// Declaração das variáveis
		int int1 = 10;
		int int2 = -5;
		int int3 = 3;

		double double1 = 2.5;
		double double2 = -5.0;
		double double3 = 3.3;

		String str1 = "Casa";
		String str2 = "Escola";
		String str3 = " ";
		String str4 = "10";

		// No char só se usa aspas simples
//		char c1 = 'A';
//		char c2 = '5';
//		char c3 = ' ';

		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;

		/*
		 * Exemplo de Operações aritméticas
		 */

		// SOMA
		int r1 = int1 + int2;
		System.out.println("Soma de dois inteiros: " + r1);
		double r2 = double1 + double3;
		System.out.println("Soma de dois doubles: " + r2);
		double r3 = int1 + double1;
		System.out.println("Soma de int com double: " + r3);

		// SUBTRAÇÃO

		int r4 = int1 * int2;
		double r5 = double1 * double3;
		double r6 = int1 * double1;
		System.out.println("Subtração de int com int: " + r4);
		System.out.println("Subtração de double com double: " + r5);
		System.out.println("Subtração de int com double: " + r6);

		// Multiplicação
		int r7 = int1 - int2;
		double r8 = double1 - double3;
		double r9 = int1 - double1;
		System.out.println("Multiplicação de int com int: " + r7);
		System.out.println("Multiplicação de double com double: " + r8);
		System.out.println("Multiplicação de int com double: " + r9);

		// Divisão
		int r10 = int1 / int2;
		double r11 = int1 / int3;
		double r11_2 = int1 / (double) int3; // Se faz o cast nesse caso para ter
		double r12 = double1 / double3;
		System.out.println("Divisão de int com int: " + r10);
		System.out.println("Divisão de int com int (sem casas decimais: " + r11);
		System.out.println("Divisão de int com int (com casas decimais: " + r11_2);
		System.out.println("Divisão de double com double (com casas decimais: " + r12);

		// Resto da divisão
		int r13 = int1 % int3;
		System.out.println("Resto da divisão: " + r13);

		// Exponenciação (Sempre será double)
		double r14 = Math.pow(int1, int3);
		System.out.println("Exponenciação: " + r14);

		// Exemplos de Operações Relacionais
//		System.out.println("10 é maior que 5? " + (10 == 5));
//		System.out.println("10 é igual que 10? " + (10 == 10));
		System.out.println("10 é diferente de 5? " + (10 != 5));
		System.out.println("int1 é maior que int3? " + (int1 > int3));

		boolean r15 = int1 > double1;
		System.out.println("Resultado r15: " + r15);

		System.out.println("D é maior que A?" + ('d' > 'a')); // Apenas com CHAR

		/*
		 * Operadores lógicos
		 * 
		 * AND (&&) OR (||) NOT (!)
		 */
		System.out.println("Operação AND: " + (b1 && b2 && b3));
		System.out.println("Operação OR: " + (b1 || b2 || b3));
		System.out.println("Operação NOT: " + (!b1));

		// Operações com String

		String str5 = "cAsa";

		System.out.println(str1 + str3 + str2);
		System.out.println(str4 + double1);
		System.out.println(str1.equals(str5)); // Comparação de Strings
		System.out.println(str1.equalsIgnoreCase(str5)); // Ignora o CAPS

		// Sub=Strings
		System.out.println(str2.substring(2)); // Ponto Inicial até o fim da String
		System.out.println(str2.substring(2, 4)); // Ponto Inicial e Ponto final

		// Tranformação em Strings
		String str7 = double2 + "";
		str7 = String.valueOf(double2);
		System.out.println(str7);

		// Outros métodos
		System.out.println(str2.length());
		System.out.println(str2.indexOf("CO"));
		System.out.println(str2.indexOf("CD"));
		System.out.println(str2.contains("CO"));
		System.out.println(str2.startsWith("CO"));
		System.out.println(str2.endsWith("CO"));

//		System.out.println((2 * 5) == true);

	}

}
