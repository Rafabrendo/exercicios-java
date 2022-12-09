package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// Soma vetor
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		Product[] product = new Product[n];
		
		for (int i=0; i<product.length; i++) {
			System.out.println("Digite um numero:");
			int num = sc.nextInt();
			product[i] = new Product(num);
		}
		
		int soma = 0;
		
		Product s = new Product(); //Eu tive que instanciar de novo para funcionar do meu jeito.
		for (int i=0; i<product.length; i++) {
			soma = product[i].getNumber();
			s.sum(soma);
		}
		
		System.out.println("Soma: " + s.getSoma());
		
		
		sc.close();
	}

}
