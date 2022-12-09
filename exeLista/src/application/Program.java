package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		//Tipo Employee -> generics
		System.out.println("How manu employees will be registered?");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Employee #" + (i+1) + ": ");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while(hasId(list, id)) {
				System.out.println("Id already taken! Try again.");
				id = sc.nextInt();
			}
			
			
			
			
			System.out.print("Name: ");
			sc.nextLine();//Pra limpar o buffer de entrada
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			//Instanciei o Employee e criei o objeto emp
			list.add(emp);
			//adicionei o objeto emp na lista 
		}
		
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase: ");
		int idsalary = sc.nextInt();
		
		Integer pos = position(list, idsalary);
		//pos == null
		if(pos == -1) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee emp : list) {
			System.out.println(emp);
			/*Quando dentro da estrutura tiver apenas um comando,
			 * as chaves são opcionais.*/
		}
		
		/*Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist! ");
		}
		else {
			System.out.println("Enter the percentage:");
		}
		*/
		
		
		
		
		
		sc.close();
	}
	//Não preciso colocar o public porque está na mesma classe
	/*Vou passar como parametro a lista de funcionarios e um id. Ela vai me retornar
	 * a posição desse funcionario na lista.
	 * Esse List é uma nova variavel e não tem ligação com a minha list de cima.
	 * 
	 * Tenho que colocar static porque o meu main é static
	 * */
	public static Integer position (List<Employee> list, int id) {
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
		}
	  }	
		return -1; 
		//Significa que o elemento não foi encontrado
		// ou retorno null
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId()== id).findFirst().orElse(null);
		return emp != null;
	}
}