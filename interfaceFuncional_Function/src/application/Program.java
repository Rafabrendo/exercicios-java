package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));
		
		
		//tenho que atribuir esse resultado a uma nova lista
		//List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		//stream() é uma sequência de dados //tive que converter de list para stream() para poder
		//usar o map.
		//o map é uma função que aplica uma função a todos elementos de uma stream e vai gerar
		//uma nova stream() com os elementos transformados. Vai produzir uma nova lista.
		
		//mudar os valores especificos de uma lista ### : 
		//int cont = 0;
		//for(Product p: list) {
		//	p.setName(names.get(cont));
		//	cont += 1;
		//}
		
		//Reference method com metodo estático.
		//List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

		
		//Reference method com método não estático
		//List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());

		//Expressão lambda declarada:
		//Tem que ser uma Function que recebe um Product e retorna uma String
		//Function<Product, String> func = p -> p.getName().toUpperCase();
		
		//List<String> names = list.stream().map(func).collect(Collectors.toList());
		
		//Expressão lambda inline
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

		
		
		names.forEach(System.out::println); 
		System.out.println();
		
		//list.forEach(System.out::println);
		
		
		
	}

}
