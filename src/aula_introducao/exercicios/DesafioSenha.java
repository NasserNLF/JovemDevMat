package aula_introducao.exercicios;

import javax.swing.JOptionPane;

public class DesafioSenha {
	public static void main(String[] args) {
		String senha = JOptionPane.showInputDialog("Programa para a criação de uma senha!\nREGRAS:\n"
				+ "A senha deve possuir no mínimo 8 catacteres\r\n" + "É necessário conter letras e números\r\n"
				+ "Deve possuir no mínimo um caractere maísculo\r\n"
				+ "Deve conter um desses caracteres (!,@,#,$,%,&.*)\r\n"
				+ "Deve solicitar a senha e validação, de modo que ambas sejam iguais. ");
		String senhaValidacao = "";

		// Validação

		// Quantidade de caracteres
		if (senha.length() < 8) {
			senhaValidacao += "\nPelo menos mais " + (8 - senha.length()) + " caracteres";
		}

		// Verificando se há letras
		if ((senha.matches(".*[A-Za-z].*") == false)) {
			senhaValidacao += "\nLetras";
		}

		// Verificando se há números
		if ((senha.matches(".*[0-9].*") == false)) {
			senhaValidacao += "\nNúmeros";
		}

		// Verificando se há pelo menos uma letra maíuscula
		if ((senha.matches(".*[A-Z].*")) == false) {
			senhaValidacao += "\nPelo menos uma letra maiúscula";
		}

		// Verificação se há pelo menos um caractere especial
		if ((senha.matches(".*[!,@,#,$,%,&,*].*") == false)) {
			senhaValidacao += "\nPelo menos um caractere especial (!,@,#,$,%,&.*)";
		}

		if (senhaValidacao != "") {
			JOptionPane.showMessageDialog(null, "Está faltando:" + senhaValidacao + "\nReinicie o Programa!");
		} else {
			// Validação da nova senha reescrita
			senhaValidacao = JOptionPane.showInputDialog("Confirme a senha:");
			if (senha.equals(senhaValidacao)) {
				JOptionPane.showMessageDialog(null, "As senhas correspondem!\nÉ uma boa senha!");
			} else {
				JOptionPane.showMessageDialog(null, "As senhas não correspondem!\nReinicie o programa!");
			}
		}
	}
}
