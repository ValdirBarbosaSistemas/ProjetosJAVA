package datas;

import java.time.LocalDate;
import java.time.Period;

public class Periodo {

	public static void main(String[] args) {
		
		LocalDate dataAntiga = LocalDate.of(2023, 01, 01);
		LocalDate dataNova = LocalDate.of(2023, 05, 01);
		
		Period periodo = Period.between(dataAntiga, dataNova);
		
		System.out.println(periodo.getYears());
		System.out.println(periodo.getMonths());
		System.out.println(periodo.getDays());
	}
}
