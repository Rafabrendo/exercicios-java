package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		//new Date()  -> agr
		
		System.out.println(order);
		/*Order [id=1080, moment=Thu Sep 01 14:26:15 BRT 2022, status=PENDING_PAYMENT]*/
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		//Isso instanciou um objeto os1, do tipo OrderStatus, que recebeu o valor OrderStatus.DELIVERED
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		//convers�o de string para enum
		
		System.out.println(os1); //DELIVERED
		System.out.println(os2); //DELIVERED
		System.out.println("Teste");
	}

}
