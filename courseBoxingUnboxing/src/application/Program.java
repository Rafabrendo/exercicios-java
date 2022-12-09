package application;

public class Program {

	public static void main(String[] args) {
		
		int x = 20;
		
		//Object obj = x;
		
		Integer obj = x; //Integer é uma wrapper class do int e por isso não preciso fazer
		//o castinh no obj
		/*Wrapper class são classes que tem o objetivo de tratar os tipos primitivos como 
		 *classes só que de uma forma transparente ao compilador, sem precisar ficar usando
		 *com conversões(casting) 
		 * */
		
		System.out.println(obj);
		
		int y = /*(int)*/ obj;
		
		System.out.println(y);
		
		

	}

}
