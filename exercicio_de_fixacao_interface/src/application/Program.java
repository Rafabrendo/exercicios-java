package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		System.out.println("Enter contract data: ");
		System.out.print("Number of contract:");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		//Pego o texto que o usuario digitou e dou um parse pra virar um localDate, e vou passar fmt
		//para a data ficar nesse formato
		System.out.print("Contract value: ");
		double totalValue = sc.nextDouble();
		
		Contract obj = new Contract(number, date, totalValue);
		
		System.out.print("Enter the number of installments:");
		int n = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		//vou passar null porque ainda não implementei a interface
		//agora que eu tenho a interface, eu passo ela no parametro para ser instanciada
		
		contractService.processContract(obj, n);
		
		System.out.println("Parcelas: ");
		for (Installment installment: obj.getInstallments()) {
			System.out.println(installment);
		}
		

		
		sc.close();
	}

}
