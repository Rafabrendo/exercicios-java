package devices;

public class ConcreteScanner extends Device implements Scanner {

	public ConcreteScanner(String serialNumber) {
		super(serialNumber);
		// TODO Auto-generated constructor stub
	}
	
	//Sobrescrever a opera��o que veio de Device
	@Override
	public void processDoc(String doc) {
		System.out.println("Scanner processing: " + doc);	
	}
	
	//Sobreescrever a opera��o que veio da interface Scanner
	@Override
	public String scan() {
		return "Scanned content";
	}

}
