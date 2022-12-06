package Modulo04_TiposDeDados;

public class Aula02_Variáveis {
	static int valor1 = 10, valor2 = 15, n1 = 2;
	static int teste1 = 5;
	static float nota1 = 10;
	static double nota2 = 'b';
	static int notafinal = 10;
	public static final int MAX_MEDIA = 500; //Constante, não altera

public static void main(String args[]) {
	System.out.println(valor1);
	System.out.println(valor2);
	System.out.println(n1);
	System.out.println(teste1);
	System.out.println(nota1);
	System.out.println(nota2);
	notafinal = 8;
	System.out.println(notafinal);
	//MAX_MEDIA = 20; não altera a constante
	System.out.println(MAX_MEDIA);
	
	}
}