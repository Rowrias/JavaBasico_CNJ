
package Modulo15_Recursividade;

public class Aula02_ComRecursividade {
	
	public static void main(String[] args) {
		
		System.out.println("Começo do programa");	
		
		Aula02_ComRecursividade Imprimir = new Aula02_ComRecursividade();
		System.out.println(Imprimir.Recursivo(10));
		
	}
	
	private int Recursivo (int x) {
		
		if(x == 0) {
			return 0;
		}
		
		if(x % 2 == 0) {
			return x + Recursivo(x - 1);
			
		}
		
		return Recursivo(x - 1);
		
	}
	
}
