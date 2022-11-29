package ProgramaçãoOrientadaObjetos;

public class ConstrutoresSemParametro {
	// Atributos
	String Nome= "";
	
	// Construtores
	public ConstrutoresSemParametro() {
		
		Nome = "Luciano Alonso";
		
	}
	// Métodos
	public static void main(String[] args) {
		
		// Instanciar // Objetos
		ConstrutoresSemParametro Obj = new ConstrutoresSemParametro();
		System.out.println("Listar a Informação: " + Obj.Nome);
		
		
	}
}
