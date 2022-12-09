package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;

	public Product() {
		
	}
	
	public Product(String name, double price, int quantity) {
		/*super(); -> Nesse caso é uma classe comum. Chamada do super, que tem haver com herança. É basicamente assim:
		se a minha classe Product for subclasse de alguma outra que executa algo impor_
		tante no costrutor, ele vai chamar o construtor da super classe.*/
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		/*quantity = 0; -> Lembre-se: Não é preciso porque não tem o parametro
		 * quantity. O this tbm é opcional porque não tem ambiguidade.*/
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	public String toString() {
		return name 
			+ ", $"
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f", totalValueInStock());
	}
}


