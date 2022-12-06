package Modulo05_EstruturaDeControle;

//"break"

public class Aula09_Break {
	static public void main(String[] args) {
		
		int i = 1;
		// while
		while(i <= 10) {
			System.out.println("Valor de i na iteração while: " + i);
			i++;
			if(i == 7) {
				break; // parar a execução da repetição
			}
		}
		
		// for
		for(i = 1; i <= 10; i++) {
			System.out.println("Valor de i na iteração for: " + i);
			if (i == 7) {
				break;
			}
		}
		
		// do while
		i = 1;
		do {
			System.out.println("Valor de i na iteração do while: " + i);
			i++;
			if(i == 7) {
				break;
			}
		}while (i <= 10);
				
	}
}
