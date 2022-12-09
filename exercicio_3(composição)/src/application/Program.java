package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email:");
		String email = sc.nextLine();
		System.out.println("Birth date(DD/MM/YYYY): ");
		Date date = sdf.parse(sc.next()); 
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
