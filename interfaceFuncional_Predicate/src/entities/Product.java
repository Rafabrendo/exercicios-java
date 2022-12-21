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
	
	//Reference method com metodo estático
	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 100.0;
	}
	
	//agora sem o estático //Vai trabalhar com o proprio produto da onde eu estou, e não com o produto 
	//que vai vir como argumento.
	public boolean nonstaticProductPredicate() {
		return price >= 100.0;
		//estou acessando o atributo do objeto de onde estou.
	}
	

	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}
	
	
	
	

}