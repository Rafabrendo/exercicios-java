package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import services.CalculationService;

public class Program{

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		//Minha lista vai ser um tipo de Product
		
		String path = "D:\\workspace\\ws - eclipse 02\\num.txt";
		
		try(BufferedReader  br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				//fiz um vetor de Strings que vai receber cada linha do arquivo, baseado 
				//no caracter ","
				//list.add(Integer.parseInt(line));
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			//Integer x = CalculationService.max(list);
			//Essa operação vai ser responsável por encontrar o maior elemento dessa lista
			//e retornar pra mim
			
			Product x = CalculationService.max(list);

			System.out.println("Most expensive:");
			System.out.println(x);
			
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
