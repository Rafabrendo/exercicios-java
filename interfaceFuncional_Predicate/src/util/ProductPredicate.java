package util;

import java.util.function.Predicate;

import entities.Product;

public class ProductPredicate implements Predicate<Product>{

	
	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
		//vai retornar um boolean de produtos maior ou igual a zero.
		//l� no Program eu vou determinar o que eles v�o fazer.
	}

}
