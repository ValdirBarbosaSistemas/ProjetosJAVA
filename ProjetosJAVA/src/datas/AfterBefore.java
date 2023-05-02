package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AfterBefore {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date dataVencimentoBoleto = simpleDateFormat.parse("30/04/2023");

		Date dataAtualHoje = simpleDateFormat.parse("28/04/2023");

		if (dataAtualHoje.after(dataVencimentoBoleto)) {
			System.out.println("Boleto vencido - URGENTE!");
		} else {
			System.out.println("Boleto esta em dia");
		}
	}//After (Depois) Before (Antes)
}
