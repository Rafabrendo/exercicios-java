package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
			//generics
		//List<Integer> list = new ArrayList<>(); //List não aceita tipos primitivos
		//por isso eu usei uma wrapper class
		//classe ArrayList é mto otimizada, ela "meio" que pega as melhores caracteristicas
		//tanto do vetor, como da lista
	
		List<String> list = new ArrayList<>();
		//Posso fazer tbm ... ArrayList<String>();
		
		list.add("Maria"); //0
		list.add("Alex"); //1
		list.add("Bob");  //2
		list.add("Anna"); //3
		list.add(2, "Rafa"); //Na posição 2 eu coloquei o Rafa
		//posição, elemento
		
		System.out.println(list.size());
		//tamanho da lista
		
		list.remove("Anna"); //removi um dado a partir da comparação
		//do valor desse dado
		
		//Posso fazer assim tbm
		//list.remove(1);
		//Nesse caso eu removi o Alex
		
		
		//for each
		for(String x: list) {
			System.out.println(x);
		}
		
		//Se eu quiser remover aqueles elementos que atendam a um predicado
		
		System.out.println("--------------------");
		//A função que foi passada no parenteses é a função lambda
		list.removeIf(x -> x.charAt(0) == 'M');
		//Estou falando pega o valor x, que é do tipo string, e me retorna se esse x.charAt(0)é igual a M
		//vai dar verdadeiro ou falso
		//Vai remover todos cujo o começo seja com 'M'
		
		for (String x: list) {
			System.out.println(x);
		}
		
		System.out.println("------------------");
		//Para encontrar a posição de um elemento:
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		//2
		System.out.println("Index of Marco " + list.indexOf("Marco"));
		//Quando o index of não encontra o elemento, ele retorna o -1
		//Index of Marco -1
		System.out.println("-------------------------");
		
		/*Vou filtrar minha lista, de modo que fique na lista só quem começa com A.
		 *Declarei uma nova lista, no caso result e atribui-la a lista original(list)
		 *converti essa list para stream() e chamei a função filter que passei a expressão lambda com 
		 *o predicado. Após isso eu converti de novo para lista com a função collect(Collectors.toList())
		 * */
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x: result) {
			System.out.println(x);
		}
		//Só imprimiu o Alex, porque eu já tinha excluido a Anna
		
		//Encontrar um elemento da lista que comece com um predicado
		System.out.println("-------------------------");
		String name = list.stream().filter(x -> x.charAt(0)== 'A').findFirst().orElse(null);
		//O findFirst vai pegar o primeiro elemento do caso, caso não exista, vai me retornar nulo
		
		System.out.println(name);//Alex
		System.out.println("-----------------------");
		String name1 = list.stream().filter(x -> x.charAt(0)== 'J').findFirst().orElse(null);
		System.out.println(name1); //null
		
		
		
		
	}

}
