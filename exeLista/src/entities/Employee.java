package entities;

public class Employee {
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee() {
	}
	
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void increaseSalary(double percentage) {
		salary = salary + (salary * percentage / 100.0);
		/*Pode ser tbm:
		 * salary += salary * percentage / 100.0
		 * */
	}
	@Override /*Apesar do java não exigir, é bom colocar o Override no toString
	O override ajuda a não errar.*/
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
	
}
