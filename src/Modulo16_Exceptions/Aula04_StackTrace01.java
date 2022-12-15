package Modulo16_Exceptions;

public class Aula04_StackTrace01 {

	public static void main(String[] args) {
		
		try {
			
			String Teste = "123s";
			Double.parseDouble(Teste);
			System.out.println("Convertido: " + Teste);
			
		}catch(Exception Erro) {
			
			//System.out.println("Erro ao CONVERTER: " + Erro);
			
			//chamando o metodo StackTrace
			Erro.printStackTrace();
			
		}
		
		
		
	}

}
