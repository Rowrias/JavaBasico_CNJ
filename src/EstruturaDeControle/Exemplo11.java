package EstruturaDeControle;

public class Exemplo11 {
	public static void main(String[] args) {
		
		String Aluno = "Luciano Alonso";
		double Nota1 = 10;
		double Nota2 = 10;
		double Nota3 = 6;
		double Nota4 = 0;
		double Media = (Nota1 + Nota2 + Nota3 + Nota4)/4;
		
		// aprovado e reprovado
		
		if(Media>=7) {
			System.out.println("Aluno: " + Aluno + " - Média: " + Media + " - Aprovado");
		} else {
			System.out.println("Aluno: " + Aluno + " - Média: " + Media + " - Reprovado");
		}
		
		// aprovado / Reprovado / Recuperação
		
		if(Media >= 7) {
			System.out.println("Aluno: " + Aluno + " - Média: " + Media + " - Aprovado");
		}else if(Media < 4) {
			System.out.println("Aluno: " + Aluno + " - Média: " + Media + " - Reprovado");
		}else {
			System.out.println("Aluno: " + Aluno + " - Média: " + Media + " - Recuperação");
		}
		
		// Cuidado quando for usar string, java é casesensitive (Dica: usar .equalsIgnorecase)
		
		String Teste = "Sim";
		
		if(Teste.equalsIgnoreCase("SIM")) {
			System.out.println("Verdade");			
		}else {
			System.out.println("Falsidade");
		}
		
	}
}
