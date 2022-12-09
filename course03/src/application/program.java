package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		System.out.println("Name: ");
		student.name = sc.nextLine();
		System.out.println("Note first semester:");
		student.firstSemester = sc.nextDouble();
		System.out.println("Note second semester:");
		student.secondSemester = sc.nextDouble();
		System.out.println("Note third semester:");
		student.thirdSemester = sc.nextDouble();
		
		System.out.println(student);
		
		
		
		
		sc.close();
	}

}
