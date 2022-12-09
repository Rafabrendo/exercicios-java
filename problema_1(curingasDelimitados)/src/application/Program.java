package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {
		
		List<Shape> myShapes = new ArrayList<>();
		//adicionei duas figuras do tipos Shapes a minha lista
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		
		
		//System.out.println("Total area: " + totalArea(myShapes));
		System.out.println("Total area: " + totalArea(myCircles));
		//vai dar um erro de compilação porque o List(Shape) não é um super tipo de List<Circle>
		//pra funcionar eu tenho que colocar um tipo curinga
		
	}
	
	//public static double totalArea(List<Shape> list) {
	public static double totalArea(List<? extends Shape> list) {
		//<? extends Shape> -> agora esse metodo vai aceitar uma lista de Circle ou Rectangle
		//essa lista pode ser de Shape ou de qualquer tipo que seja sub-tipo de Shape
		//vai percorrer a lista e pegar a area de cada figura e dps soma-las
		double sum = 0.0;
		for(Shape s: list) {
			sum += s.area();
		}
		return sum;
		//obs.: Não se pode adicionar elementos a lista aqui no metodo
	}

}
