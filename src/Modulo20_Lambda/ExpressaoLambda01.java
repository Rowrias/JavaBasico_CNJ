package Modulo20_Lambda;
import java.util.ArrayList;
public class ExpressaoLambda01 {
	
	public static void main(String[] args) {
		
		// Declarando a coleção
		ArrayList<Integer> Numeros = new ArrayList<Integer>();
		
		Numeros.add(58);
		Numeros.add(55);
		Numeros.add(6);
		Numeros.add(14);
		Numeros.add(18);
		
		// SINTAXE LAMBDA: (NOME) -> {BLOCO DE CÓDIGO}
		// SINTAXE FOREACH: ForEach(Instrução);
		
		Numeros.forEach((NUMEROS) -> {System.out.println(NUMEROS);});
		
	}
	
}
