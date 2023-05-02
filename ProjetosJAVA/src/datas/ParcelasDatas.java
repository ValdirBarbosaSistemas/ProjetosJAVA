package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ParcelasDatas {
	public static void main(String[] args) throws ParseException {
		
		//Gerando parcelas mensais
		
		Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("08/04/2023");//Data inicial
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInicial);
		
		for (int parcela = 1; parcela <= 12; parcela++) {
			calendar.add(Calendar.MONTH, 1);
			
			System.out.println("Parcela numero: " + parcela + " vencimento em: " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		}
	}

}
