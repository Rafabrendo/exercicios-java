package application;

public class Program {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		//Estou instanciando meu vetor com alguns valores. Nesse caso
		//Meu vetor terá três posições
		
		//Laço for normal
		for(int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		/*Vai imprimir na tela:
		 * Maria
		   Bob
		   Alex
		 * */
		System.out.println("----------------------");
		//Laço for each
		//Esse laço vai percorrer cada um dos elementos
		//do vetor vect, chamando cada um dos elementos
		//de obj. Vai causar o mesmo efeito do outro laço for
		for(String obj: vect) {
			System.out.println(obj);
		}
		/*Maria
		  Bob
          Alex*/
	}

}
