package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public Product(String name, double price, int quantity){
		/*Construtor. Faz com que atributos recebam valores iniciais.
		 * Para isso ser poss�vel, o construtor tem que receber esses dados como parametro.
		 * Posso usar outros nomes no parametro, como: name2, price2 e quantity2.
		 * O this vai referenciar o atributo do objeto*/
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
	}
	public Product() {
		/*Uma sobrecarga a mais! Coloquei um construtor padr�o manualmente.*/
	}
	
	public Product(String name, double price){
		/*Nesse caso, eu fiz a sobrecarga. Ou seja, disponibilizei mais de uma vers�o
		 * da minha opera��o*/
		this.name = name;
		this.price = price;
		/*this.quantity = 0; //� opcional, j� que a linguagem java inicia valores 
		 * numericos com o zero (0).
		 * a palavra this tbm � opcional.Porque como n�o se tem um parametro quanity, n�o
		 * se tem a ambiguidade de se descobrir qual � o parametro e qual � o atributo. 
		 * Ficaria: quantity = 0;
		 * */
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
