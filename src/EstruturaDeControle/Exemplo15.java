package EstruturaDeControle;

/*
 * Comando for deve ser usado sempre que se deseja que um código seja executado um
 * determinado número de vezes.
 */

public class Exemplo15 {
	public static void main(String[] args) {
		
		int i;
		for(i = 1; i <= 10; i++) {// [Ínicio ; Condição ; Contador ou incremento
			System.out.println("Valor = " + i);	// comandos do loop				
		}//fim da repetição
		
		int Resultado = 0, Multiplicando = 7;
		for(i = 1; i <= 10; i++) {
			Resultado = Multiplicando * i;
			System.out.println(Multiplicando + " X " + i + " = " + Resultado);
		}//fim da repetição
		
		int Resultado2 = 0, A = 1, B = 1;
		for(A = 1; A <= 10; A++) {
			for(B = 1; B <=10; B++) {
				Resultado2 =  B * A;
				System.out.println(A + " X " + B + " = " + Resultado2);
			}//fim da repetição
			System.out.println("Fim Tabuada do(a): " + A);
		}//fim da repetição
	}
}
