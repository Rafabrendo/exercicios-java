package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String path = "D:\\workspace\\ws - eclipse 02\\in.txt";
		
		//esquema para ler um arquivo com BufferedReader
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			//Passei tudo como argumento no try
			String line = br.readLine();
			//Vai ler uma linha do arquivo. Se o arquivo estiver no final, o arquivo vai retornar null
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}
		


	}

}
