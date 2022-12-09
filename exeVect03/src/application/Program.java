package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import entities.menor16;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do vetor: ");
		int n = sc.nextInt();
		
		Product[] product = new Product[n];
		
		for(int i=0; i<product.length; i++) {
			System.out.println("Digite o nome:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Digite a idade: ");
			int age = sc.nextInt();
			System.out.println("Digite a altura: ");
			double hight = sc.nextDouble();
			product[i] = new Product(name, age, hight);
		}
		
		menor16 menor = new menor16();
		
		for(int i=0; i<product.length; i++) {
			if(product[i].getAge() < 16) {
				String nome = product[i].getName();
				int idade = product[i].getAge();
				double altura = product[i].getHight();
				
				menor = new menor16(nome, idade, altura);

			}
		}
		
		System.out.println(menor.nome);
		
		
		
		
		sc.close();
	}

}
