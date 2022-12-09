package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class DateJava8 {

	public static void main(String[] args) throws ParseException {
		//throws ParseException é uma declaração de excessão
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		//Para especificar qual time zone utilizar
		//Obs.: Antes tava imprimindo no horário de brasilia
		
		
		
		Date x1 = new Date();
		//Vai instanciar a data atual e alocar na variavel x1
		Date x2 = new Date(System.currentTimeMillis());
		//Pega o instante do meu sistema, converte para milisegundos
		
		Date x3 = new Date(0L);
		//Passei um numero de milisegundos qualquer. Passei 0 miliSegundos
		//L -> long
		
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		//milisegundos tem mil, que equivale a um segundo,  60 segundos, 1 minuto, 60 minutos, 1 hora, * 5 horas
		//Para criar uma data, as 5am do dia 1 de janeiro de 1970. Que é a hora que o java guardou e começou a contar horas
		
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(y1);
		System.out.println(y2);
		
		/*Mon Jun 25 00:00:00 BRT 2018
		  Mon Jun 25 15:42:07 BRT 2018*/
		
		System.out.println(sdf2.format(y1));
		System.out.println(sdf2.format(y2));
		/*25/06/2018 00:00:00
		  25/06/2018 15:42:07*/
		
		System.out.println(x1);
		/*Tue Aug 23 11:15:28 BRT 2022*/
		System.out.println(x2);
		/*Tue Aug 23 11:15:28 BRT 2022*/
		System.out.println(x3);
		//Wed Dec 31 21:00:00 BRT 1969
		System.out.println(x4);
		//Thu Jan 01 02:00:00 BRT 1970
		//imprimiu as 2h porque é em relação ao GMT e eu estou no horario de brasilia, então -3:00
		
		System.out.println(sdf2.format(y3));
		//Mon Jun 25 12:42:07 BRT 2018
		//25/06/2018 12:42:07
		System.out.println("---------");
		System.out.println(sdf3.format(y1));
		System.out.println(sdf3.format(y2));
		System.out.println(sdf3.format(x1));
		System.out.println(sdf3.format(x2));
		System.out.println(sdf3.format(x3));
		System.out.println(sdf3.format(x4));
		/*25/06/2018 03:00:00
         25/06/2018 18:42:07
         23/08/2022 14:36:32
         23/08/2022 14:36:32
	     01/01/1970 00:00:00
		 01/01/1970 05:00:00*/
		
	}

}
