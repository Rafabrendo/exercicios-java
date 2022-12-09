package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Enter rental details: ");
		System.out.print("Model of car: ");
		String carModel = sc.nextLine();
		System.out.print("Car pick-up date(dd/MM/yyyy HH:mm):");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		//Chamei o LocalDateTime e passei o jeito que quero que ele leia, com o formato fmt que está ali em cima
		System.out.print("Car return date(dd/MM/yyyy HH:mm):");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
		
		
		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
		
		System.out.print("Enter price per hour: ");
		double pricePerHour = sc.nextDouble();
		System.out.print("Enter price per day:");
		double pricePerDay = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		//na hora de instancia o Rental Service, eu informo uma implementação do meu serviço, que no caso é o BrazilTaxService
		//Essa instancia de BrazilTaxService é um upperCasting
		//a BrazilTaxService é um tipo mais especifico concreto.
		//É instanciado aqui e injetado no RentalService por meio do construtor
		
		rentalService.processInvoice(cr);
		
		System.out.println("Invoice: ");
		System.out.println("Base payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("Total payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));
		
		
		
		
		
		
		
		
		sc.close();
	}

}
