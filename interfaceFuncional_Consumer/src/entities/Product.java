package entities;

public class Product {
	
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
	
	//Reference method com metodo estático.
	public static void staticPriceUpdate(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}
	
	//Reference method com método não estático.
	public void nonstaticPriceUpdate() {
		setPrice(getPrice() * 1.1);
		//ou : (vai funcionar porque estou fazendo isso na propria classe
		//price = price * 1.1;
	}
	
	
	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}
	
}