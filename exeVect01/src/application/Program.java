package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Negativos
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do vetor: ");
		int n = sc.nextInt();
		
		Product[] vect = new Product[n];
		
		for (int i= 0; i<vect.length; i++) {
			System.out.println("Digite um inteiro para entrar no vetor: ");
			int numbers = sc.nextInt();
			vect[i] = new Product(numbers);
		}
		System.out.println("Numeros negativos: ");
		for (int i = 0; i<vect.length; i++) {
			if (vect[i].getNumbers()< 0) {
				System.out.println(vect[i].getNumbers());
			}
			
		}
		
		sc.close();
	}

}
