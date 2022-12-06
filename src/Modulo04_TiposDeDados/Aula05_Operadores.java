package Modulo04_TiposDeDados;

public class Aula05_Operadores {
	static int idade = 6;
	/*
	 * Operador de atribuição
	No caso da atribuição, utilizamos o operador “ = ”, o qual 
	sinaliza que o valor após ele será atribuído à variável em 
	questão.
	 */
	
	
	/*
	 * Operadores de igualdade
	== | Verifica se os valores são iguais
	!= | Verifica a desigualdade entre as variáveis
	 */
	
	
	/*
	 * Operadores aritméticos
	 Soma: SALARIOB = SAL + 300
	 Subtração: SALL = SALB - DESC
	 Multiplicação: MULT = 2 * 3
	 Divisão: DIV = 10 / 2
	 Resto da Divisão: PAR = 10 % 2
	 */
	
	
	/*
	 * Operadores relacionais
	 > Maior 
	 >= Maior ou Igual 
	 < Menor 
	 <= Menor ou Igual
	 */
	
	/*
	 * Operadores lógicos
	 Conjunção (E): Para que o resultado seja verdadeiro (true), é 
	 necessário que todas as operações sejam verdadeiras. 
	 * 
	 Disjunção (OU): Para que o resultado seja verdadeiro basta que 
	 apenas uma operação seja verdadeira. 
	 */
	
	
public static void main(String args[]) {
	int vera = 50;
	int carlos = 23, marcela = 18, joana = 67;
	
	if(vera > carlos && vera > marcela) {
		System.out.println("Vera é a mãe!");
		} else if (vera > joana) {
		  System.out.println("Vera é a mãe!");	
			} else {
			  System.out.println("Joana é a mãe");	
				}
	
	}
}
