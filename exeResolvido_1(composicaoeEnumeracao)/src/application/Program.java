package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		//Para quando o usuario digitar a data, ela seja formatada do jeito que coloquei aqui
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data:");
		System.out.println("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.println("Base salary: ");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		/*Instanciei um novo objeto do tipo Worker. Os dados desse objeto é o nome que digitei, uma instancia do tipo WorkerLevel
		 * que converti de string para enum, no valor que digitei, um double como valor de salário base. E uma associação a um outro objeto
		 * do tipo Department e o nome desse Department vai ser o que eu digitei.
		 * */
		//vou passar o workerLevel que tá na forma de string(conversão de String para enum).
		//O department é um outro objeto do tipo Department. É uma composição de objetos. Então eu tenho
		//que instanciar o department passando o nome que eu obtive com a variavel departmentName
		//Presta atenção nos nomes/letras
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.print("Enter contract #"+ i + " data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next()); //Passei uma entrada de dados como parametro, que é o q o usuario vai digitar
			//Isso pode gerar uma execção e pra resolver isso basta adicionar:  throws ParseException ao main, no começo .
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			//Com esse dados eu já tenho condição de instanciar o meu contrato
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract); //Associação do contrato com o trabalhador.
			//A lista de contrato começa vazia e toda vez que eu chamar o metodo addContract, o contrato vai ser adicionado a lista.
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income(MM/YYYY) :");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2)); // substring(inicio, fim) -> Vou passar pra variavel o MM, posição 0 e 1, mas eu tenho que informar a posição 2
		//Isso vai recortar uma string e gerar uma substring, nesse caso em dois digitos
		//Integer.parseInt() -> vai converter a string em inteiro
		int year = Integer.parseInt(monthAndYear.substring(3)); //Vai recortar da posição 3 em diante 
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());//Composição de objetos
		//tem o objeto worker, vou acessar o outro objeto que associei a ele (getDepartment()) e dps vou pegar o nome.
		System.out.println("Income for "+monthAndYear+": "+String.format("%.2f",worker.income(year, month))); 
		
		
		sc.close();
	}

}
