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
	public Product() {
		/*Uma sobrecarga a mais! Coloquei um construtor padrão manualmente.*/
	}
	
	public Product(String name, double price){
		/*Nesse caso, eu fiz a sobrecarga. Ou seja, disponibilizei mais de uma versão
		 * da minha operação*/
		this.name = name;
		this.price = price;
		/*this.quantity = 0; //é opcional, já que a linguagem java inicia valores 
		 * numericos com o zero (0).
		 * a palavra this tbm é opcional.Porque como não se tem um parametro quanity, não
		 * se tem a ambiguidade de se descobrir qual é o parametro e qual é o atributo. 
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
