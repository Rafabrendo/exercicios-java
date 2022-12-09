package application;

import java.util.HashSet;
import java.util.Set;

import entities.Product;

public class TesteDeIgualdade {

	public static void main(String[] args) {
		
		Set<Product> set = new HashSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		Product prod = new Product("Notebook", 1200.0);
		
		//Antes de implementar os metodos hashCode e Equals
		//System.out.println(set.contains(prod));
		//Deu false porque a classe Product não contem a implementação do hashCode e Equals
		//como não contem, o set vai usar a referencia de ponteiros para comparar se um produto.
		//é igual ao outro. Como o Notebook de cima e o de baixo foram instancias diferentes
		//a resposta vai dar falso
		
		//Depois de implementar os metodos
		System.out.println(set.contains(prod));
		//true -> agora deu verdadeiro. Está dizendo que o prod, que eu instanciei está contido no
		//conjunto. Isso porque a comparação foi feita pelo conteudo e não por referencia de ponteiro
		//do objeto.

	}

}
