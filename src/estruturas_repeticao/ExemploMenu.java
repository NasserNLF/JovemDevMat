package estruturas_repeticao;

import javax.swing.JOptionPane;

public class ExemploMenu {
	public static void main(String[] args) {
		String menu = "1 - Feijoada\n2 - Sushi\n3 - Lasanha\n4 - Pad Thai\n9 - Fechar o pedido";
		String pedido = "";

		int op = 9;

		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
			switch (op) {
			case 1:
				pedido += "Feijoada\n";
				break;
			case 2:
				pedido += "Sushi\n";
				break;
			case 3:
				pedido += "Lasanha\n";
				break;
			case 4:
				pedido += "Pad Thai\n";
				break;
			case 9:
				if (pedido.equals("")) {
					pedido = "Pedido Vazio";
				}
				break;
			}

		} while (op != 9);

		JOptionPane.showMessageDialog(null, pedido);
	}

}
