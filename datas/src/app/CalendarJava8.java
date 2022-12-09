package app;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class CalendarJava8 {

	public static void main(String[] args) {
		//Manipulando uma data com Calendar
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		//T de time
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d)); // 25/06/2018 12:42:07
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		//Isso vai fazer com que pegue a minha data do calendario e seja acrescentado a ela, 4 horas
		d = cal.getTime();
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);
		
		
		System.out.println(sdf.format(d)); // 25/06/2018 16:42:07
		
		System.out.println("Minutes: "+ minutes); //Minutes: 42
		
		System.out.println("Month: "+ month);
		//Era para aparecer 6, mas apareceu 5. Isso porque no calender, janeiro é o mês zero. É só acrescentar 1 no month
		//Month: 6
	}

}
