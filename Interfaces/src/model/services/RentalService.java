package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
	
	private Double pricePerHour;
	private Double pricePerDay;
	
	//private BrazilTaxService taxService; //Isso faz com que o RentalService vire dependente do BrazilTaxService
	//daí, se eu tiver que mudar a logica de algum dos dois, eu terei que mudar ambos. Isso não é "bem visto"
	//É um proble, ter dois ou mais pontos de alteração
	//associação
	
	private TaxService taxService; //Agora a classe RentalService vai ter uma dependencia com a interface
	
	//Nesse caso eu não vou colocar o construtor vazio(padrão) porque eu quero obrigar que esses dados
	//sejam passados.
	
	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
		/*A classe não tem a obrigação de instanciar o taxService. Ela vai apenas receber "alguma" classe que implementa
		 * esse taxService.
		 * A taxService aqui é um tipo generico*/
		//this.taxService = new BrazilTaxService -> poderia ter feito assim ao invés de ter instanciado. Porém, tenho um 
		//é um forte acoplamento
	}

	
	
	public void processInvoice(CarRental carRental) {
		
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		//Duration é da classe time. Vai calcular a duração entre duas datas, nesse caso, em minutos.
		double hours = minutes / 60.0;
		
		double basicPayment;
		if (hours <= 12.0) {
			basicPayment = pricePerHour * Math.ceil(hours);
			//Math.ceil -> função do java que arredonda o numero para cima
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
