package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	
	List<OrderItem> order = new ArrayList<>();
	private Client client;
	
	
	public Order() {
	}

	
	public Order(Date moment, OrderStatus status, Client client) {
		super();
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public static SimpleDateFormat getSdf() {
		return sdf;
	}

	public static void setSdf(SimpleDateFormat sdf) {
		Order.sdf = sdf;
	}
	
	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public List<OrderItem> getOrder() {
		return order;
	}

	
	public void addItem(OrderItem item) {
		order.add(item);
		
	}
	public void removeItem(OrderItem item) {
		order.remove(item);
	}
	

	public Double total() {
		double total = 0;
		for(OrderItem sub: order) {
			 total += sub.subTotal();
		}
		return total;
	}
	
	
	
	
	
	

}
