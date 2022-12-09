package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		//Product product = new Product();
		//INSTANCIEI o produto e mandei imprimir os valores padrão para cada atributo.
		//Vai dar um erro porque o construtor padrão não está definido, pois eu defini outro construtor.
		//Leia os dados, normalmente e só dps instancie
		//faça variaveis auxiliares
		
		/*System.out.println(product.name);
		System.out.println(product.price);
		System.out.println(product.quantity);*/
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		//product.name = sc.nextLine();
		String name = sc.nextLine();
		//name é uma variavel auxiliar
		System.out.print("Price: ");
		//product.price = sc.nextDouble();
		double price = sc.nextDouble();
		/*System.out.print("Quantity in stock: ");
		//product.quantity = sc.nextInt();
		//int quantity = sc.nextInt();
		*/
		Product product = new Product(name, price);
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		
		sc.close();
	
	}

}
