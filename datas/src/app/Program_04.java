package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program_04 {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		//Estou instanciando uma nova data que seria o d04 - 7 dias.
		
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		//Estou instanciando uma data com d04 mais 7 dias
		
		System.out.println("pastWeekLocalDate = "+ pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = "+ nextWeekLocalDate);
		/*pastWeekLocalDate = 2022-07-13
		  nextWeekLocalDate = 2022-07-27
		  */
		
		LocalDate nextYearLocalDate = d04.plusYears(7);
		System.out.println("nextYearLocalDate = "+ nextYearLocalDate);
		//nextYearLocalDate = 2029-07-20 //Acrescentou 7anos
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
	    LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
	    
	    System.out.println("pastWeekLocalDateTime = "+ pastWeekLocalDateTime);
	    System.out.println("nextWeekLocalDateTime = "+ nextWeekLocalDateTime);
		/*pastWeekLocalDateTime = 2022-07-13T01:30:26
          nextWeekLocalDateTime = 2022-07-27T01:30:26*/
	    
	    Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
	    Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
	    //Eu tenho que usar o ChronoUnit para especificar, no Instant, o que eu vou diminuir ou aumentar.
	    System.out.println("pastWeekInstant = "+ pastWeekInstant );
	    System.out.println("nextWeekInstant = "+ nextWeekInstant);
	    /*pastWeekInstant = 2022-07-13T01:30:26Z
		  nextWeekInstant = 2022-07-27T01:30:26Z
	     * */
	    
	    //Duração entre dois objetos de horas 
	    
	    Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atTime(0, 0));
	    //atTime é um conversor de localDate para LocalDateTime -> 0hora e 0 minuto, respectivamente
	    
	    //System.out.println("t1 dias  = "+ t1.toDays());
	    //t1 dias  = 7 //Sete dias de duração entre essas duas datas
	    //to___, days, Hours, Minutes,...
	    
	    Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
	    
	    System.out.println("t1 dias = "+ t1.toDays());
	    System.out.println("t2 dias = "+ t2.toDays());
	    
	    /*Não tem como calcular o tempo de duração entre dois LocalDates.
	     * Eu tenho que converter eles para o LocalDateTime*/
	    /*
	     * t1 dias = 7
		   t2 dias = 7*/
	    
	    Duration t3 = Duration.between(pastWeekInstant, d06);
	    
	    
	    System.out.println("t3 dias = "+ t3.toDays());
		//t3 dias = 7
	    
	    Duration t4 = Duration.between(d06, pastWeekInstant);
	    //menor - maior
	    System.out.println("t4 dias = "+ t4.toDays());
	    //t4 dias = -7
	    
	}

}
