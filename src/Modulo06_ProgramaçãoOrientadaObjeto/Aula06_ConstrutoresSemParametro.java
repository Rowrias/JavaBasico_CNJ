package Modulo06_ProgramaçãoOrientadaObjeto;

public class Aula06_ConstrutoresSemParametro {
	// Atributos
	String Nome= "";
	
	// Construtores
	public Aula06_ConstrutoresSemParametro() {
		
		Nome = "Luciano Alonso";
		
	}
	// Métodos
	public static void main(String[] args) {
		
		// Instanciar // Objetos
		Aula06_ConstrutoresSemParametro Obj = new Aula06_ConstrutoresSemParametro();
		System.out.println("Listar a Informação: " + Obj.Nome);
		
		
	}
}
