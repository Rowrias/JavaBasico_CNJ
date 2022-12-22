package Modulo17_;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target (ElementType.TYPE_USE)
@interface NomeDesejado{}

public class Aula04_Anotaçoes02 {

	public static void main(String[] args) {
		
		@NomeDesejado String Texto = "abcd 1234";
		
		System.out.println("Exibir: " + Texto);
		Variavel();
		
	}
	
	static @NomeDesejado int Variavel() {
		System.out.println("Tipo Utilizado");
		return 0;
	}
	
}
