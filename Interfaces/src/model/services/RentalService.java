package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
	
	private Double pricePerHour;
	private Double pricePerDay;
	
	//private BrazilTaxService taxService; //Isso faz com que o RentalService vire dependente do BrazilTaxService
	//da�, se eu tiver que mudar a logica de algum dos dois, eu terei que mudar ambos. Isso n�o � "bem visto"
	//� um proble, ter dois ou mais pontos de altera��o
	//associa��o
	
	private TaxService taxService; //Agora a classe RentalService vai ter uma dependencia com a interface
	
	//Nesse caso eu n�o vou colocar o construtor vazio(padr�o) porque eu quero obrigar que esses dados
	//sejam passados.
	
	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
		/*A classe n�o tem a obriga��o de instanciar o taxService. Ela vai apenas receber "alguma" classe que implementa
		 * esse taxService.
		 * A taxService aqui � um tipo generico*/
		//this.taxService = new BrazilTaxService -> poderia ter feito assim ao inv�s de ter instanciado. Por�m, tenho um 
		//� um forte acoplamento
	}

	
	
	public void processInvoice(CarRental carRental) {
		
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		//Duration � da classe time. Vai calcular a dura��o entre duas datas, nesse caso, em minutos.
		double hours = minutes / 60.0;
		
		double basicPayment;
		if (hours <= 12.0) {
			basicPayment = pricePerHour * Math.ceil(hours);
			//Math.ceil -> fun��o do java que arredonda o numero para cima
		}
		else {
			basicPayment = pricePerDay * Math.ceil(hours/24.0);
			
		}
		
		double tax = taxService.tax(basicPayment);
		
		
		//Passei o metodo setInvoice -> Pra mudar o valor de null para outro.
		//carRental.setInvoice(new Invoice(50.0, 10.0));
		//Estou instanciando o setInvoice, com dados fixos, e estou associando ela com o carRental
		
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
	
	
}
