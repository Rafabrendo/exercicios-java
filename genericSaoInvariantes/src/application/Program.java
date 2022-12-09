package application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		//List<Object> myObjs = new ArrayList<Object>();
		//O supertipo de qualquer tipo de lista é List<?>. Este é um tipo curinga.
		//List<?> myObjs = new ArrayList<Object>();
		//List<Integer> myNumbers = new ArrayList<Integer>();
		//myObjs = myNumbers;
		//erro de compilação porque não da pra converter um tipo list para um tipo object
		//um upcasting
		
		//Object obj;
		//Integer x = 10;
		//obj = x;
		
		
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		//ja passei um lista com três argumentos
		printList(myInts);
		
		//esse metodo vai funcionar com qualquer tipo de lista
		
		List<String> myStrs = Arrays.asList("RAfa", "Juca", "jaiL");
		printList(myStrs);
	}
	
	public static void printList(List<?> list) {
		for(Object obj:list) {
			System.out.println(obj);
		}
	}
	

}
