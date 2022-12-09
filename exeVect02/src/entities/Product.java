package entities;

public class Product {
	private int number;
	private int soma;
	
	
	public Product() {
		
	}
	public Product(int number) {
		this.number = number;
		this.soma = 0;
	}
	public void setSoma(int soma) {
		this.soma = soma;
	}
	public int getSoma() {
		return soma;
	}
	
	public int getNumber() {
		return number;
		//Só vou passar o get porque não vou alterar e sim retornar.
	}
	
	public void sum(int soma) {
		this.soma += soma;
	}
		
}

