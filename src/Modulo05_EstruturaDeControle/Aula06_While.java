package Modulo05_EstruturaDeControle;

// Comando while usa quando não sabemos quantas vezes um loop será executado.

public class Aula06_While {
	public static void main(String[] args) {
	
			int A = 1, Resultado = 0;
			int B = 8;
			
			/*
			while (A <= 10) { // condição
				
				System.out.println(A); // mostrando o valor de A
				
				A++; // incremento (A++ é igual a (A = A + 1)) 
			} 
			*/
			
			
			while(A <= 10) {
				while (B <= 10) {
					Resultado = B * A; // instrução matemática
					System.out.println(B + " X " + A + " = " + Resultado); // instrução de impressão
					B++; // incremento
				}
				B = 1;
				System.out.println("Fim Tabuada :" + A);
				A++;
			}
			
			
			/*
			String Resposta = "Sim";
			int Contador = 0;
			
			while(Resposta.equals("Sim")) {
				System.out.println("Respondeu Sim");
				Contador++;
				Resposta = JOptionPane.showInputDialog("Sim ou Não?");
								
			}
			*/
			
	}
}
