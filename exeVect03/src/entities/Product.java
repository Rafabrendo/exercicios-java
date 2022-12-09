package entities;

public class Product {
	private String name;
	private int age;
	private double hight;
	private double porcent;
	
	public Product() {
		
	}
	
	public Product(String name, int age, double hight) {
		this.name = name;
		this.age = age;
		this.hight = hight;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setHight(double hight) {
		this.hight = hight;
	}
	public double getHight() {
		return hight;
	}

	public double getPorcent() {
		return porcent;
	}

	public void setPorcent(double porcent) {
		this.porcent = porcent;
	}
	
	public void somaPorcent(int age) {
		porcent += age;
	}
}
