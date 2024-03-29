package demo1;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		//O tipo da key do Map � String e o value � String tbm
		//Uma estrutura para armazenar cookies.
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711122");
		
		cookies.remove("email");
		//Estou removendo do meu map aquela chave(key) cujo apelido � email
		
		cookies.put("phone", "99733322");
		//nessa inser��o, como j� tenho a chave phone, vai ser sobreescrever esse novo valor nessa chave
		
		
		System.out.println("Contains 'phone' key : " + cookies.containsKey("phone"));
		//Contains 'phone' key : true
		
		System.out.println("Phone number: " + cookies.get("phone"));
		//Phone number: 99733322
		
		System.out.println("Email: " + cookies.get("email"));
		//Email: null //quando o elemento n�o existe, retorna null
		
		System.out.println("Size: " + cookies.size());
		//Size: 2
		
		
		
		
		
		System.out.println("ALL COOKIES: ");
		for(String key: cookies.keySet()) {
			//a fun��o keySet() vai retornar as chaves do map
			System.out.println(key + ": " + cookies.get(key));
		}
		/*ALL COOKIES: 
		phone: 99711122
		username: Maria*/
		
		//removi o email e por isso n�o apareceu
		//al�m disso apareceu tudo em ordem alfabetica, por causa do TreeMap.
		
		//Sobreescri��o de valor
		/*ALL COOKIES: 
		phone: 99733322
		username: Maria*/
		
	}

}
