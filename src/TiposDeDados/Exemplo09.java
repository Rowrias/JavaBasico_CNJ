package TiposDeDados;

public class Exemplo09 {
	static boolean paberta = false;
	static boolean lampada = true;
	static int temperatura = 39;
	
public static void main(String args[]) {
		if (paberta == true) {
			System.out.println("Feche a porta!");
		} else {
			System.out.println("Abra a porta!");
		}
		///////////////////////////////////////////
		if (lampada == true) {
			System.out.println("A lâmpada está acesa!");
		} else {
			System.out.println("A lampada está apagada!");
		}
		//////////////////////////////////////////////
		if (temperatura < 30 && temperatura > 20) {
			System.out.println("Temperatura agradável");
		} else {
			System.out.println("Temperatura desagradável");
		}
	}
}
