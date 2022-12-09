package util;

public class Calculator {
	public static final double PI = 3.14159;
	/*É um membro statico na minha class. Variavél PI recebendo um valor
	 * (public static double PI = 3.14159;). Seu eu quiser fazer esse valor virar uma
	 * constante e não uma variável, ou seja, que ele não pode mudar, é só acressentar
	 * a palavra "final" dps de static.
	 * PI é uma constate static e independe de qualquer objeto do tipo Calculator.*/
	
	public static double circumference(double radius) {
		/*Static porque ela pode ser calculada independente de qualquer objeto*/
		return 2.0 * PI * radius;
	}
	public static double volume(double radius) {
		return 4.0 * PI * Math.pow(radius, 3) / 3.0;
	}

}
