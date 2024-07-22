package estruturas_repeticao.exercicios;

public class ExercicioDois {
	public static void main(String[] args) {
		for (int i = 1; i < 101; i++) {
			System.out.println(String.format("(%d + %d) = %d", i, i + 1, (i + (i + 1))));
		}
	}
}
