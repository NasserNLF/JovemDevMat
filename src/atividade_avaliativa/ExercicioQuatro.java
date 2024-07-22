package atividade_avaliativa;

import javax.swing.JOptionPane;

public class ExercicioQuatro {
	public static void main(String[] args) {
		double valorAlcool = Double.parseDouble(JOptionPane.showInputDialog("Programa para verificar se está sendo mais vantajoso abastecer com álcool ou gasolina\nInforme o valor do litro do álcool: "));
		double valorGasolina = Double.parseDouble(JOptionPane.showInputDialog("Agora informe o valor do litro da gasolina: "));
		
		//Cálculo para a comparação
		valorGasolina *= 0.7; 
		
		//Verificação
		if(valorAlcool < valorGasolina) {
			JOptionPane.showMessageDialog(null, "Hoje está valendo mais a pena abastecer com álcool!\n(O valor do litro do álcool está pelo menos 30% inferior )");
		}else {
			JOptionPane.showMessageDialog(null, "Hoje está valendo mais a pena abastecer com gasolina!\n(O valor do litro do álcool não está 30% inferior ao da gasolina )");			
		}
		
	}

}
