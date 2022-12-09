package services;

import java.security.InvalidParameterException;

public interface InterestService {
	
	double getInterestRate();
	//Não vou colocar esse metodo como padrão porque o valor dele depende da variavel que está armazenada no
	//serviço.
	//A interface não armazena estado, nem construtor
	
	
	
	//tem que colocar default, ao invés de public
	default double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
		//getInterestRate() -> passo esse metodo para pegar a taxa de juros da classe especifica
		//que pode ser BrazilInterestService ou UsaIterestService, depende de qual eu instanciar.
	}

}
