package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7); //J� passei os valores
		//Isso � pra criar uma lista j� jogando os valores para a lista
		
		//Stream<Integer> st1 = list.stream();
		//Isso � criar uma stream a partir da lista
		
		//System.out.println(Arrays.toString(st1.toArray()));
		//Vai converter a minha stream para um vetor e imprimi-lo na tela
		//[3, 4, 5, 10, 7]
		
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		
		System.out.println(Arrays.toString(st1.toArray()));
		//[30, 40, 50, 100, 70]
		
		
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		//O metodo Stream.of cria stream tbm, mas esse metodo permite colocar os elementos diretamente
		//nos parentes
		System.out.println(Arrays.toString(st2.toArray()));
		//[Maria, Alex, Bob]
		
		//Fun��o de itera��o:
		
		//Vai ser somado ao primeiro elemento(0) + 2, e cada elemento resultante vai ser adicionado
		//a stream 
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		//Stream com fun��o de itera��o, passa o indice do primeiro elemento e dps uma fun��o 
		//de itera��o. NEsse caso, a fun��o que eu passei � infinita. Vou escolher como mostrar
		//utilizando o limit e passando quantos elementos eu quero q mostre.
		
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		//O limit � intermediario e vai devolver uma nova stream, dai, para converter
		//para vetor eu chamo o toArray. Passei um limite de 10 elementos
		
		//Stream sequencia de fibonnaci
		//0L -> zero long; 1L -> um long
		//Fiz uma gambiarra e passei um Array com os elementos 0L e 1L
		Stream<Long> st4 = Stream.iterate(new Long[]{0L, 1L}, p -> new Long[]{p[1] , p[0] + p[1]}).map(p -> p[0]);
		//Isso vai dar uma stream de pares e por isso eu coloquei o map para virar uma stream de elementos.
		//vou pegar o p na posi��o zero[0]
		
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
		//[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
		
		

		
		
		
	}

}
