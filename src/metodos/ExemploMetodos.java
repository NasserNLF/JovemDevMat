package metodos;

import javax.swing.JOptionPane;

public class ExemploMetodos {
	
	//Variável global
	static int z = 10;

	// Método MAIN
	public static void main(String[] args) {
		//Variável local
		double n1 = 10;
		double n2 = 5;

		System.out.println(verificaAprovacao(calculaMedia(n1, n2)));
		
		System.out.println(escolheMenu());

	}

	// Criação de um método
	public static double calculaMedia(double x, double y) {
		return (x + y) / 2;
	}

//	//Não retorna nada, assim precisa do SOUT
//	public static void calculaMedia2(double x, double y) {
//		System.out.println( (x + y) / 2);
//	}

	// Verificando aprovação
	public static String verificaAprovacao(double media) {
		if (media >= 7) {
			return "APROVADO (A)";
		} else {
			if (media < 3) {
				return "Reprovado";
			}
		}
		return "Recuperação";
	}
	
	public static int escolheMenu() {
		String m = "1 - op1\n"
				+ "2 - op2\n"
				+ "3 - op3\n"
				+ "4 - Sair\n";
		
		int op = Integer.parseInt(JOptionPane.showInputDialog(m));
		if (op != 4 ) {
			return escolheMenu();
		}
		return op;
		
	}

}
