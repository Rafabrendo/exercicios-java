package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		//Vou entrar com D:\workspace\temp e vou listar as pastas que estão dentro
		
		File path = new File(strPath);
		//Uma variavel do tipo File póde ser tanto o caminho de um arquivo, quanto o caminho de uma pasta
		
		File[] folders = path.listFiles(File::isDirectory);
		//vector de File //Posso colocar uma função como argumento de outra função -> (File::isDirectory)
		//sintaxe de reference Methods -> File::isDirectory -> vai listar apenas o que for diretorio ou pasta
		//Vai criar um vetor de Files contendo cada um desses caminhos da pastas
		
		System.out.println("FOLDERS: ");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		/*D:\workspace\temp\site-de-vendas
		  D:\workspace\temp\ws- code blocks*/
		
		//vou fazer agr só com a lista de arquivos, sem as pastas. Do diretorio -> D:\workspace\ws - eclipse 02
		
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES: ");
		for(File file: files) {
			System.out.println(file);
		}
		/*D:\workspace\ws - eclipse 02\in.txt
		D:\workspace\ws - eclipse 02\ra.txt*/
		
		//Vou criar uma subpasta a partir da pasta ->workspace\ws - eclipse 02
		
		boolean success = new File(strPath + "\\subdir").mkdir();
		//a função vai retornar um boolean indicando se deu certo ou não
		//vvai criar uma subpasta chamada subdir, a partir da pasta que eu passar.
		System.out.println("Directory created successfully: " + success);
		
		
		sc.close();
	}

}
