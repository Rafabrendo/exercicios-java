package predicate;

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
		
		//list.removeIf(p -> p.getPrice() >= 100);
		//vou remover todo produto p, tal que, p tenha o preço maior ou igual a 100.
		//ou seja, produtos maiores ou iguais a 100 serão removidos.
		
		
		//vou colocar o meu predicado implementando manualmente por meio da interface.
		//list.removeIf(new ProductPredicate());//objeto instanciado da minha classe
		//coloquei uma instancia de minha classe ProductPredicate(); que vai me retornar true ou false 
		//para determinados valores.
		
		//list.removeIf(Product::staticProductPredicate); //Method reference(referencia de metodo)
		//coloco o nome da classe, onde o metodo está :: nome do metodo
		
		
		//Reference method com método não estático
		//list.removeIf(Product::nonstaticProductPredicate);
		
		
		//Posso colocar um valor parametrizado ou passa-los pela Scanner
		double min = 100.0;
		
		//Expressão lambda declarada
		//Predicate<Product> pred = p -> p.getPrice() >= 100.0;
		//Predicate<Product> pred = p -> p.getPrice() >= min;	
		//list.removeIf(pred);
		
		
		//Expressão lambda inline
		list.removeIf(p -> p.getPrice() >= min);
		
		
		
		for(Product p: list) {
			System.out.println(p);
		}
		
	}

}
