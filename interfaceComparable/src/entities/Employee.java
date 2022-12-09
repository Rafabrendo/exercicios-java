package entities;

public class Employee implements Comparable<Employee> {
	//eu implementei o Comparable< > por causa do Collections.sort
	//basicamente: o metodo sort só pode ordernar a lista de um tipo <T> se esse T for um tipo Comparable
	//foi o que eu fiz, eu implementei o tipo Comparable<Employee> e daí transformei o Employee
	
	//S interface Comparable serve para definir na sua classe como que um objeto é comparado com outro, bastando 
	//apenas implementar esse contrato
	
	private String name;
	private Double Salary;
	
	public Employee(String name, Double salary) {
		this.name = name;
		Salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return Salary;
	}

	public void setSalary(Double salary) {
		Salary = salary;
	}
	
	//isso vai acontecer quando eu chamar o metodo sort no programa
	//esse metodo vai comparar um objeto com outro
	@Override
	public int compareTo(Employee other) {
		//return name.compareTo(other.getName());
		//estou aproveitando o compareTo da classe String que já existe e comparando com o outro
		//vai comparar e ordenar por nome
		//olhar pdf. obs.: quando tem numero positivo, siginfica que um nome é maior que o outr
		//negativo é ao contrario e 0 é porque são iguais
		
		//comparar e ordenar por salario:
		//return Salary.compareTo(other.getSalary());
		//organizou do menor salario para o maior, de forma crescente
		
		return -Salary.compareTo(other.getSalary());
		//retornou de forma decrescente, do maior para o menor
		//por causa do sinal negativo
	}
}
