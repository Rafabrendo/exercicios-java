package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		//fiz um macete para j� instanciar o vector com valores
		
		String path = "D:\\workspace\\ws - eclipse 02\\ra.txt";
		//estou criando um arquivo e associando-o a uma variavel string
		//Se olhar na pasta, n�o existe o ra.txt que foi declarado. E por isso vai criar o arquivo e gravar os dados l�
		//obs.: aula 217
		//Se rodar de novo, vai recriar o arquivo e gravar novamente
		//Para isso n�o acontecer(Recriar o arquivo) � s� passar true como paramentro
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			//o true vai significar que N�O se quer q recrie o arquivo
			for(String line: lines) {
				//Para cada String line contido no vector lines
				bw.write(line);
				//chamei o bw.write para escrever a linha no arquivo
				//por padr�o o write por padr�o n�o tem a quebra de linha. Preciso fazer o bw.newLine()
				bw.newLine();
			}	
		}
		catch(IOException e) {
			e.printStackTrace();
			//para mostrar o erro, se acontecer.
		}
		
	}

}
