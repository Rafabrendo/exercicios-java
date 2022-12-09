package entities;

public class Company extends Person {

	private int numberOfEmployees;
	
	public Company() {
		super();
	}

	public Company(String name, Double annualIncome, int numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	/* Minha solução
	@Override
	public Double paymentRate() {
		if (numberOfEmployees != 0) {
			if (numberOfEmployees <= 10) {
				return annualIncome * 0.16;
				
			}
			else {
				return annualIncome * 0.14;
			}
		}
		else {
			return annualIncome * 0.16;
		}
	}*/
	
	//Use a condição ternaria se tiver apenas UMA condição.
	@Override
	public Double paymentRate() {
		double basicTax = (numberOfEmployees > 10)? getAnnualIncome() * 0.14 : getAnnualIncome() * 0.16;
		return basicTax;
		/*if(numberOfEmployees > 10) {
			return getAnnualIncome() * 0.14;
		}
		else {
			return getAnnualIncome() * 0.16;
		}*/
	}
}
