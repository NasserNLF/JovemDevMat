package metodos.exercicios;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	public static void main(String[] args) {

		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		int op = 0;

		do {
			op = menu();
			switch (op) {
			case 1:
				// Cadastrando aluno
				cadastraAluno(alunos);
				break;
			case 2:
				// Listando os alunos
				if (verificaCad(alunos)) {
					JOptionPane.showMessageDialog(null, listaAlunos(alunos, ""));
				}
				break;
			case 3:
				// Buscando aluno
				if (verificaCad(alunos)) {
					JOptionPane.showMessageDialog(null, buscaAluno(alunos));
				}
				break;
			case 4:
				// Alunos aprovados
				if (verificaCad(alunos)) {
					JOptionPane.showMessageDialog(null, listaAlunos(alunos, "Aprovado"));
				}
				break;
			case 5:
				// Alunos em recuperação
				if (verificaCad(alunos)) {
					JOptionPane.showMessageDialog(null, listaAlunos(alunos, "Em recuperação"));
				}
				break;
			case 6:
				// Alunos Reprovados
				if (verificaCad(alunos)) {
					JOptionPane.showMessageDialog(null, listaAlunos(alunos, "Reprovado"));
				}
				break;
			case 7:
				break;
			}
		} while (op != 7);

	}

	// Menu
	public static int menu() {
		String m = "Menu Inicial!\n" + "1 - Cadastrar alunos e notas\n"
				+ "2 - Listar todos os alunos, médias e situações\n" + "3 - Buscar aluno específico\n"
				+ "4 - Listar alunos aprovados\n" + "5 - Listar alunos em recuperação\n"
				+ "6 - Listas alunos reprovados\n" + "7 - Sair";

		// Pedindo a opção do menu
		int op = Integer.parseInt(JOptionPane.showInputDialog(m));

		// Verificação
		if (op < 1 || op > 7) {
			JOptionPane.showMessageDialog(null, "Opção inválida");
			return menu();
		}
		return op;
	}

	// Cadastro de aluno
	public static void cadastraAluno(ArrayList<Aluno> alunos) {
		Aluno a = new Aluno();

		a.nome = JOptionPane.showInputDialog("Nome do aluno: ").toUpperCase();

		double nota = 0;

		// Cadastro notas
		do {
			nota = Double.parseDouble(JOptionPane.showInputDialog("Nota: (Qualquer nota abaixo de 0 para parar)"));

			if (nota > 10) {
				JOptionPane.showMessageDialog(null, "A nota será desconsiderada!\nAs notas vão de 0 a 10");
			} else if (nota >= 0) {
				a.notas.add(nota);
			}

		} while (nota >= 0);
		alunos.add(a);
		a.horaCadastro = new Date();
	}

	// Verificando se ja tem algum aluno cadastrado
	public static boolean verificaCad(ArrayList<Aluno> nomes) {
		if (nomes.size() == 0) {
			JOptionPane.showMessageDialog(null, "Cadastre um aluno primeiro");
			return false;
		}
		return true;
	}

	// Listando os alunos
	public static String listaAlunos(ArrayList<Aluno> alunos, String situacao) {
		String relatorio = "";
		// Todos
		if (situacao.equals("")) {
			for (Aluno a : alunos) {
				relatorio += String.format("Aluno: %s\nMédia: %.2f\nSituação: %s\nHora do cadastro: %s\n", a.nome,
						calculaMedia(a.notas), verificaSituação(a), df.format(a.horaCadastro));
			}
			return String.format("RELATÓRIO!\nHora da geração: %S\n\n%s", retornaData(), relatorio);
		} else {
			// Situação específica
			for (Aluno a : alunos) {
				if (verificaSituação(a).equals(situacao)) {
					relatorio += String.format("Aluno: %s\nMédia: %.2f\n", a.nome, calculaMedia(a.notas));
				}
			}
			if (!relatorio.equals("")) {
				return String.format("RELATÓRIO\nHora da geração: %s\n\nSituação: %s\n%s", retornaData(), situacao,
						relatorio);
			}
			return "Nenhum aluno encontrado na situação";
		}

	}

	// Buscando aluno
	public static String buscaAluno(ArrayList<Aluno> alunos) {
		String buscaNome = JOptionPane.showInputDialog("Qual nome você gostaria de verificar?").toUpperCase();
		for (Aluno a : alunos) {
			if (a.nome.equals(buscaNome)) {
				return String.format("Aluno encontrado!\nAluno: %s\nMédia: %.2f\nSituação: %s\nHora do cadastro: %s",
						a.nome, calculaMedia(a.notas), verificaSituação(a), a.horaCadastro);
			}
		}
		return "Aluno não encontrado";
	}

	// Media aluno
	public static double calculaMedia(ArrayList<Double> notas) {
		double soma = 0;
		// Verificando se há alguma nota cadastrada
		if (notas.size() == 0) {
			return 0;
		}

		for (Double d : notas) {
			soma += d;
		}
		return soma / notas.size();
	}

	// Verificando situação
	public static String verificaSituação(Aluno a) {
		double media = calculaMedia(a.notas);

		if (media >= 7) {
			return "Aprovado";
		} else if (media >= 3) {
			return "Em recuperação";
		} else {
			return "Reprovado";
		}

	}

	// Pega a data atual
	public static String retornaData() {
		Date dtAtual = new Date();

		return df.format(dtAtual);
	}

}
