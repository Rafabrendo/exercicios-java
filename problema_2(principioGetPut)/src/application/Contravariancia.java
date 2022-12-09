package application;

import java.util.ArrayList;
import java.util.List;

public class Contravariancia {

	public static void main(String[] args) {
		
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Rafa");
		
		List<? super Number> myNums = myObjs;
		
		myNums.add(10);
		myNums.add(3.14);
		//posso adicionar
		
		//Number x = myNums.get(0); // erro de compilação
		//Não posso acessar os objetos da lista
		

	}

}
