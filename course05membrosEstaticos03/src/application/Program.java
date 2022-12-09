package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*Calculato calc = new Calculator();
		 * Nesse caso eu não preciso mais instanciar o objeto para dps chamar a operação 
		 * a partir do objeto*/
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		/*Posso chamar a class e dps o metodo. ex.: Calculator (class)
		 * circumference(metodo)e se tiver atributo, atribuir.
		 * Agr eu tenho metodos staticos e constante estatica e eu posso utiliza-los
		 * independente de qualquer objeto
		 * */
		
		double v = Calculator.volume(radius);
		
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		
		sc.close();
	}

}
