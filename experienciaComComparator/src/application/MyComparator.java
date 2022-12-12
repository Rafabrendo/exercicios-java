package application;

import java.util.Comparator;

import entities.Product;

public class MyComparator implements Comparator<Product>{
	//Essa � uma das formas poss�veis.
	/*Delega��o, al�m de facilitar a manuten��o*/

	@Override
	public int compare(Product p1, Product p2) {
		//vou comparar os produtos por nome, independete de letras maiusculas ou minusculas
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}
	

}
