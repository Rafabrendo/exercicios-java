package util;

import java.util.function.Function;

import entities.Product;

public class UpperCaseName implements Function<Product, String>{
	//Vai entrar um Product e vai sair(resposta) um tipo String
	
	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
		//Meu metodo vai retornar um String
		//Esse apenas retorna. Se eu quiser alterar o nome, eu preciso de um metodo void que pega
		//o setName()
	}
	
}
