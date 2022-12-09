package application;

import static util.CurrencyConverter.*;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price?");
		double dollar = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		double manyDollar = sc.nextDouble();
		//Poderia ter atribuido o resultado a uma variavel.
		System.out.println("Amount to be paid in reais = " + amount(dollar, manyDollar));
		
		//Eu poderia ter passado como atributo. Não precisa instanciar, apenas chamei pela classe
		
		
		
		
		sc.close();
	}

}
