package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Datas {
	public static void main(String[] args) throws ParseException {		
		Date datas = new Date();
		
		System.out.print(datas);//Mostra a data atual
		System.out.println(datas.getDate());//Mostra dia do mes
		System.out.println(datas.getDay());//Mostra dia da Semana
		System.out.println(datas.getHours());//Mostra a hora do dia
		/**
		 * VERIFICAR A DOCUMENTACAO, POIS HÁ MÉTODOS QUE
		 * ESTÃO DEPRECIADOS, OU SEJA, FORAM MODIFICADOS
		 * PARA A CLASSE "CALENDAR"
		 */
		
		/*---------------------SIMPLE DATE FORMAT-------------------*/
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		/**
		 * A classe SimpleDateFormat serve para pegar
		 * uma data e converte para um formato, ou pega
		 * uma data formatada e converte para um objeto
		 * do tipo date detre outros...
		 */
		
		System.out.println("Data atual em formato padrão e String: " + simpleDateFormat.format(datas));
		/**
		 * Como podemos ver, ele pega a data passada como texto 
		 * na variável 'simpleDateFormat' e converte para o objeto 
		 * datas que é do tipo Date.
		 */
		
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Data com formato de Banco de dados: " + simpleDateFormat2.format(datas));
		
		SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Qual foi o dia do seu nascimento?: " + simpleDateFormat3.parse("02/03/1987"));
		/**
		 * Nessa situação, para se usar o "Parse", ou lançamos a exception
		 * ou se envolve em um try/catch
		 */

		/**
		 * A partir do Java 8, chega a nova API de datas como veremos abaixo
		 */

		LocalDate localDate = LocalDate.now();//Mostra a data local
		LocalDateTime localDateTime = LocalDateTime.now();//Mostra a data e hora atual
		Instant instant = Instant.now();//Mostra a data e hora GLOBAL GMT
		
		
		/*-------------------NOVO TIPO DE FORMATACAO DE DATAS-------------------*/
		
		System.out.println("LocalDateFormat com formatação: " + localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
		
		//Dia, mes, ano e semana
		
		System.out.println("Dia da semana: " + localDate.getDayOfWeek());
		System.out.println("Dia do mês: " + localDate.getDayOfMonth());
		System.out.println("Dia do ano: " + localDate.getDayOfYear());


		/*-----------CONVERSAO DATA-HORA GLOBAL PARA LOCAL----------------*/

		for (String s : ZoneId.getAvailableZoneIds()) {
			System.out.println(s);//Ira mostrar todas as zonas de data GLOBAL
		}


		LocalDate dataLocal = LocalDate.parse("2022-07-20");
		Instant dataGlobal = Instant.parse("2022-07-20T01:30:26Z");

		LocalDate r1 = LocalDate.ofInstant(dataGlobal, ZoneId.systemDefault());//Vai pegar do PC
		LocalDate r2 = LocalDate.ofInstant(dataGlobal, ZoneId.of("America/Sao_Paulo"));

		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
	}
}
