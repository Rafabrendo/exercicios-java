package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		/*
		Account acc1 = new Account(1001, "Alex", 1000.0);
		//Não posso instanciar a classe Account, porque ela é uma classe abstrata. Isso garante que os 
		//programadores que mexerem nesse programa, não errem instanciando essa classe
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());*/
		
		
		List<Account> list = new ArrayList<>(); //O tipo da minha lista vai ser do tipo generico. Dentro dessa lista 
		//usando o uppercasting, eu vou poder inserir tanto o objeto do tipo conta poupança(SavingsAccount), como objetos do tipo
		//empresarial(BusinessAccount)
		
		list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.00, 400.00));
		list.add(new SavingsAccount(1004, "Bob", 300.00, 0.01));
		list.add(new BusinessAccount(1005, "Ana", 500.0, 500.0));
		
		//Vou fazer a soma de todos os saldos, independente do tipo de que tiver na minha lista:
		double sum = 0.0;
		for(Account acc: list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n", sum);
		
		for (Account acc: list) {
			acc.deposit(10.0);
		}
		
		for(Account acc: list) {
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
		
		
		
	}
}
