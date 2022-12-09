package services;

import java.util.List;

public class CalculationService {
	
	//A opera��o � static, ent�o eu n�o preciso instanciar o CalculationService.
	//recebe uma lista de inteiros
	//esse metodo acha o maior numa lista de inteiro e isso � um problema, porque eu quero
	//achar o maior numa lista de produtos
	//public static Integer max(List<Integer> list) {
	
	
	//adaptei o metodo max para que ele funcione para qualquer tipo, e n�o somente o inteiro
	public static <T extends Comparable<T>> T max(List<T> list) {	
		//<T> estou falando que esse metodo vai trabalhar com um tipo T
		//<T extends Comparable<T>>  -> especifiquei que o tipo T � um tipo Comparable
		//Esse metodo vai trabalhar com qualquer tipo T, desde que o T seja qualquer subtipo
		//do Comparable<T>
		if(list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
			//se a lista for vazia, � lan�ado uma excess�o
		}
		//a variavel max vai receber o primeiro elemento da lista
		T max = list.get(0);
		//dps eu fa�o um for nessa lista
		for(T item : list) {
			if(item.compareTo(max) > 0) {
				//vou comparar se cada item dessa lista � maior que o max
				//para isso eu usei o compareTo
				//chamo o primeiro objeto
				max = item;
				//a minha variavel(max) vai conter o maior elemento da lista
			}
		}
		return max;
	}
}
