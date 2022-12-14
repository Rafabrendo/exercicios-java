package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String path = "D:\\workspace\\ws - eclipse 02\\registros.txt";
		/*
		System.out.print("How many candidates? ");
		int candidates = sc.nextInt();
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			System.out.println("Enter whith name and number of votes:");
			sc.nextLine();
			for(int i=0; i<candidates; i++) {
				String string = sc.nextLine();
				
				bw.write(string);
				
				bw.newLine();
				
				
			}
			
			
			
		}  catch(IOException e) {
			e.printStackTrace();
			
		}
		*/
		
		Map<String, Integer> votes = new LinkedHashMap<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
		
			
			String line = br.readLine();
						
			while(line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				int count = Integer.parseInt(fields[1]);
				
				if(votes.containsKey(name)) {
					int votesSoFar = votes.get(name);
					//o get() vai retornar o valor, pela chave
					votes.put(name, count + votesSoFar);
				}
				else {
					votes.put(name, count);
				}
				
				line = br.readLine();
			}
		
			for(String key: votes.keySet()) {
				System.out.println(key + ": " + votes.get(key));
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		
		
		
		
		
		
		
		sc.close();
	}

}
