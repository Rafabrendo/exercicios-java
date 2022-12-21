package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));
		
		//list.forEach(new PriceUpdate());//vou passar uma instancia do objeto PriceUpdate
		//forEach é um default method que vai percorrer a coleção e vai executar um 
		//consumer nesta coleção para cada elemento
		//o forEach vai percorrer a lista aplicando o novo preço, a cada elemento da lista
		
		//Reference method com metodo estático.
		//list.forEach(Product::staticPriceUpdate);
		
		//Reference method com método não estático.
		//list.forEach(Product::nonstaticPriceUpdate);
		
		//Expressão lambda declarada
		
		//vou usar uma variavel para a taxa
		double factor = 1.1; //assim fica mais flexível
		
		//como tem apenas uma linha a minha função anônima, as chaves são opcionais.
		//Consumer<Product> cons = p -> {
		//	p.setPrice(p.getPrice() * factor);
		//};
		
		//list.forEach(cons);
		
		//Expressão lambda inline:
		list.forEach(p -> p.setPrice(p.getPrice() * factor));
		
		
		//vou imprimir a lista
		list.forEach(System.out::println); //Estou usando um reference method para o metodo println
		//assim eu vou imprimir a lista
		
		
	}
}
