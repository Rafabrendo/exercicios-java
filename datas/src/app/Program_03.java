package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program_03 {

	public static void main(String[] args) {
		/*
		 * Converter data-hora global para local, tem que informar o timezone
		 * 
		 * Obter dados de uma data-hora local
		 * */
		
		//Para converter de global para local, tenho que especificar o timezone
		
		//ZoneId.getAvailableZoneIds() vai retornar uma coleção com os nomes dos fuso-horarios customizados
		/*for(String s: ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}
		Para ver todos os ZoneId
		*/
		
		LocalDate d04 = LocalDate.parse("2022-08-18");
		LocalDateTime d05 = LocalDateTime.parse("2022-08-18T01:30:26");
		Instant d06 = Instant.parse("2022-08-18T01:30:26Z");
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		/*Time zona da minha propria maquina -> ZoneId.systemDefault())
		 * */
		System.out.println("r1 = "+ r1); //r1 = 2022-08-17
		/*Lembre-se: Na conversão do horário global para o local, e virse-versa, o horário e o dia podem mudar.
		 * Nesse caso, mudou!*/
		
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		System.out.println("r2 = "+ r2);//r2 = 2022-08-18
		
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println("r3 = " + r3);//r3 = 2022-08-17T22:30:26 //No fuso-horario da maquina
		System.out.println("r4 = " + r4);//r4 = 2022-08-18T02:30:26 //No fuso-horario de Portugal
		
		System.out.println("d04 dia = "+ d04.getDayOfMonth());//d04 dia = 18
		System.out.println("d04 dia = "+ d04.getMonthValue());//d04 dia = 8
		System.out.println("d04 dia = "+ d04.getYear());//d04 dia = 2022
		
		System.out.println("d05 hora = "+ d05.getHour()); //d05 hora = 1
		System.out.println("d05 hora = "+ d05.getMinute()); //d05 hora = 30
		
		
		

	}

}
