package aula_introducao;

public class AtividadeOperadores {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		double x = 2.0;
//		double y = 10.0;
		double z = -1.0;
		String nome = "Pedro";
		String rua = "Pedrinho";
		boolean l1 = true;
		boolean l2 = false;
		
		System.out.println(a + c/b);
		System.out.println(a + b + c);
		System.out.println(c/b/a);
		System.out.println(-x * b);
		System.out.println(-(x*b));
		System.out.println((-x)*b);
		System.out.println(nome + rua);
		System.out.println(nome == rua);
		System.out.println(l1 || l2) ;
		System.out.println((l1 && (!l2)));
		System.out.println((l2 && (!l1)));
		System.out.println((l2 && (!l1)) || (l1 && (!l2)));
//		System.out.println( y && c ==b);
		System.out.println((c - 3 * a) - (x + 2 *z));

		
		
	}

}
