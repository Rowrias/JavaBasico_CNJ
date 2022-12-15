package Modulo16_Exceptions;

public class Aula02_Finally03 {
	
	public static void main(String[] args) {
		
		try {
			int A = 0, B = 0; // altere aqui
			int Resultado = A / B;
			System.out.println("Resposta: " + Resultado);
			
		}catch(Exception MSN) {			
			System.out.println("Erro: " + MSN);
			
		}finally {
			System.out.println("Comando finally é independente de qual bloco do try/catch for executado");
			
		}

	}
	
}