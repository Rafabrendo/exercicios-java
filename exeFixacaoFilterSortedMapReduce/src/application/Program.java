package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String Path = "D:\\workspace\\exercicios-java\\dados.txt";
		System.out.print("Enter salary: ");
		Double sup = sc.nextDouble();
		
		try(BufferedReader br = new BufferedReader(new FileReader(Path))){
			
			List<Employee> list = new ArrayList<>();
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			//Pipeline
			double sum = list.stream()
					.filter(p -> p.getName().startsWith("M"))
					.map(p -> p.getSalary())
					.reduce(0.0, (x, y) -> x + y);
			//Poderia ter colocado .charAt(0)== 'M' no filter, mas desse jeito funcionou tbm. 
			
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> names = list.stream()
					.filter(p -> p.getSalary() > sup)
					.map(p -> p.getEmail())
					.sorted(comp)
					.collect(Collectors.toList());
			
			System.out.println("Email of people whose salary is more than "+ String.format("%.2f", sup));
			
			names.forEach(System.out::println);
			
			System.out.println("Sum of people whose bane starts with 'M': "+ String.format("%.2f", sum));
			
			
			
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}

}
