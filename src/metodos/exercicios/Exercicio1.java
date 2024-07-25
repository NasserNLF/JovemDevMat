package metodos.exercicios;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exercicio1 {
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
					JOptionPane.showMessageDialog(null, listaAlunos(alunos));
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

				}
				break;
			case 5:
				// Alunos em recuperação
				if (verificaCad(alunos)) {

				}
				break;
			case 6:
				// Alunos Reprovados
				if (verificaCad(alunos)) {

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

		a.nome = JOptionPane.showInputDialog("Nome do aluno: ");
		double nota = 0;

		// Cadastro notas
		do {
			nota = Double.parseDouble(JOptionPane.showInputDialog("Nota: (-1 para parar)"));

			if (nota != -1) {
				a.notas.add(nota);
			}

		} while (nota != -1);
		alunos.add(a);
	}

	// Verificando se ja tem algum aluno cadastrado
	public static boolean verificaCad(ArrayList<Aluno> nomes) {
		if (nomes.size() == 0) {
			JOptionPane.showMessageDialog(null, "Cadastre um aluno primeiro");
			return false;
		}
		return true;
	}

	// Media aluno
	public static double calculaMedia(ArrayList<Double> notas) {
		double soma = 0;
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

	public static String listaAlunos(ArrayList<Aluno> alunos) {
		String relatorio = "RELATÓRIO\n\n";
		for (Aluno a : alunos) {
			relatorio += a.nome + "\n";
			relatorio += "Situação: " + verificaSituação(a);
		}
		return relatorio;
	}
	
	//Buscando aluno
	public static String buscaAluno(ArrayList<Aluno> alunos) {
		String buscaNome = JOptionPane.showInputDialog("Qual nome você gostaria de verificar?");
		for (Aluno a : alunos) {
			if (a.nome.equals(buscaNome)) {
				return "Aluno encontrado!\n" + a.nome + "\nSituação: " + verificaSituação(a);
			}
		}
		return "Aluno não encontrado";
	}

}
