package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName: "+ path.getName());
		
		/*Enter a file path: 
		  D:\workspace\ws - eclipse 02\in.txt
	      getName: in.txt*/
		
		System.out.println("getParent: "+ path.getParent());
		//vai pegar só o caminho
	/*Enter a file path: 
	D:\workspace\ws - eclipse 02\in.txt
	getName: in.txt
	getParent: D:\workspace\ws - eclipse 02*/
		
		System.out.println("getPath: "+ path.getPath());
		//vai pegaro o caminho completo
	/*Enter a file path: 
D:\workspace\ws - eclipse 02\in.txt
getName: in.txt
getParent: D:\workspace\ws - eclipse 02
getPath: D:\workspace\ws - eclipse 02\in.txt*/
		
		//Obs.: A classe File tem mtos recursos.
		
		
		
		sc.close();
	}

}
