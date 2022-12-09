package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	/*Esse é outro jeito de declarar vetores*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int vetor[]; //declaração do vetor
		
		System.out.println("Tamanho do vetor: ");
		int n = sc.nextInt();
		
		vetor = new int[n]; //alocação de espaço

		for (int i=0; i<n; i++) {
			System.out.print("Digite um numero inteiro: ");
			vetor[i] = sc.nextInt();
		}
		
		for (int i=0; i<n; i++) {
			System.out.println(vetor[i]);
		}
		
		
		
		
		sc.close();
	}

}
