package avaliacao;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ProgramaPrincipal {

	/*
	 * Um medicamento, além do nome comercial, tem os nomes dos princípios ativos
	 * que o compõe.
	 * 
	 * Por exemplo, o medicamento CIMEGRIPE é composto por: - PARACETAMOL, -
	 * CLORFENIRAMINA - FENILEFRINA. Já o medicamento TYLENOL é composto por -
	 * PARACETAMOL
	 * 
	 * Desta forma, um medicamento pode ter um ou vários princípios ativos e um
	 * princípio ativo pode ser utilizado em vários medicamentos.
	 * 
	 * Pede-se um programa que possibilite o cadastro de medicamentos com os
	 * seguintes requisitos:
	 * 
	 * a. Utilize Registro para representar cada medicamento b. Utilize sub-rotinas
	 * para realizar as operações solicitadas. c. Utilize ArrayList para armazenar
	 * os medicamentos d. Restrinja a inclusão de no máximo 500 medicamentos
	 * 
	 * O programa deve exibir um menu com as seguintes opções:
	 * 
	 * 1 – Incluir medicamento {fazer o cadastro do medicamento em memória} 2 –
	 * Listar todos os medicamentos { listar todos os medicamentos cadastrados cada
	 * qual com os respectivos princípios ativos} 3 – Buscar por nome de princípio
	 * ativo {usuário digita o nome de um princípio ativo e o programa mostra todos
	 * os medicamentos que contém aquele o princípio ativo} 4 – Mostrar o percentual
	 * de memória livre {o programa deve mostrar em PERCENTUAL a quantidade
	 * disponível para cadastro} 0 – Sair do sistema
	 * 
	 */

	//Variável Global de tamanho
	public static int tamMax = 500;

	public static void main(String[] args) {

		// Lista contendo os medicamentos

		ArrayList<Medicamento> medicamentos = new ArrayList<Medicamento>();
		int op = 0;

		do {
			op = menu();
			switch (op) {
			case 1:
				// Cadastro Medicamento
				if (verificaTam(medicamentos)) {
					cadastroMedicamento(medicamentos);
				}
				break;
			case 2:
				if (verificaCad(medicamentos)) {
					// Listando os medicamentos e príncipios
					JOptionPane.showMessageDialog(null, listaMed(medicamentos, 2));
				}
				break;
			case 3:
				if (verificaCad(medicamentos)) {
					// Buscando por nome de principio ativo
					JOptionPane.showMessageDialog(null, listaMed(medicamentos, 3));
				}
				break;
			case 4:
				// Mostrando percentual de memória livre
				JOptionPane.showMessageDialog(null, calculoMemoria(medicamentos));
				break;
			}

		} while (op != 0);
	}

	// Criação do menu
	public static int menu() {
		int op = Integer
				.parseInt(JOptionPane.showInputDialog("PROGRAMA FARMÁCIA TRIER\n\n" + "1 - Incluir medicamento\n"
						+ "2 - Listar todos os medicamentos\n" + "3 - Buscar por nome de princípio ativo\n"
						+ "4 - Mostrar o percentual de memória livre\n" + "0 - Sair do sistema"));

		if (op < 0 || op > 4) {
			JOptionPane.showMessageDialog(null, "Opção Inválida!\nVoltando ao menu principal!");
			return menu();
		}
		return op;
	}

	// Validação do tamanho máximo
	public static boolean verificaTam(ArrayList<Medicamento> medicamentos) {
		if (medicamentos.size() < tamMax) {
			return true;
		}
		JOptionPane.showMessageDialog(null, "Memória cheia!\nPeça para a TI mais espaço!");
		return false;
	}

	// Validação se tem pelo menos um cadastro
	public static boolean verificaCad(ArrayList<Medicamento> medicamentos) {
		if (medicamentos.size() > 0) {
			return true;
		}
		JOptionPane.showMessageDialog(null, "Cadastre um medicamento primeiro!");
		return false;
	}

	// Cadastro de novo medicamento
	public static void cadastroMedicamento(ArrayList<Medicamento> medicamentos) {
		Medicamento m = new Medicamento();

		String prinAtiv = "";
		// Apenas para auxiliar o usuário
		int cont = 0;
		m.nomeComercial = JOptionPane.showInputDialog("Digite o nome do medicamento: ").toUpperCase();

		// Loop para cadastro dos príncipios ativos
		do {
			prinAtiv = JOptionPane
					.showInputDialog(String.format(
							"Nome do princípio ativo %d:\n(Para parar aperte ENTER com o campo vazio)", (cont + 1)))
					.toUpperCase();
			// Verificando se o cadastro do medicamento possui pelo menos um princípio
			// ativo
			if (prinAtiv.equals("") && cont == 0) {
				JOptionPane.showMessageDialog(null, "Um remédio precisa de pelo menos um princípio ativo!!");
			} else if (!prinAtiv.equals("")) {
				m.prinAtiv.add(prinAtiv);
				cont++;
			}
		} while (!prinAtiv.equals("") || cont == 0);

		// Adicionando o medicamento na lista
		medicamentos.add(m);
	}

	// Listagem dos medicamentos
	public static String listaMed(ArrayList<Medicamento> medicamentos, int op) {
		String saida = "";
		// TODOS
		if (op == 2) {
			for (Medicamento m : medicamentos) {
				saida += String.format("Nome comercial: %s\nPrincípios Ativos: ", m.nomeComercial);
				for (int i = 0; i < m.prinAtiv.size(); i++) {
					if (i == m.prinAtiv.size() - 1) {
						saida += m.prinAtiv.get(i) + "\n";
					} else {
						saida += m.prinAtiv.get(i) + ", ";
					}
				}
				saida += "\n";
			}
			return "RELATÓRIO\n\n" + saida;
		} else {
			// POR PRINCÍPIO ATIVO
			String nomeBusca = JOptionPane.showInputDialog("Por qual pricípio ativo você gostaria de buscar? ")
					.toUpperCase();

			for (Medicamento m : medicamentos) {
				boolean achou = false;
				int cont = 0;
				do {
					if (nomeBusca.equals(m.prinAtiv.get(cont))) {
						achou = true;
						saida += m.nomeComercial + "\n";
					}
					cont++;
				} while (!achou && cont < m.prinAtiv.size());
			}

			if (!saida.equals("")) {
				return String.format("RELATÓRIO\n\nMedicamento(s) com o princípio %s cadastrado: \n%s", nomeBusca,
						saida);
			}
			return String.format("Não foi encontrado nenhum medicamento com o princípio ativo %s!", nomeBusca);
		}

	}

	// Calculando percentual de memória
	public static String calculoMemoria(ArrayList<Medicamento> medicamentos) {
		double memOcup = (double) (medicamentos.size() * 100) / tamMax;
		return String.format("Memória Ocupada: %.2f %s \nMemória Livre: %.2f %s ", memOcup, "%", (100 - memOcup), "%");
	}

}
