package application;

public class Program {

	public static void main(String[] args) {
		
		int x = 20;
		
		//Object obj = x;
		
		Integer obj = x; //Integer � uma wrapper class do int e por isso n�o preciso fazer
		//o castinh no obj
		/*Wrapper class s�o classes que tem o objetivo de tratar os tipos primitivos como 
		 *classes s� que de uma forma transparente ao compilador, sem precisar ficar usando
		 *com convers�es(casting) 
		 * */
		
		System.out.println(obj);
		
		int y = /*(int)*/ obj;
		
		System.out.println(y);
		
		

	}

}
