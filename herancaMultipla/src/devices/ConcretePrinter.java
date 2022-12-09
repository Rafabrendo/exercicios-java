package devices;

public class ConcretePrinter extends Device implements Printer {

	public ConcretePrinter(String serialNumber) {
		super(serialNumber);
	}
	
	//Sobrescrevendo a opera��o que veio de device
	@Override
	public void processDoc(String doc) {
		System.out.println("Printer processing: " + doc);
	}
	
	//Sobrescrevendo a opera��o que veio da interface Printer
	@Override
	public void print(String doc) {
		System.out.println("Printing: " + doc);
	}

}
