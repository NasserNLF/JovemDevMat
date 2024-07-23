package estruturas_repeticao.exercicios;

public class ExercicioDezoito {
	public static void main(String[] args) {
		int n = 10;
		for(int i = 1; i<=n; i++) {
			System.out.print(i);
			for(int j = n; j>0; j--) {
				System.out.print(", " + j);
			}
			System.out.println("");
		}
	}
}
