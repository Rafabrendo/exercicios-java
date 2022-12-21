package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		//Transformei a lista em stream e chamei o map
		Stream<Integer> st1 = list.stream().map(x -> x * 10); //Opera��o itermediaria -> map
		System.out.println(Arrays.toString(st1.toArray())); //Opera��o terminal ->toArray
		//[30, 40, 50, 100, 70]
		
		//reduce pega o elemento inicial e dps eu passo uma fun��o com dois argumentos
		int sum = list.stream().reduce(0, (x, y) -> x + y); //Essa opera��o vai fazer o somatorio da minha lista
		//0(zero) � o elemento neutro da soma
		//1 � o elemento neutro da multiplica��o
		System.out.println("Sum = " + sum); //Sum = 29
		
		List<Integer> newList = list.stream()
				.filter(x -> x % 2 == 0)
				.map(x -> x * 10)
				.collect(Collectors.toList());
		
		//O list tbm tem a opera��o toArray
		System.out.println(Arrays.toString(newList.toArray()));
		//[40, 100]
		
		
	}

}
