package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Name: ");
		employee.name = sc.nextLine();
		//sc.nextLine();
		System.out.println("Gross salary: ");
		employee.GrossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();
		
		
		System.out.println("Employee: " + employee);
		
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.IncreaseSalary(percentage);
		
		System.out.println();
		System.out.print("Updated data: " + employee);
		
		
		
		
		
		sc.close();

	}

}
