package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String path = "D:\\workspace\\ws - eclipse 02\\in.txt";
		//Essa variavel string � o caminho do arquivo
		//obs.: l� t� -> D:\workspace\ws - eclipse 02\in.txt 
		//mas no java tem que colocar duas barras
		
		FileReader fr = null;
		//FileReader((stream de leitura de caracteres a partir de arquivos)
		BufferedReader br = null;
		
		//esquema para ler um arquivo com BufferedReader
		try {
			fr = new FileReader(path);
			//Estou estabelencendo uma stream, uma sequenccia de leitura a partir do arquivo que estiver nesse
			//caminho.
			br = new BufferedReader(fr);
			//BufferedReader � instanciado a partir do FileReader. Ele � uma abstra��o maior. Eu pego a stream 
			//basica e partir dela eu instancia a stream de buffer pra deixar mais r�pido a leitura
			
			
			//Posso instanciar tbm dentro do bufferedReader:
			//br = new BufferedReader(new FileReader(path));
			
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
		
		finally {
			try {
				if(br != null) {
					br.close();
					//Isso porque l� no come�o eles recebem null. Da� se tiver algo dentro, eles v�o receber 
					//um valor, que � diferente de null.
				}
				if(fr != null) {
					fr.close();
				}
			}
			
			catch(IOException e) {
				e.printStackTrace();
				//Para ver o erro que aconteceu!
			}
		}
		
		

	}
}
