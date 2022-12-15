package Modulo16_Exceptions;
import java.io.PrintWriter;
import java.io.StringWriter;

public class Aula04_StackTrace02 {
			
	public static void main(String[] args) {
		
		try {
			String Teste = "123456s";
			Double.parseDouble(Teste);
			System.out.println("Convertido: " + Teste);
			
		}catch(Exception Erro) {
			
			StringWriter VAI = new StringWriter();
			PrintWriter IMPRIMIR = new PrintWriter(VAI);
			
			// Chamada do método
			Erro.printStackTrace(IMPRIMIR);
			
			System.out.println(VAI.toString());
			
		}
				
	}

}
