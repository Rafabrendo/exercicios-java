package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 900.00));
		
		//Collections.sort(list);
		//vou ordernar os produtos da minha lista utilizado o Collections.sort(). Esse collections.sort()
		//precisa que o tipo da minha lista seja uma implementação de Comparable
		//agr eu vou utilizar o list.sort()
		
		//Utilizando a classe MyComparator()
		//list.sort(new MyComparator());//Tô chamando o sort e passando/chamando o objeto MyComparator
		
		//Agora vou fazer utilizado uma classe de comparação no programa principal(esse) utilizando uma sintaxe
		//de classe anonima
		
		
		/*
		Comparator<Product> comp = new Comparator<Product>() {
			//Eu fiz uma variavel comp que vai ser um tipo de objeto do tipo Comparator<Product>
			//e pra  definir esse objeto eu criei uma classe anonima, no programa principal. Daí 
			//eu não vou precisar fazer uma classe separada, implementando a interface, para dps 
			//chama-la aqui, no programa principal.
			@Override
			public int compare(Product p1, Product p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
		};
		
		list.sort(comp);
		//vou chamar o metodo sort com a variavel que eu declarei -> comp
		
		*/
		
		//Outra forma de fazer
		//vou utilizar a expressão lambda agr:
		
		
		//O compilador faz uma inferencia de tipos. Ele dispensa a necessidade de se colocar Product p1...
		/*
		Comparator<Product> comp = (p1, p2) -> {
			//do lado esquerdo os parametros(p1, p2) 
			//dps coloca-se a implementação da função
			//expressão lambda. Estou definindo uma função anônima 
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};*/
		
		//Posso fazer assim tbm:
		//Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		
		//Posso compactar mais e colocar direto no argumento, dentro dos parenteses
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for(Product p: list) {
			System.out.println(p);
		}
		
		
	}

}
