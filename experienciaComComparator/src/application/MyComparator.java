package application;

import java.util.Comparator;

import entities.Product;

public class MyComparator implements Comparator<Product>{
	//Essa é uma das formas possíveis.
	/*Delegação, além de facilitar a manutenção*/

	@Override
	public int compare(Product p1, Product p2) {
		//vou comparar os produtos por nome, independete de letras maiusculas ou minusculas
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}
	

}
