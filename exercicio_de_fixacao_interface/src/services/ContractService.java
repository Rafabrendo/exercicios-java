package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int months) {
		//contract.getInstallments().add(new Installment(LocalDate.of(2018, 7, 25), 206.04));
		//contract.getInstallments().add(new Installment(LocalDate.of(2018, 8, 25), 208.08));
		
		double basicQuota = contract.getTotalValue() / months;
		
		for(int i=1; i <= months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			//assim que se adiciona meses. Uma variavel do tipo LocalDate, recebendo o contract.getDate()
			// e adicionando meses(i)
			
			double interest = onlinePaymentService.interest(basicQuota, i);
			//com essa chamada eu consigo calcular o juros de cada mês
			
			double fee = onlinePaymentService.paymenteFee(basicQuota + interest);
			//fiz uma soma ao passar o parametro #goxtei. Ao inves de fazer uma variavel que recebe a soma desses valores.
			
			double quota =  basicQuota + interest + fee;
			
			contract.getInstallments().add(new Installment(dueDate, quota));
			//Isso aqui é mto topper! Eu não fiz os metodos de adicionar. Apenas usei o get que já tinha
			//feito e chamei o add(metodo de list) e passei a instanciação
			
		}
		
		
	}
	
	
	
}
