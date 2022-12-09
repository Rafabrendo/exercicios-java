package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner (System.in);
		
		Rectangle A, B;
		
		System.out.println("Enter \"A\" rectangle width and height:");
		//  \"\" para inserir aspas duplas dentro do print
		A = new Rectangle();
		A.width = ler.nextDouble();
		A.height = ler.nextDouble();
		
		System.out.println("Enter \"B\" rectangle width and height:");
		B = new Rectangle();
		B.width = ler.nextDouble();
		B.height = ler.nextDouble();
		
		
		System.out.print("Rectangle A : ");
		System.out.println(A);
		
		System.out.print("Rectangle B : ");
		System.out.println(B);
		
		
		
		ler.close();
	}

}
