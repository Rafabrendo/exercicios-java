package entities;

public class Individual extends Person {

	private Double healthExpenditures;
	
	public Individual() {
		super();
	}

	public Individual(String name, Double annualIncome, Double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	/* Minha solução:
	@Override
	public Double paymentRate() {
		if (healthExpenditures != null || healthExpenditures > 0) {
			if (annualIncome <= 20000.00) {
				return (annualIncome * 0.15) - (healthExpenditures * 0.5);
			}
			else {
				return (annualIncome * 0.25) - (healthExpenditures * 0.5);
			}
		}
		else {
			return annualIncome;
		}
	}*/
	
	@Override
	public Double paymentRate() {
		//Posso fazer com o operador ternario. Ex.:
		//double basicTax = (getAnnualIncome() < 20000.00) ? getAnnualIncome()*0.15 : getAnnualIncome() * 0.25;
		double basicTax;
		if (getAnnualIncome() < 20000.00) {
			basicTax = getAnnualIncome() * 0.15;
		}
		else {
			basicTax = getAnnualIncome() * 0.25;
		}
		basicTax = basicTax - (getHealthExpenditures() * 0.5); //basicTax -= getHealthExpenditures() * 0.5
		if (basicTax< 0.0) {
			basicTax = 0.0;
		}
		return basicTax;
		
	}
	

}
