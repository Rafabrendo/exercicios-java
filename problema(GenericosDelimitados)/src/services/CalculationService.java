package services;

import java.util.List;

public class CalculationService {
	
	//A operação é static, então eu não preciso instanciar o CalculationService.
	//recebe uma lista de inteiros
	//esse metodo acha o maior numa lista de inteiro e isso é um problema, porque eu quero
	//achar o maior numa lista de produtos
	//public static Integer max(List<Integer> list) {
	
	
	//adaptei o metodo max para que ele funcione para qualquer tipo, e não somente o inteiro
	public static <T extends Comparable<T>> T max(List<T> list) {	
		//<T> estou falando que esse metodo vai trabalhar com um tipo T
		//<T extends Comparable<T>>  -> especifiquei que o tipo T é um tipo Comparable
		//Esse metodo vai trabalhar com qualquer tipo T, desde que o T seja qualquer subtipo
		//do Comparable<T>
		if(list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
			//se a lista for vazia, é lançado uma excessão
		}
		//a variavel max vai receber o primeiro elemento da lista
		T max = list.get(0);
		//dps eu faço um for nessa lista
		for(T item : list) {
			if(item.compareTo(max) > 0) {
				//vou comparar se cada item dessa lista é maior que o max
				//para isso eu usei o compareTo
				//chamo o primeiro objeto
				max = item;
				//a minha variavel(max) vai conter o maior elemento da lista
			}
		}
		return max;
	}
}
