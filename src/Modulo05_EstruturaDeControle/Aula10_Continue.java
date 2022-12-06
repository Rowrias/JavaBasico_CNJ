package Modulo05_EstruturaDeControle;

//"Continue" funciona como o "break" porem ele não para a execução da estrutura

public class Aula10_Continue {
	public static void main(String[] args) {
		
		
		// while
		System.out.println("While: ");
		int i = 1;
		while(i <= 6) {
			if(i == 3) {
				i++;
				continue;
			}
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		System.out.println("While: Excluindo números ímpares: ");
		int Numeros = 0;
		while(Numeros <= 10) {
			if(Numeros % 2 != 0) {
				Numeros++;
				continue;
			}
			System.out.print(Numeros + " ");
			Numeros++;
		}
		
		// for
		System.out.println();
		System.out.println("For: ");
		i = 1;
		for(i = 1; i <= 6; i++) {
			if (i == 3) {
				continue;
			}
			
			System.out.print(i + " ");
			
		}
	}
}