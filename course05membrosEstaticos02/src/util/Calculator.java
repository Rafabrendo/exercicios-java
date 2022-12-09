package util;

public class Calculator {
	
	public final double PI = 3.14159;
	/*� um membro statico na minha class. Variav�l PI recebendo um valor
	 * (public static double PI = 3.14159;). Seu eu quiser fazer esse valor virar uma
	 * constante e n�o uma vari�vel, ou seja, que ele n�o pode mudar, � s� acressentar
	 * a palavra "final" dps de static*/
	
	public double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	public double volume(double radius) {
		return 4.0 * PI * Math.pow(radius, 3) / 3.0;
	}

}
