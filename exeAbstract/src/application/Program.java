package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		List<Person> list = new ArrayList<Person>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Tax payer #"+i+" data:");
			System.out.println("Individual or company (i/c)?");
			char ch = sc.next().charAt(0);
			if(ch != 'i' && ch != 'c') {
				do{
					System.out.println("I did'nt understand. Try again!");
					System.out.println("Individual or company (i/c)?");
					ch = sc.next().charAt(0);
				}while(ch == 'i'|| ch == 'c');
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double income = sc.nextDouble();
			if (ch == 'i') { 
				System.out.print("Health income: ");
				double healthIncome = sc.nextDouble();
				list.add(new Individual(name, income, healthIncome));
				
			}
			else if(ch == 'c') {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				list.add(new Company(name, income, employees));
			}
		}
		
		System.out.println();
		//double sum = 0.0;
		System.out.println("TAXES PAID:");
		for(Person date: list) {
			System.out.println(date.getName() +": $ "+ String.format("%.2f", date.paymentRate()));
			//sum += date.paymentRate();
		}
		
		//Obs.: Melhor colocar a soma em outro for, é um dos principios de responsabilidade unica
		//tbm é mais fácil de fazer a manutenção
		double sum = 0.0;
		for(Person date: list) {
			sum += date.paymentRate();
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", sum);
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
