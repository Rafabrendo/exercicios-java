package application;

import java.util.Scanner;

import service.PrintService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//PrintService ps = new PrintService();
		//PrintServiceString ps = new PrintServiceString();
		//PrintService ps = new PrintService();
		
		//PrintService<Integer> ps = new PrintService<>();
		//vou passar o tipo que eu quero aqui. Nesse caso eu passei Integer
		//tenho que colocar <> no final tbm
		PrintService<String> ps = new PrintService<>();
		
		
		System.out.println("How many values? ");
		int n = sc.nextInt();
		
		//ps.addValue("Maria"); #Deu type Safety
		
		//adicionar uma String é perfeitamente normal, porque o Object aceita tudo do 
		//tipo object e em java, tudo é Object.
		
		for(int i = 0; i<n; i++) {
			String value = sc.next();
			//Integer value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println();
		
		
		//Integer x = (Integer)ps.first(); #Não preciso mais fazer o casting
		//Integer x = ps.first();
		String x = ps.first(); // Não vai precisar de casting
		System.out.println("First: " + ps.first());
		System.out.println(x);
		
		
		
		sc.close();
	}

}
