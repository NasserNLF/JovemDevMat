package estruturas_repeticao.exercicios;

import java.util.Random;

import javax.swing.JOptionPane;

public class ExercicioDezesseis {
	public static void main(String[] args) {
		//Escolhe aleatoriamente um número de 0 a 6
		int andarAtual = new Random().nextInt(6);
		int proxAndar = 0;
		boolean fimDoPrograma = false;
		do {
			if (andarAtual < 0) {
				andarAtual = Integer.parseInt(JOptionPane.showInputDialog("Andar Inválido!\nEscolha outro:"));
			} else {
				proxAndar = Integer.parseInt(JOptionPane.showInputDialog("Próximo Andar:"));
				if (proxAndar < 0) {
					JOptionPane.showMessageDialog(null, "Andar Inválido!\nPermanecendo no andar atual!");
				} else if (proxAndar > andarAtual) {
					andarAtual = proxAndar;
					JOptionPane.showMessageDialog(null, "Subindo");
				} else if (proxAndar < andarAtual) {
					andarAtual = proxAndar;
					JOptionPane.showMessageDialog(null, "Descendo");
				} else {
					fimDoPrograma = true;
					JOptionPane.showMessageDialog(null, "Você chegou ao seu destino!");
				}
			}

		} while (fimDoPrograma == false);

	}

}
