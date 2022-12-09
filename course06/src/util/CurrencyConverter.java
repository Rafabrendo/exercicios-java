package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	/*Não pode ser desse jeito porque isso são dados de um objeto
	 * public static double dollar;
	public static double manyDollar;
	*/
	
	
	public static double amount(double dollar, double manyDollar) {
		double valor = dollar * manyDollar;
		return (valor + (valor * IOF));
	}

}
