package EstruturaDeControle;

/*
 * Comando "do while" funciona igual o "while", a diferença é que
 * a CONDIÇÃO só é analisada depois que os camandos são executados.
 */

public class Exemplo16 {
	public static void main(String[] args) {
		
		int A = 1, Resultado = 0, B = 1;
		/*
		 do { // inicio da estrutura
		
			System.out.println("Valor de A: " + A); //comandos que serão repetidos
			A++; // loop infinito
		
		}while(A <= 10); //teste lógico ou critério ou pergunte
		*/
		
		do {//primeiro loop
			do {//segundo loop
				Resultado = A * B;
				System.out.println(B + " X " + A + " = " + Resultado);
				A++;
			}while(A <= 10);
			A = 1;
			System.out.println("Fim da Tabuada: " + B);
			B++;
		}while(B <= 10);
	}	
}		
