package metodos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ExemploClasses {
	public static void main(String[] args) {
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		cadastra(alunos);
		cadastra(alunos);
		cadastra(alunos);
		JOptionPane.showMessageDialog(null, verificaSituacao(alunos.get(0)));
		JOptionPane.showMessageDialog(null, verificaSituacao(alunos.get(1)));
		JOptionPane.showMessageDialog(null, verificaSituacao(alunos.get(2)));
		
		
	}
	
	public static void cadastra(ArrayList<Aluno> alunos) {
		Aluno a = new Aluno();
		
		a.nome = JOptionPane.showInputDialog("Nome: ");
		double nota = 0;
		
		do {
			nota = Double.parseDouble(JOptionPane.showInputDialog("Nota: (-1 para sair)"));
			
			if (nota != -1) {
				a.notas.add(nota);
			}
			
			
		} while (nota != -1);
		alunos.add(a);
	}
	
	public static double calculaMedia(ArrayList<Double> notas) {
		double soma = 0;
		for(Double d : notas) {
			soma += d;
		}
		return soma / notas.size();
	}
	
	public static String verificaSituacao(Aluno a) {
		double media = calculaMedia(a.notas);
		
		if (media >= 7) {
			return a.nome + ": APROVADO";
		}else if (media  < 3) {
			return a.nome + ": REPROVADO";
		}
		return a.nome + ": EM RECUPERAÇÃO";
	}
	
	public static Aluno maiorMedia(ArrayList<Aluno> alunos) {
		Aluno maior = alunos.get(0);
		double mediaMaior = calculaMedia(maior.notas);
	 
		for(Aluno a : alunos) {
			double mediaAlunoLista = calculaMedia(a.notas);
			if (mediaAlunoLista > mediaMaior) {
				mediaMaior = mediaAlunoLista;
				maior = a;
			}
			
		}
		return maior;
		
	}

}
