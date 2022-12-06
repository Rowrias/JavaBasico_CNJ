package Modulo06_ProgramaçãoOrientadaObjeto;

public class Aula06_ConstrutoresComParametro {
	// Atributos
	
	int AnoModelo;
	String NomeModelo;	
	String NumPlaca;
	
	// Construtor
	public Aula06_ConstrutoresComParametro(int Ano, String Nome, String Placa) {
		AnoModelo = Ano;
		NomeModelo = Nome;
		NumPlaca = Placa;
				
	}
	
	public static void main(String[] args) {
		
		Aula06_ConstrutoresComParametro Obj = new Aula06_ConstrutoresComParametro(2016, "Ford Ka", "LSL7J63");
		System.out.println(Obj.AnoModelo + " - " + Obj.NomeModelo + " - " + Obj.NumPlaca);
		
	}

}
