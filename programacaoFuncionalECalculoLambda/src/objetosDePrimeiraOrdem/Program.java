package objetosDePrimeiraOrdem;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {
	
	public static int compareProducts(Product p1, Product p2) {
		//vai comparar por pre�o
		return p1.getPrice().compareTo(p2.getPrice());
	}
	

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		//Utilizei o method references, operador ::
		list.sort(Program::compareProducts); //Vai listar os Products por pre�o, do menor para o maior
		//Passei a referencia para a fun��o compareProducts no argumento
		//Program::compareProducts 
		//Passei uma fun��o como argumento para outra fun��o. Isso que significa que uma fun��o
		//� um objeto de primeira classe ou primeira ordem
		
		list.forEach(System.out::println);
		
		
		
	}

}
