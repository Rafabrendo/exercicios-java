package entities;

public class Product {
//o produto � uma entidade do meu neg�cio.
	
	public String name; //CamelCase: come�a com letra minusc o nome de atrributos e metodos
	public double price; // S�o atributos da class
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		//Essa fun��o n�o retorna valor. Ela s� altera o valor do atributo quantity.
		/*ambiguidade. Para resolver isso utilize o this.quantity, isso vai 
		 * mostrar que voc� quer acessar o atributo da classe(public int quantity)
		 * e n�o o parametro int quantity
		 */
		this.quantity += quantity;
		/*o this.quantity vai receber o que tinha nele, mais o atributo que chegou
		 * como parametro.
		 * */
	}
	public void removeProducts(int quantity) {
		//Essa fun��o n�o retorna valor. Ela s� altera o valor do atributo quantity.
		this.quantity -= quantity;
		
	}
	
	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price)
				+ ", " 
				+ quantity 
				+ " units, Total: $" 
				+ String.format("%.2f",totalValueInStock());
		/*vai formatar todos os valores e me retornar algo que o cliente possa ler.
		 * 
		 * */
	}
}
