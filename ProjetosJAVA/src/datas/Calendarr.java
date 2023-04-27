package datas;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendarr {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance(); 
		//Dessa forma que "Instanciamos/Chamamos" os métodos do Calendar
		
		System.out.println(calendar.getTime());//Pega a data atual
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));//Ira pegar o dia do mes em que estamos atualmente
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));//Mostra a hora do dia atual
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Calendar Data atual em formato padrao String: " + simpleDateFormat.format(calendar.getTime()));
	}
	
}
