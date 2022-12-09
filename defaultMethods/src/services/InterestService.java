package services;

import java.security.InvalidParameterException;

public interface InterestService {
	
	double getInterestRate();
	//N�o vou colocar esse metodo como padr�o porque o valor dele depende da variavel que est� armazenada no
	//servi�o.
	//A interface n�o armazena estado, nem construtor
	
	
	
	//tem que colocar default, ao inv�s de public
	default double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
		//getInterestRate() -> passo esse metodo para pegar a taxa de juros da classe especifica
		//que pode ser BrazilInterestService ou UsaIterestService, depende de qual eu instanciar.
	}

}
