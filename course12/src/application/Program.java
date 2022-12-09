package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Registration;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int account = sc.nextInt();
		System.out.print("Enter account holder: ");
		String name;
		
		name = sc.nextLine();
		name = sc.nextLine();
		
		Registration registration;
		
		System.out.print("Is there an initial deposit (y/n)");
		char answer = sc.next().charAt(0);
		//tenho que colocar uma condição aqui!
		if (answer == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			registration = new Registration(name, initialDeposit, account);
		}
		else {
			registration = new Registration(name, account);
		}
		
		System.out.println("Account data:");
		System.out.print(registration);
		System.out.println();
		
		System.out.println("Enter a deposit value: ");
		double depositPositive = sc.nextDouble();
		registration.depositPositive(depositPositive);
		
		System.out.println("Account data:");
		System.out.print(registration);
		System.out.println();
		
		System.out.println("Enter a withdraw value: ");
		double depositNegative = sc.nextDouble();
		registration.depositNegative(depositNegative);
		
		System.out.println("Account data:");
		System.out.print(registration);
		
		
		
		
		sc.close();
	}

}
