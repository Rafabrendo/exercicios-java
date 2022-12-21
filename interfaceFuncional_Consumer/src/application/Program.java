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
		//forEach � um default method que vai percorrer a cole��o e vai executar um 
		//consumer nesta cole��o para cada elemento
		//o forEach vai percorrer a lista aplicando o novo pre�o, a cada elemento da lista
		
		//Reference method com metodo est�tico.
		//list.forEach(Product::staticPriceUpdate);
		
		//Reference method com m�todo n�o est�tico.
		//list.forEach(Product::nonstaticPriceUpdate);
		
		//Express�o lambda declarada
		
		//vou usar uma variavel para a taxa
		double factor = 1.1; //assim fica mais flex�vel
		
		//como tem apenas uma linha a minha fun��o an�nima, as chaves s�o opcionais.
		//Consumer<Product> cons = p -> {
		//	p.setPrice(p.getPrice() * factor);
		//};
		
		//list.forEach(cons);
		
		//Express�o lambda inline:
		list.forEach(p -> p.setPrice(p.getPrice() * factor));
		
		
		//vou imprimir a lista
		list.forEach(System.out::println); //Estou usando um reference method para o metodo println
		//assim eu vou imprimir a lista
		
		
	}
}
