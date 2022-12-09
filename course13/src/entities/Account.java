package entities;

public class Account {

	private int number;
	private String holder;
	private double balance;
	
	public Account() {
		
	}
	
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);/*Chamei a fun��o no meu construtor.
		Fiz isso porque se a regra de deposit mudar, eu s� mudo no metodo e n�o preciso
		alterar no construtor*/
	}
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	/*S� vou fazer o get no balance, porque o saldo da conta s� vai mudar se eu fizer
	 * um deposito ou um saque.
	 * O titular pode ser modificado, se a pessoa mudar de nome.(get e set)
	 * O numero da conta se mantem, ou seja, s� vou criar a opera��o de get.
	 * Terei apenas um ponto de altera��o, caso a regra mude. Isso tamb�m � um
	 * caso de encapsulamento.
	 * */
	public double getBalance() {
		return balance;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public String getHolder() {
		return holder;
	}
	public int getNumber() {
		return number;
	}
	
	public void deposit (double amount) {
		balance += amount;
	}
	public void whithdraw(double amount) {
		balance -= amount + 5.0;
		//PRESTA ATEN��O NISSO!
	}
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
}
