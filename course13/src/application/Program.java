package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account; //Declarei a variavel aqui para que seja um escopo GLOBAL
		//e não local.
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine(); //Eu faço isso para que seja consumido a quebra de linha dps do 
		//nextInt() que ficou pendente.
		String holder = sc.nextLine();
		System.out.println("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0); //Dessa forma eu leio o caracter.
		
		//Nesse caso tem uma sobrecarga na prática
		if (response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
			//Não preciso declarar de novo.
		}
		else {
			account = new Account (number, holder);
		}
		
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.whithdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		
		sc.close();
	}

}
