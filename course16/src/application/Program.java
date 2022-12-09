package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		/*O tipo do vetor agora é Product, variavel vect. Instanciei e coloquei [n] como
		 * o tamanho do vetor */
		
		for (int i=0; i<vect.length; i++) { //vect.lenght é a quantidade de elemento do vetor
			sc.nextLine(); /*Preciso fazer isso porque eu usei um nextInt() ali em cima e ele 
			deixa uma quebra de linha que precisa ser consumida.*/
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for (int i=0; i<n; i++) { //tbm posso usar a variavel n.
			sum += vect[i].getPrice();/*Estou acessando o vetor na posição i e pegando apenas 
			o preço, com o getPrice*/
		}
		
		double average = sum / n;
		
		System.out.printf("AVEREGE PRICE = %.2f%n", average);
		
		
		
		sc.close();
	}

}
