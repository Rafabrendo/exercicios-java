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

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter full file path: ");
		String path = sc.nextLine();
		
		//D:\workspace\exercicios-java\produtos.txt
		//caminho do arquivo
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			List<Product> list = new ArrayList<>();
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();	
			}
			//Pipeline
			//avg é abreviação de media (average)
			double avg = list.stream()
					.map(p -> p.getPrice())
					.reduce(0.0, (x, y) -> x + y) / list.size();
			
			System.out.println("Avarege price: " + String.format("%.2f", avg));
			
			//Vou declarar o Comparator por causa do Sorted
			//vou comparar dois Strings e compara-los
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			//é um comparador de string que independe de letras maiusculas ou minusculas
			
			
			
			List<String> names = list.stream()
					.filter(p -> p.getPrice() < avg)
					.map(p -> p.getName())
					.sorted(comp.reversed())
					.collect(Collectors.toList());
					//vai retornar o comp na ordem reversa
					
			
			names.forEach(System.out::println);
			
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
		
		
		
		
	}

}
