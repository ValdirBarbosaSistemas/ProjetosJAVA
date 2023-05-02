package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendarr {
	public static void main(String[] args) throws ParseException {
		Calendar calendar = Calendar.getInstance(); 
		//Dessa forma que "Instanciamos/Chamamos" os métodos do Calendar
		
		System.out.println(calendar.getTime());//Pega a data atual
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));//Ira pegar o dia do mes em que estamos atualmente
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));//Mostra a hora do dia atual
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Calendar Data atual em formato padrao String: " + simpleDateFormat.format(calendar.getTime()));
		
		//----------------CALCULANDO DIA, ANO, MES COM CALENDAR-------------------------
		
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2023"));//Definindo uma data qualquer
		
		calendar.add(Calendar.DAY_OF_MONTH, 5);//Aqui ele ta aumentando 5 dias a frente NO DIA DO MES (CASO DIMINUIR, TERIA QUE COLOCAR O SINAL '-'
		
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
	}
	
}
