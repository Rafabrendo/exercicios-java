package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" "); //Vai ler varios dados na mesma linha, separado por espaço em branco
			//e cada um desses dados vai ser elemento do vetor
			int position = sc.nextInt();
			
			System.out.println(vect[position]);
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid position!");
			
		}
		catch(InputMismatchException e) {
			System.out.println("Input Error");
			
		}
		finally {
			System.out.println("End of program!");
		}
		
		
		
		
		
		
		
		
		sc.close();
	}

}
