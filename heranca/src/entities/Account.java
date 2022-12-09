package entities;

public class Account {
	//É considerada superclass(classe base). E quem deriva dela é subclass
	
	private Integer number;
	private String holder;
	protected Double balance; //Para que meu atributo seja acessado pela BusinessAccount porém ele não vai
	//ser publico
	
	public Account() {
	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	//Tirei a operação setBalance() porque eu não posso alterar o saldo da conta livremente
	//Para alterar o saldo eu preciso de metodos:
	
	public void withdrawal(double amount) {
		balance -= amount + 5.0; // balance = balance - amount + 5.0;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	
	

}
