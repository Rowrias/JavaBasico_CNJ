package Modulo05_EstruturaDeControle;

//Ternário

public class Aula04_Ternário {
	
	public static void main(String[] args) {
		
		int Datas = 20;
		//sintaxe (Condição)?R_SE_Verdade:R_Se_Falso);
		
		String Saída = (Datas > 15) ? "Segunda Quinzena" : "Primeira Quinzena";
		System.out.println(Saída);
		
		System.out.println((Datas > 15) ? 
		"Primeira Quinzena" : 
		"Segunda Quinzena");
		
		// exemplos
		
		double Media = 5.5;
		System.out.println((Media >= 7)? "Aprovado" : (Media < 4)? "Reprovado" : "Recuperação");
		
		//
		
		double MEDIA = 9.5;
		int Faltas = 25;
		System.out.println((MEDIA >= 7 && Faltas <= 25)? "Aprovado" : "Reprovado");
		
	}
}
