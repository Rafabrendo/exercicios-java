package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class OperacoesComSet {

	public static void main(String[] args) {
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		//
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		
		//Union
		Set<Integer> c = new TreeSet<>(a); //esse conjunto vai ser um copia do conjunto a
		//to passando uma outra coleção como argumento.
		c.addAll(b); //estou fazendo a união do conjunto c com o b
		System.out.println(c);
		
		//Intersection
		Set<Integer> d = new TreeSet<>(a); //instanciei o conjunto d como uma copia do conjunto a
		d.retainAll(b); //vou fazer a intersection de d em b (somente os elementos que tem em comum nos conjuntos)
		System.out.println(d);
		
		//difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);//vou remover do conjunto 'e' todos que estão no conjunto b
		System.out.println(e);
		
		

	}

}
