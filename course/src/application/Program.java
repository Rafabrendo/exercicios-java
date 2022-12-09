package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		//Eu faço a leitura do nome e guardo dentro da variavel product no campo
		//name
		
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		System.out.println();
		System.out.print("Product data: " + product);
		/*Eu não preciso fazer product.toString() nesse caso para fazer a chamada da
		 da função(metódo)*/
		
		
		System.out.println();
		System.out.print("Enter the number of product to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		/*Chamei o metodo addProducts e passei como paramentro o quantity que o usuario
		 * adicionou. Isso vai fazer a atualização da quantidade dentro do objeto product.
		 */
		
		System.out.println();
		System.out.print("Updated data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of product to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity); /*Mesma coisa que fiz em cima. Como já tinha declarado, só reaproveitei
		a vairavel quantity*/
		
		System.out.println();
		System.out.print("Updated data: " + product);
		
		
		sc.close();
	}

}
