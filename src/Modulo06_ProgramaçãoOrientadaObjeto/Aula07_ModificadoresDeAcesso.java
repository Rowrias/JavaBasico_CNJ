package Modulo06_ProgramaçãoOrientadaObjeto;

public class Aula07_ModificadoresDeAcesso {
	// Atributos
	public String Nome;
	final int idade = 10;
	
	// Construtor
	public Aula07_ModificadoresDeAcesso(){
	//Nome = nome;
	//Idade = idade; não deixa modificar atributo "final"
	//Altura = altura;
		
	}
	
	//Métodos
	static void Acao() {		
		int Numero = 10;
		System.out.println("Número: " + Numero);
	}
	
	public void Acao2() {
		int Numero2 = 20;
		System.out.println("Número: " + Numero2);
	}
	public static void main(String[] args) {
		
		Acao();
		Aula07_ModificadoresDeAcesso Obj = new Aula07_ModificadoresDeAcesso(); //Instaciou para ter acesso ao public
		Obj.Acao2();
	}

}
