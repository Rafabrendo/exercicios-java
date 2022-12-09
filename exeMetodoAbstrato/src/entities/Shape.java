package entities;

import entities.enums.Color;

public abstract class Shape {
	
	private Color color;

	public Shape() {
	}
	
	public Shape(Color color) {
		this.color = color;
	}


	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	
	//O metodo area n�o tem como implementar na classe Shape porque eu preciso saber a forma da figura que est� sendo
	//calculada. Cada forma tem-se sua maneira de se calcular a �rea. Conclus�o: O metodo area, na classe shape
	//tem que ser abstrato, mas eu preciso dele aqui na superclasse por causa do polimorfismo
	
	public abstract double area(); //S� isso porque o met�do � abstrato. 
	//Justamente porque meu metodo � abstrato que minha classe tbm vai ser
	
	

}
