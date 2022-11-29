package ProgramaçãoOrientadaObjetos;

public class ConstrutoresComParametro {
	// Atributos
	
	int AnoModelo;
	String NomeModelo;	
	String NumPlaca;
	
	// Construtor
	public ConstrutoresComParametro(int Ano, String Nome, String Placa) {
		AnoModelo = Ano;
		NomeModelo = Nome;
		NumPlaca = Placa;
				
	}
	
	public static void main(String[] args) {
		
		ConstrutoresComParametro Obj = new ConstrutoresComParametro(2016, "Ford Ka", "LSL7J63");
		System.out.println(Obj.AnoModelo + " - " + Obj.NomeModelo + " - " + Obj.NumPlaca);
		
	}

}
