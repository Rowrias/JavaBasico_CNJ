package Modulo04_TiposDeDados;

public class Aula07_SequênciaDeCaracteres {
	static String nome = "Rodrigo";
	static String nomeMae = "Silvana";
	static String disciplina = "Fisíca";
	static String periodo = "Tarde";
	static String sobrenome = "Najdek";
	
		
public static void main(String[] args) {
		System.out.println("Tamanho da variável; " + nome.length());
		System.out.println(nome.toUpperCase());
		System.out.println(nome.toLowerCase());
		System.out.println(nome.indexOf("R"));
		System.out.println(nome + " " + sobrenome);
		System.out.println(nome.concat(sobrenome));
		
	}
}
