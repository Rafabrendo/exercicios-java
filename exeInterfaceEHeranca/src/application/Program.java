package application;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangle;
import model.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		AbstractShape s1 = new Circle(Color.BLACK, 2.0);
		//variavel do tipo AbstractShape e estou instanciando como Circle
		AbstractShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);
		
		//Obs.: Se eu declarar a variavel do tipo Shape, simplesmente terei apenas as operações do tipo shape
		
		System.out.println("Circle color: " + s1.getColor());
		System.out.println("Circle area: " + String.format("%.2f", s1.area()));
		System.out.println("Rectangle color: " + s2.getColor());
		System.out.println("Rectangle area: " + String.format("%.2f", s2.area()));
		
		

	}

}
