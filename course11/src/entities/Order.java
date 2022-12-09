package entities;

import java.util.Date;

public class Order {
	private Date date;
	private Product product; //Passei a classe Porduct como tipo primitivo e instanciei ela
	
	public Order(Date date, Product product) {
		super();
		this.date = date;
		this.product = product;
		this.product.name = "TV";/*Não deu erro porque o atributo name do product
		não tem modificador de acesso. Além disso, a classe order tá no mesmo pacote 
		que a product, essa classe pode acessar o atributo name do product*/
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
}
