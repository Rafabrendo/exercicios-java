package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		//Set<String> set = new HashSet<>();
		//é o mais rápido, mas ele não garante a ordem.
		//Set<String> set = new TreeSet<>();
		//vai ordenar os dados TreeSet, em ordem alfabetica
		Set<String> set = new LinkedHashSet<>();
		//vai manter a ordem em que os elementos foram inseridos.
		
		set.add("TV");
		set.add("Tablet");		
		set.add("Notebook");
		
		//Não necessariamente vai manter a ordem.
		//System.out.println(set.contains("Notebook"));//true
		//vou testar a condição se nesse elemento set existe Notebook. Vai me retornar true or False
		
		//set.remove("Tablet");//vai excluir o elemento
		//set.removeIf(x -> x.length() >= 3);
		//vai remover apenas os objetos que satisfizerem apenas o predicado que eu colocar aqui
		//vou remover todo x, tal que, x.length() (tamanho) seja maior ou igual a 3 ]
		
		set.removeIf(x -> x.charAt(0) == 'T');
		//vou remover todos que tenham como letra inicial a letra T
		//aquilo ali é um predicado
		
		

		
		
		
		for(String p : set) {
			System.out.println(p);
		}
		

	}

}
