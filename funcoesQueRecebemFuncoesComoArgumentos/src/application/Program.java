package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import model.services.ProductService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));
		
		ProductService ps = new ProductService();
		
		//double sum = ps.filteredSum(list);
		
		//double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
		//Daí eu passei a expressão lambda, que vai ser passada como predicado
		//Isso é topper!!!
		
		//double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'M');
		
		double sum = ps.filteredSum(list, p -> p.getPrice() < 100.0);
									//predicado
		//Tenho uma função super flexivel que utliza a list e uma condição para o qual e vou querer
		//usar para filtrar a lista
		
		System.out.println("Sum = " + String.format("%.2f", sum));
		
		//System.out.println(ps.filteredSum(list)); //Somei a tv + o tablet
		
		
		
	}

}
