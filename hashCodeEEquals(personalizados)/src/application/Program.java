package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		//Client c2 = new Client("Rafa", "rafa@gmail.com");
		Client c2 = new Client("Maria", "rafa@gmail.com");
		
		//Nome n�o � um bom criterio de compara��o porque existe pessoas com o mesmo nome
		
		/*
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));*/
		
		Client c3 = new Client("Maria", "maria@gmail.com");
		
		//agora eu vou utilizar os dois campos 
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		//Agora comparou dois dados e retornou como false
		System.out.println(c3.hashCode()); //gerou o mesmo hashcode que o c2
		System.out.println(c1.equals(c3)); //true
		
		System.out.println();
		
		System.out.println(c1 == c3); //false //deu false porque o == vai comparar, n�o o conteudo,
		//e sim, as referencias de memoria. Como criamos dois objetos diferentes, foi alocado no heap
		//posi��es de memoria diferentes. Por isso, mesmo os objetos tendo o mesmo conteudo, eles s�o
		//objetos que tem referencias diferentes na memoria, por isso: False!
		
		//para comparar os objetos pelo conteudo: equals
		//para comparar os objetos em rela��o as referencias do objeto: ==
		
		
		String s1 = "Test";
		//Se eu colocasse: String s1 = new String("Test"); -> seria diferente porque eu estou for�ando a cria��o
		//de um novo objeto.
		String s2 = "Test";
		
		System.out.println(s1 == s2); //true 
		//Nesse caso deu true porque o compilador trata de um modo especial para literais.
		

	}

}
