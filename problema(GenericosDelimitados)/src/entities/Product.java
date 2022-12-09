package entities;

public class Product implements Comparable<Product> {
	//isso é para que funcione a minha chamada de max para a minha lista de produtos
	
	
	private String name;
	private Double price;
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void serName(String name) {
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
		return name + ", " + String.format("%.2f", price);
	}

	@Override
	public int compareTo(Product other) {
		return price.compareTo(other.getPrice());
		//estou comparando um produto de onde eu estou, com outro produto do argumento
	}
	
}
