package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		/*Perceba que se pode criar variaveis ou coleções(ex.:listas)de um tipo abstrato, desde que eu instancie
		 * os objetos com tipos concretos, vai ser feito o upcasting, inclusive podendo fazer o polimorfismo.
		 * E esse polimorfismo passa naturalmente pelo interpretador.*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Shape #"+i+" data: ");
			System.out.print("Rectangle or Circle(r/c)? ");
			char ch = sc.next().charAt(0);
			while(ch != 'r' && ch != 'c') {
				System.out.println("Understand this option. Repeat, please!");
				System.out.print("Rectangle or Circle(r/c)? ");
				ch = sc.next().charAt(0);
			}
			System.out.print("Color (BLACK/BLUE/RED): ");
			String color = sc.next(); //Posso fazer assim ou posso fazer desse jeito tbm:
			//Color color = Color.ValueOf(sc.next());
			if (ch == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(Color.valueOf(color), width, height));
				//tenho que converter de String para enum
			}
			else if (ch == 'c') {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(Color.valueOf(color), radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS");
		for(Shape obj: list) {
			System.out.println("Area: "+String.format("%.2f", obj.area())+" color: "+ obj.getColor());
		}
		
		sc.close();
	}

}
