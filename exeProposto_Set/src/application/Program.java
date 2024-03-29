package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		String path = "D:\\workspace\\ws - eclipse 02\\log.txt";
		
		System.out.print("How many ");
		String[] x = new  String []{"a", "b", "c"}; 
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for(int i = 0; i<3; i++) {
				System.out.print("How many students for course "+ x[i] + "?");
				int j = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter with name of student: ");
				for (int k=0; k<j; k++) {
					String line = sc.nextLine();
					bw.write(line);
					//chamei o bw.write para escrever a linha no arquivo
					//por padr�o o write por padr�o n�o tem a quebra de linha. Preciso fazer o bw.newLine()
					bw.newLine();
					
				}	
			}
		}
		
		catch(IOException e) {
			e.printStackTrace();
			
	   }
		
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			Set<Product> set = new HashSet<>();
			//Escolhi o HashSet porque ele � mais r�pido, n�o importando a ordem.
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(" ");
				String name = fields[0];
				
				set.add(new Product(name));
				
				line = br.readLine();
			}
			System.out.println("Total students: " + set.size());
			
			for(Product e: set) {
				System.out.println(e.getName());
			}
			
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
		
	}

}
