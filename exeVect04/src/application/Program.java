package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas vão se registrar? ");
		int registroPessoas = sc.nextInt();
		
		Product[] product = new Product[10];
		
		for (int i=0; i<registroPessoas; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("room");
			int room = sc.nextInt();
			
			product[room] = new Product(name, email, room);
			
			/*Posso fazer assim tbm: 
			 * 
			 * Product product = new Product(name, email) //vou instanciar e passar os dois como arg
			 * 
			 * product[room] = product
			 * */
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i=0; i<product.length; i++) {
			if (product[i] != null) {
				System.out.printf(i + ": %s", product[i]);
				System.out.println();
			}
		}
		sc.close();
	}
}
