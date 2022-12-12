package entities;

//public class Product implements Comparable<Product> {
/*//vai implementar a interface Comparable<Product>
 * Desta forma nossa classe não fica fechada para alteração: se o criterio de comparação mudar, vou ter que 
 * mudar a classe Product*/

public class Product{
	
	private String name;
	private Double price;
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

	/*
	@Override
	public int compareTo(Product other) {
		return name.toUpperCase().compareTo(other.getName().toUpperCase());
		//aqui eu defini a logica de comparação por meio do nome dos produtos.
	}
	*/
	
	
	
}
