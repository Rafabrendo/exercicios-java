package entities;

import entities.enums.Color;

public class Circle extends Shape {
	//Como Circle não é uma classe abstrata, por causa da herança, ela é obrigada a sobrescrever o metodo
	//abstrato da superclasse
	
	private Double radius;
	
	public Circle() {
		super();
	}
	
	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		//pow(radius, 2) * 3.14
		return Math.PI * Math.pow(radius, 2);
	}
	

}
