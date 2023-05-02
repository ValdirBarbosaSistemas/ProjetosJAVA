package datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CronoUnit {
	
	public static void main(String[] args) throws ParseException {
		
		Long dias = ChronoUnit.DAYS.between(LocalDate.parse("2020-04-01"), LocalDate.now());
		
		System.out.println("Possui " + dias + "dias entre a faixa de data");
	}
	/**
	 * O método 'between' do ChronoUnit recebe como parâmetro dois objetos
	 * do tipo TEMPORAL que pode ser qualquer tipo. No nosso caso colocamos
	 * o objeto LocalDate.
	 */
}
