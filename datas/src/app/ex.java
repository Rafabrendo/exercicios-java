package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ex {
	
	public static void main(String[] args) {
       /* String dataString = "2023-09-15";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            LocalDate data = LocalDate.parse(dataString, fmt);
            System.out.println("Data em formato de objeto LocalDate: " + data);
        } catch (Exception e) {
            e.printStackTrace();
        }
       */
		
	   
		String dataString = "2023-09-15"; // Sua data em formato de string
    	DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            LocalDate data = LocalDate.parse(dataString, formato);
            System.out.println("Data em formato de objeto LocalDate: " + data);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	}

