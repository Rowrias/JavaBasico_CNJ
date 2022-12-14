package Modulo15_Recursividade;

public class Aula01_SemRecursividade {

	public static void main(String[] args) {
		
		System.out.println("Começo do programa");
		
		Aula01_SemRecursividade Imprimir = new Aula01_SemRecursividade();
		Imprimir.Mostrar(10);
		
	}
	
	private void Mostrar(int x) {
		int soma = 0;
		
		for(int cont = 0; cont <= x; cont ++) {
			if(cont % 2 == 0) {
				soma = soma + cont;
			}
			
			System.out.println("Soma: " + soma);
			
		}
		
	}
	
}
