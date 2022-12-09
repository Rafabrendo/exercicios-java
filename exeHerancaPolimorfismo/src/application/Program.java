package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		/*
		Product p = new UsedProduct("TV", 100.25, sdf.parse("10/11/1997"));
		System.out.println(p.priceTag());
		Product c = new ImportedProduct("Tablet", 260.00, 20.00);
		System.out.println(c.priceTag()); */
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Product #"+i+" data:");
			System.out.println("Common, used or imported(c/u/i)?");
			char ch = sc.next().charAt(0);
			while(ch!= 'c' && ch!= 'u' && ch!= 'i') {
				System.out.println("Não entendi! Tente novamente");
				System.out.println("Common, used or imported(c/u/i)?");
				ch = sc.next().charAt(0);
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Customs fee:");
				double cf = sc.nextDouble();
				list.add(new ImportedProduct(name, price, cf));
			}
			else if(ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufacture = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, manufacture));
			}
			else if (ch == 'c') {
				list.add(new Product(name, price));
			}
					
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for(Product p: list) {
			System.out.println(p.priceTag());
		}
		
		
		
		sc.close();
	}

}
