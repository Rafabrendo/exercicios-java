package model.entities;

public class Invoice {
	
	private Double basicPayment;
	private Double tax;
	
	public Invoice() {
		
	}

	public Invoice(Double basicPayment, Double tax) {
		this.basicPayment = basicPayment;
		this.tax = tax;
	}

	public Double getBasicPayment() {
		return basicPayment;
	}

	public void setBasicPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	//Eu uso get(padrão). Esse é um dado calculado.
	public Double getTotalPayment() {
		return getBasicPayment() + getTax();
		/*Eu estou usando os get aqui e não o atributo direto porque, pode ser que no futuro, eu inclua
		 * alguma regra de calcular o imposto diferente. Daí, se eu mudar a logica do tax ou basicPayment, eu não
		 * vou precisar mudar aqui.*/
	}
	

}
