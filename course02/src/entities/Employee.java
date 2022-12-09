package entities;

public class Employee {
	public String name;
	public double GrossSalary;
	public double tax;
	
	public double NetSalary() {
		//net salary == salario líquido
		return GrossSalary - tax;
		
	}
	
	public void IncreaseSalary(double percentage) {
		//Increase Salary == aumentar salário
		this.GrossSalary = GrossSalary  * (1 + (percentage/100));
		
	}
	
	public String toString() {
		return  name + ", $ "
				+ String.format("%.2f", NetSalary());
	}
	
}
