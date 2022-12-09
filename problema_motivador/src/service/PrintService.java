package service;

import java.util.ArrayList;
import java.util.List;

//public class PrintService {
public class PrintService<T> {
	//A class é do tipo T(obs.: Posso usar o nome que eu quiser. ex.: type, letras, numeros
	//O importante é que eu colooque a mesma letra no 'resto'
	
	
	//private List<Integer> list = new ArrayList<>();
	//private List<Object> list = new ArrayList<>();
	private List<T> list = new ArrayList<>();
	
	public void addValue(T value) {
		list.add(value);
	}
	
	public T first() {
		if(list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);
	}
	
	public void print() {
		System.out.print("[");
		if(!list.isEmpty()) {
			int lastElement = list.size() - 1;
			for(T i: list) {
				System.out.print(i);
				if(i != list.get(lastElement)){
					System.out.print(", ");
				}
		}
	  }
		System.out.print("]");
	}
	
	
	
	/*
	public void addValue(Integer value) {
		list.add(value);
	}*/
	/*
	public void addValue(Object value) {
		list.add(value);
	}
	*/
	/*
	public Integer first() {
		if(list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);
	}*/
	/*
	public Object first() {
		if(list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);
	}*/
	/*
	public void print() {
		System.out.print("[");
		if(!list.isEmpty()) {
			int lastElement = list.size() - 1;
			//System.out.print(list.get(0));
			for(Integer i: list) {
				System.out.print(i);
				if(i != list.get(lastElement)){
					System.out.print(", ");
				}
		}
		//for(Integer i: list) {
		// 	System.out.print(", "+ i);
		//}
		
		//for(int i = 1; i< list.size(); i++) {
		//	System.out.print(", " + list.get(i));
		}
		System.out.print("]");
	}
	*/
	/*
	public void print() {
		System.out.print("[");
		if(!list.isEmpty()) {
			int lastElement = list.size() - 1;
			for(Object i: list) {
				System.out.print(i);
				if(i != list.get(lastElement)){
					System.out.print(", ");
				}
		}
	  }
		System.out.print("]");
	}*/
	
	


}
