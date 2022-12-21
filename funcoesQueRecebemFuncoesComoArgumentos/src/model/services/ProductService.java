package model.services;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductService {
	
	public double filteredSum(List<Product> list, Predicate<Product> criteria) {
		double sum = 0.0;
		for(Product p : list) {
			//minha condi��o vai pegar os Produtos que come�am com a letra T
			//if(p.getName().charAt(0) == 'T') { //Isso � um predicado do tipo Product que d� verdadeiro ou falso.
				//Isso � um ponto ruim de manuten��o. Da� eu preciso passar um paramentro para a 
				//"filtragem" e aplicar no if
				//sum += p.getPrice();
			if(criteria.test(p)) {//test � um metodo do predicado
				//Retorna: verdadeiro se o argumento de entrada corresponder ao predicado, caso contr�rio, falso
				//t� fazendo um teste generico de qualquer predicado que foi recebido como parametro
				//O argumento de entrada vai ser o p da list
				sum += p.getPrice();
			}
		}
		return sum;
	}
	
}
