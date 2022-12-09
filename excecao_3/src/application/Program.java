package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		File file = new File("D:\\workspace\\ws - eclipse 02\\temp\\in.txt"); //Encontrou meu arquivo texto
		Scanner sc = null;
		try {
			sc = new Scanner(file); //Vai tentar abrir o meu arquivo
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine()); //vai ler o meu arquivo
			}
		}
		catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("Finally block executed");
		}
	}
}