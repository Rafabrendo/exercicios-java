package application;

import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Set<Product> set = new TreeSet<>();
		//Quando se usa o TreeSet, a classe do conjunto(set), que nesse caso é o Product, ela tem
		//que ser uma implementação do Comparable
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		//Product prod = new Product("Notebook", 1200.0);
		
		//System.out.println(set.contains(prod));
		
		//vai ordenar os produtos por nome 
		for(Product p : set) {
			System.out.println(p);
		}

	}

}
