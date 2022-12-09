package entities;

public class BusinessAccount extends Account {
	//Estou definindo que a minha class BusinessAccount vai ter todos os dados e comportamentos da class
	//Account. //É uma subclass de Account 
	
	private Double loanLimit;
	
	public BusinessAccount() {
		super(); //No construtor padrão, eu posso chamar o super assim...
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0; //balance = balance + amount - 10.0;
		}
		
	}
	
	@Override
	public void withdrawal(double amount) {
		super.withdrawal(amount); //Estou reutilizando o código que está na superclasse. Ou seja, vou descontar a taxa de 5, da classe account
		balance -= 2.0; //e vou descontar a taxa de 2.0 que é a lógica dessa classe
	}
	
	
	

}
