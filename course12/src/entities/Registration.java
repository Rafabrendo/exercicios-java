package entities;

import java.util.Scanner;

public class Registration {
	private String name;
	private double initialDeposit;
	private int age;
	private int account;
	
	
	public Registration() {
		//sobrecarga. Construtor padrão.
	}
	
	public Registration(String name, double initialDeposit, int age, int account){
		this.name = name;
		this.initialDeposit = initialDeposit;
		this.age = age;
		this.account = account;
	}
	public Registration(String name, double initialDeposit, int account){
		this.name = name;
		this.initialDeposit = initialDeposit;
		this.account = account;
	}
	public Registration(String name, int account){
		this.name = name;
		this.initialDeposit = 0.0;
		this.account = account;
	}

	public double getInitialDeposit() {
		return initialDeposit;
	}

	public void setInitialDeposit(double initialDeposit) {
		this.initialDeposit = initialDeposit;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getAccount() {
		return account;
	}
	Scanner sc = new Scanner(System.in);
	public void answer(char answer) {
		if (answer == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			Registration regis = new Registration(name, initialDeposit, account);
			System.out.println(regis);
		}
		else if (answer == 'n') {
			Registration regis = new Registration(name, account);
			System.out.println(regis);
		}
		else {
			System.out.println("Erro! Tente novamente.");
		}
	}
	public void depositPositive(double PositiveDeposit) {
		this.initialDeposit += PositiveDeposit;
	}
	public void depositNegative(double NegativeDeposit) {
		this.initialDeposit -= NegativeDeposit;
	}
	
	public String toString() {
		return "Account " + account + ", Holder: " + name + ", Balance: $ " + initialDeposit;
	}
	
	
}
