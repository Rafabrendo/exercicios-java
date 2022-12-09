package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		File file = new File("D:\\workspace\\ws - eclipse 02\\in.txt");
		// \ (barra)-> é um prefixo de caracter especial. Para indicar que quer uma barra invertida, tem que colocar duas
		// duas barras (\\)
		//o objeto file vai ser todo o processo de encapsular o arquivo e tbm o caminho desse arquivo.
		//pode se ter varias operações a partir do file.
		Scanner sc = null;
		//Instanciar o Scanner a partir do arquivo file. Ao fazer isso, o programa vai tentar abrir o arquivo e nesse momento
		//pode ser gerada uma excecção do tipo IOException. Por isso eu coloco a instanciação no bloco try 
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				//sc.hasNextLine é para testar se ainda existe uma nova linha no arquivo
				//Se tiver uma linha no arquivo, eu mando imprimir
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e) {
			System.out.println("Error: "+e.getMessage());
		}
		finally{
			if(sc != null) {
				sc.close();
			}
		}
	}

}
