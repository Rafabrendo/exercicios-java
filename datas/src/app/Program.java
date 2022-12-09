package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		
		/*
		 * Várias formas que se tem para instanciar data-hora :
		 * */
		
		
		//Link de referencia:
		//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//vou jogar o fmt1, que diz respeito a como interpretar o texto e converter para data-hora, no parse
		
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();  //LoaclDate.now() é um método estático
		//Tenho que importar o LocalDate (ctrl + shift + o)
		System.out.println("d01 = "+d01);
		//Vai mostrar: 2022-08-17
		
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println("d02 = "+d02);
		//d02 = 2022-08-17T14:25:27.528265900  
		//gerou com a fração de segundos
		
		Instant d03 = Instant.now(); //Data hora global. Vai gerar no GMT ou horário de Londrez
		System.out.println("d03 = "+ d03);
		//d03 = 2022-08-17T17:27:23.382266900Z   //3 horas a frente
		//T -> time
		//Z -> Zulu time = GMT = UTC
		// Eu posso -> converter a data-hora global em local
		
		
		//Peguei um texto ISO 8601 e gerei uma Data-hora a partir dele:
		LocalDate d04 = LocalDate.parse("2022-08-17");
		System.out.println("d04 = "+ d04); //d04 = 2022-08-17
		
		LocalDateTime d05 = LocalDateTime.parse("2022-08-17T15:11:36");
		System.out.println("d05 = "+ d05.toString()); //d05 = 2022-08-17T15:11:36
		//toString() é opcional
		
		/*Quando eu chamo um objeto qualquer dentro do print, a propria execução do programa detecta o contexto
		 * e chama o toString do objeto. É como se eu chamasse o toString() em cada um deles, implicitamente.
		 * Posso fazer d05.toString() , isso dentro do print*/
		
		Instant d06 = Instant.parse("2022-08-17T15:11:36Z");
		System.out.println("d06 = "+ d06.toString());//.toString() é opcional
		
		Instant d07 = Instant.parse("2022-08-17T15:11:36-03:00");
		//-03:00 eu estou especificando um horário diferente do GMT de Londres
		//Esse GMT-03:00 é o de Brasília
		System.out.println("d07 = "+ d07.toString());
		//d07 = 2022-08-17T18:11:36Z //horário 3 horas adiantado 
		
		//Texto no formato customizado :
		LocalDate d08 = LocalDate.parse("17/08/2022", fmt1); //Eu tenho que especificar dd/mm/aaaa . Eu faço isso com 
		//DateTimeFormatter, alocando esse valor numa variavel e passando essa variavel no metodo parse
		/*Eu poderia ter colocado a chamada dentro dos parentese. 
		 * Ex.:
		 * LocalDate d08 = LocalDate.parse("17/08/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		 * */
		
		System.out.println("d08 = "+ d08.toString());
		//d08 = 2022-08-17
		
		LocalDateTime d09 = LocalDateTime.parse("17/08/2022 15:04", fmt2);
		
		System.out.println("d09 = "+ d09.toString()); //d09 = 2022-08-17T15:04
		
		
		LocalDate d10 = LocalDate.of(2020, 8, 18);
		System.out.println("d10 = "+ d10); //d10 = 2020-08-18
		
		LocalDateTime d11 = LocalDateTime.of(2020, 8, 18, 15, 16);
		System.out.println("d11 = "+ d11); //d11 = 2020-08-18T15:16
		

	}

}
