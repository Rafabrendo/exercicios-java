package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		//Matriz 
		/*Para arranjo bidimensional  [][]
		 *para arranjo tridimensional [][][]*/
		int [][] mat = new int[n][n]; //Isso aqui instancia a matriz na memória
		
		//Posso fazer mat.length (comprimento de mat(matriz)) ou i<n
		//Nesse caso, como é uma matriz quadrada, posso usar lenght na linha e na coluna, mas na coluna eu tenho
		//que especificar qual linha estou. mat[i].length
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
				//mat linha i, coluna j recebe sc.nextInt();
			}
		}
		System.out.println();
		int count = 0;
		System.out.println("Main diagonal: ");
		for(int i=0; i<n; i++) {
			System.out.print(mat[i][i] + " ");
			for(int j=0; j<n; j++) {
				if (mat[i][j] < 0) {
					count ++;
				}
				
			}
		}
		System.out.println();
		System.out.println("Negative numbers = " + count);
		
	
		
		sc.close();
	}

}
