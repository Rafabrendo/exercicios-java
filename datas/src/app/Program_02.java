package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program_02 {

	public static void main(String[] args) {
		/*
		 * Formatação :
		 * */
		
		LocalDate d01 = LocalDate.parse("2022-08-18");
		LocalDateTime d02 = LocalDateTime.parse("2022-08-18T15:22:26");
		Instant d03 = Instant.parse("2022-08-18T15:22:26Z");
		
		//Link de referencia:
		//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		//No caso do Instant, eu preciso indicar qual fuso-horário. Daí eu utilizo o withZone e passo a função para
		//utilizar o fuso horario do computador
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT; //Para formatar no formato ISO usando o Instant(global)
		
		System.out.println("d01 = "+ d01.format(fmt1)); //d01 = 18/08/2022
		//Para isso eu tenho que chamar o objeto .format() e passar
		//como argumento o fmt1
		System.out.println("d01 = " + fmt1.format(d01) );  //d01 = 18/08/2022
		//Outro jeito de fazer
		System.out.println("d01 = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));//d01 = 18/08/2022
		//Nesse caso ele tá instanciando na hora que rodar ali. obs.: Se instanciar e guardar numa variável 
		//o escopo do objeto poderá ser reaproveitado 
		
		System.out.println("d02 = " + d02.format(fmt1)); //d02 = 18/08/2022
		System.out.println("d02 = " + d02.format(fmt2)); //d02 = 18/08/2022 15:22
		
		System.out.println("d03 = " + fmt3.format(d03));//d03 = 18/08/2022 12:22
		/*O instant não tem o metodo format, porque ele não está numa data local, está numa data ambigua
		 * Para imprimir uma data hora global, que no caso é o instant, eu tenho que declarar, noutro objeto,
		 * qual fuso horário vou considerar.
		 * Daí eu preciso primeiro passar o objeto, fmt3 e dps eu chamo o metodo format e passo o elemento que quero
		 * formatar.
		 * 
		 * d03 = 18/08/2022 12:22
		 * 
		 * Como eu converti, coloquei o horario de londres e dps converti para o horario de brasilia, que está 3h
		 * atrasado, o sistema subtraiu e corrigiu.
		 * */
		
		System.out.println("d02 = " + d02.format(fmt4)); //d02 = 2022-08-18T15:22:26 //Imprimiu no formato ISO
		
		System.out.println("d03 = " + fmt5.format(d03));//d03 = 2022-08-18T15:22:26Z
		
		System.out.println("d03 = "+ d03.toString()); //d03 = 2022-08-18T15:22:26Z

	}

}
