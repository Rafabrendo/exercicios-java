package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Write the number of lines: ");
		int l = sc.nextInt();
		System.out.print("Write the number of colunes: ");
		int c = sc.nextInt();
		
		int [][] mat = new int [l][c];
		
		for (int i = 0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt(); 
			}
		}
		System.out.println();
		System.out.println("Sua Matriz: ");
		for (int[] obj: mat) {  //Fiz um for each
			for (int elemento: obj) {
				System.out.print(elemento + " ");
			}
			System.out.println();
		}
		
		System.out.println("Choose one number for knows your position: ");
		int num = sc.nextInt(); 
		
		List<Integer> position = new ArrayList<>();
		for (int i = 0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if(mat[i][j] == num) {
					position.add(i);
					position.add(j);
					System.out.println("Position: "+i+ ", "+j);
					if (j>0) {
						System.out.println("Left: "+mat[i][j-1]);
					}
					if (j<mat[i].length - 1) {
						System.out.println("Right: "+ mat[i][j+1]);
					}
					if (i>0) {
						System.out.println("Up: "+mat[i-1][j]);
					}
					if (i < mat.length - 1) {
						System.out.println("Down: "+ mat[i+1][j]);
					}
				}
			}
		}
		
		/*for(Integer elemento: position) {
			System.out.print(elemento+" ");
		}*/
		int a = mat.length - 1; 
		System.out.println(mat.length - 1);
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
		
		
		
		
		
		sc.close();
	}

}
