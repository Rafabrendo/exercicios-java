package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static final double PI = 3.14159;
	/*� um membro statico na minha class. Variav�l PI recebendo um valor
	 * (public static double PI = 3.14159;). Seu eu quiser fazer esse valor virar uma
	 * constante e n�o uma vari�vel, ou seja, que ele n�o pode mudar, � s� acressentar
	 * a palavra "final" dps de static*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = circumference(radius);
		
		double v = volume(radius);
		
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);
		
		
		sc.close();
	}
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	public static double volume(double radius) {
		return 4.0 * PI * Math.pow(radius, 3) / 3.0;
	}
}
