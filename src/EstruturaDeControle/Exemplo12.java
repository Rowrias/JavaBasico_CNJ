package EstruturaDeControle;

public class Exemplo12 {
	public static void main(String[] args) {
		// 1 DOMINGO/ 2 SEGUNDA / 3 TERÇA / 4 QUARTA / 5 QUINTA / 6 SEXTA / 7 SÁBADO
		int DiaSemana = 10;
		// 
		switch(DiaSemana) {
		case 1 :
			System.out.println("DOMINGO");
			System.out.println("Outra Coisa");
			break;
		case 2 : 
			System.out.println("SEGUNDA");
			break;
		case 3 :
			System.out.println("TERÇA");
			break;
		case 4 :
			System.out.println("QUARTA");
			break;
		case 5 :
			System.out.println("QUINTA");
			break;
		case 6 :
			System.out.println("SEXTA");
			break;
		case 7 :
			System.out.println("SÁBADO");
			break;
		default :
			System.out.println("Número INVÁLIDO para o dia da semana!");
		}
		//
		String Pergunta = "abc";
		
		switch(Pergunta) {
		case "Sim" :
			System.out.println("Resposta Verdadeira");
			break;
		case "Não" :
			System.out.println("Resposta Falsa");
			break;
		default :
			System.out.println("Reposta INVÁLIDA");
		}		
	}
}
