package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Program {

	public static void main(String[] args) {
		
		/*
		//Meu teste:
		Employee x = new OutsourceEmployee("Rafa", 100, 15.0, 200.0);
		
		Employee y = new Employee("Bob", 50, 20.0);
		
		System.out.println(x.payment());
		System.out.println(y.payment());
		*/
		

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//vou passar os dados de cada funcionario e serão armazenados numa lista e o 
		//tipo de dados de cada lista pode ser Employee ou OutsourceEmployee
		List<Employee> list = new ArrayList<>();
		
		System.out.println("Enter the number of Employees: ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++ ) {
			System.out.println("Employee #"+i+" data:");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0); //y ou n
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Hours: ");
			int hours = sc.nextInt();
			System.out.println("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if(ch == 'y') {
				System.out.println("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				// Posso fazer asssim tbm : Employee emp = new OutsourceEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(new OutsourceEmployee(name, hours, valuePerHour, additionalCharge));
			}
			else {
				//posso fazer assim tbm: Employee emp = new Employee(name, hours, valuePerHour);
				//Posso instanciar direto na lista
				list.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		for(Employee emp: list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		
		
		
		
		
		sc.close();
	}

}
