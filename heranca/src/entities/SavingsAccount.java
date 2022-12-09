package entities;
	//final -> para que a SavingsAccount não seja herdada por outra classe
public final class SavingsAccount extends Account {
	//É uma subclass de Account
	
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		balance += balance * interestRate; //Mesma coisa -> balance = balance + balance * interestRate
	}
	
		//final -> evita que o metodo seja sobreposto
	@Override   //Sobreposição. Fiz uma alteração no metodo por causa da minha classe
	public final void withdrawal(double amount) {
		balance -= amount;
	}
	
}
