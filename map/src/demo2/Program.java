package demo2;

import java.util.HashMap;
import java.util.Map;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Map<Product, Double> stock = new HashMap<>();
		
		Product p1 = new Product("Tv", 900.0);
		Product p2 = new Product("Notebook", 1200.0);
		Product p3 = new Product("Tablet", 400.0);
		
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		Product ps = new Product("Tv", 900.0);
		
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
		//Contains 'ps' key: false //Isso porque eu não coloquei o Equals e HashCode. O Map para comparar
		//um elemento de key(chave) utiliza o equals e hashCode e por isso eu tenho que te-lo na classe, que 
		//nesse caso é a Product.
		//Se não tiver o Equals e hashCode, ele vai utilizar a comparação de ponteiros. Como nesse caso 
		//são dois objetos diferentes, as referencias de ponteiro estão diferentes e por isso o Map não 
		//encontrou o produto ps.
		
		
		
		//Contains 'ps' key: true
		//Agora deu true porque eu coloquei equals e hashcode.
		
	}

}
