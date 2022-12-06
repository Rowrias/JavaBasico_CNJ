package Modulo04_TiposDeDados;

import java.util.Scanner;

public class Aula06_Expressões {

	/* Operador         | 		Nome 								  |    Ordem de precedência
	 * ()				|  Parênteses								  |			1°
	 * ! / ++ / -- 		|  Negação, Incremento e Decremento			  |			2°
	 * % / *			|  Multiplicação, divisão e resto da divisão  |			3°
	 * + - 				|  Soma e subtração							  |			4°
	 * > >= < <=		|  Relacionais								  |			5°
	 * != ==			|  Desigualdade e igualdade					  |			6°
	 * && ||			|  Lógicos (E e OU)							  |			7°
	 * =				|  Atribuição								  |			8°
	 */
 
public static void main(String[] args) {
	try (Scanner in = new Scanner(System.in)) {
		System.out.print("Input first number: ");
		int n1 = in.nextInt();
		
		System.out.print("Input second number: ");
		int n2 = in.nextInt();
		
		System.out.print("Input third number: ");
		int n3 = in.nextInt();
		
		System.out.print("Média desses 3 números é: " + ( n1 + n2 + n3 ) / 3 );
	}
 }
}
