package datas;

import java.time.LocalDate;

public class ParcelasLocalDate {
	public static void main(String[] args) {
		LocalDate dataBase = LocalDate.parse("2019-10-05");
		
		System.out.println("Adicionando mais dias: " + dataBase.plusDays(5));//Adicionando mais 5 dias ao vencimento
		System.out.println("Diminuindo mais dias: " + dataBase.minusDays(3)); //Dominuindo mais 5 dias ao vencimento
		
		
	}
}
