package aula_introducao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExemploDatas {

	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("dd/MM/yy"); // Assim surgiu as Datas no java!
		Date dataAtual = new Date();		
		System.out.println(dataAtual);
		System.out.println(df.format(dataAtual));
		
		String dataNascimento = "28/12/1976";
		
		System.out.println(dataNascimento.substring(0,2));
		System.out.println(dataNascimento.substring(3,5));
		System.out.println(dataNascimento.substring(6));
		
		Date dataNascimentoDate = null;
		
		try {
			dataNascimentoDate = df.parse(dataNascimento);
		} catch (Exception e) {
			System.err.println("Data Inválida");
		}
		System.out.println(dataNascimentoDate);
		
	}
	
}
