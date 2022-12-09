package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public Product(String name, double price, int quantity){
		/*Construtor. Faz com que atributos recebam valores iniciais.
		 * Para isso ser possível, o construtor tem que receber esses dados como parametro.
		 * Posso usar outros nomes no parametro, como: name2, price2 e quantity2.
		 * O this vai referenciar o atributo do objeto*/
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
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
