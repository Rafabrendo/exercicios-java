package application;

import entities.Account;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		//Heran�a:
		//BusinessAccount account = new BusinessAccount();
		//account.getHolder(); //BusinesAccount, com a heran�a, vai ter todos os atributos e met�dos da classe account
		

		//Account acc = new Account(1001, "Alex", 0.0);
		//BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		
		// UPCASTING
		//Pegar uma variavel/objeto do tipo subclass e atribui-la a uma variavel/objeto do tipo superclass
		//Lembre-se, a heran�a � uma rela��o � um.
		//Nesse caso BusinessAccount tbm � uma account
		
		//Account acc1 = bacc;
		//acc1.getBalance(); //Teria o saldo da conta, normalmente!
		//Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.00);
		//Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		
		//Downcasting
		
		//n�o se pode fazer a opera��o loan com acc2/acc3 porque s�o do tipo Account
		//Caso eu quero fazer uma opera��o de emprestimo(loan) a partir de uma variavel que � originalmente 
		//Account, eu tenho que fazer o Downcasting dela para o tipo BusinessAccount
		
		//BusinessAccount acc4 = (BusinessAccount) acc2; //acc2 � do tipo Account e por isso da problema na hora
		//de converter. Da� coloca-se (BusinessAccount) na frente da acc2. A convers�o � manual e n�o natural.
		//Downcasting pode dar problema 
		//acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount) acc3; //acc3 � uma Account, mas foi instanciada como SavingsAccount
		//e n�o como BusinessAccount. A convers�o � permitida, mas ela vai dar problema na hora de executar a 
		//aplica��o -> ClassCastException -> savingsAccount n�o pode ser convertido para BusinessAccount
		//A convers�o funciona entre mesmas instancias
		
		//Para evitar esse tipo de erro: posso usar uma condi��o para verificar se o objeto � realmente de BusinessAccount
		//se ele for, faz a convers�o do Downcasting
		
		//acc3 � instancia de BusinessAccount -> Opera��o Booleana
		/*if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		//ou, utlizando a condi��o ternaria:
		//BusinessAccount acc5 = (acc3 instanceof BusinessAccount)? (BusinessAccount)acc3: null;
		
		
		//acc3 � instancia de SavingsAccount
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance(); //Chamando a opera��o de updateBalance
			System.out.println("Update!");
		}
		
		*/
		
		/*
		//Sobreposi��o. ex.:
		 
		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdrawal(200.0); //Saque
		System.out.println(acc1.getBalance()); //Tinha 1000.0, sacou 200 menos a taxa de 5, fica 795.0
		
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdrawal(200.0);
		System.out.println(acc2.getBalance()); //800.0 -> n�o descontou a taxa no valor de 5
		
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withdrawal(200.0);
		System.out.println(acc3.getBalance()); //793.0
		*/
		
		//Polimorfismo:
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01); //Feito em tempo de execu��o(upcasting)
		
		x.withdrawal(50.0);
		y.withdrawal(50.0);
		
		System.out.println(x.getBalance()); //945.0
		System.out.println(y.getBalance()); //950.0
		
		//Eu chamei a mesma opera��o, em variaveis do mesmo tipo(Account), mas elas tiveram comportamentos diferentes
		//conforme os objetos que elas apontam
	}

}
