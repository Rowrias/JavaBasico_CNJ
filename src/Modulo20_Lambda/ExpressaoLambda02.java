package Modulo20_Lambda;
import java.util.ArrayList;
import java.util.function.Consumer;

public class ExpressaoLambda02 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> Numeros = new ArrayList<Integer>();
		
		Numeros.add(58);
		Numeros.add(55);
		Numeros.add(6);
		Numeros.add(14);
		Numeros.add(18);
		
		// SINTAXE Nome<TIPO> Variável = expressão lambda
		Consumer<Integer> Metodo = (NUMEROS)->{System.out.println(NUMEROS);};
		
		Numeros.forEach(Metodo);
		
	}
	
}
