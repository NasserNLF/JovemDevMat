package aula_introducao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExemploDatas2 {

	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("dd/MM/yy"); 
		Date dtAtual = new Date();	// Pega a data atual		
		
		String dtNascStr = "28/02/1976";
		Date dtNasc = null;
		
		try {
			dtNasc = df.parse(dtNascStr);
		} catch (Exception e) {
			System.err.println("Data inválida");
		}
	
		Calendar clNasc = Calendar.getInstance();
		clNasc.setTime(dtNasc);
	
		Calendar clAtual = Calendar.getInstance();
		clAtual.setTime(dtAtual);
		
		// Adiciona dias à data atual (clAtual)
		
		
		System.out.println(df.format(clNasc.getTime()));
		
		
		
		
	}

}
