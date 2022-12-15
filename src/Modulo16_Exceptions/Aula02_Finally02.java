package Modulo16_Exceptions;

public class Aula02_Finally02 {

	public static void main(String[] args) {
		
		String Teste = "RODRIGO NAJDEK VIEIRA RODRIGUES"; // Altere aqui pra "null" ou alguma "string"
		String NovoTeste = null;
		
		try {
			NovoTeste = Teste.toLowerCase();
			System.out.println("Saída: " + NovoTeste);
			
		}catch(NullPointerException Erro) {			
			System.out.println("Aconteceu algum erro" + Erro);
			
		}finally {
			System.out.println("Terminou a aplicação!");
			
		}

	}
	
}
