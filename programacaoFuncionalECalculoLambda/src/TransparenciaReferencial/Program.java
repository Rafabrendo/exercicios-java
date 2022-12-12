package TransparenciaReferencial;

import java.util.Arrays;

public class Program {
	
	public static int globalValue = 3;
	
	public static void main(String[] args) {
		
		int[] vect = new int[] {3, 4, 5};
		changeOddValues(vect); //Mude os valores impares
		System.out.println(Arrays.toString(vect));
	
		
	}
	
	//O Comportamento dessa fun��o n�o depende exclusivamente no que est� dentro da fun��o, depende
	//de um comportamento, valor, externo a ela. Por isso que essa fun��o n�o tem transparencia
	//referencia. 
	//Um jeito de mudar valores do meu vetor.
	public static void changeOddValues(int[] numbers) {
		//Vai percorrer o vetor e vai testar e pode mudar/acrescentar o globalValue
		for(int i=0; i<numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				numbers[i] += globalValue;
			}
		}
	}
	

}
