package estruturas_repeticao.exercicios;

import javax.swing.JOptionPane;

public class ExercicioCinco {
	public static void main(String[] args) {
		int resultado = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				resultado += i;	
			}else {
				resultado -= i;
			}
		}
		JOptionPane.showMessageDialog(null, "1+2+2+4+...+100 = " + resultado);
	}
}
