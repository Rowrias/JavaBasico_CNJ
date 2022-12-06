package Modulo06_ProgramaçãoOrientadaObjeto;

public class Aula05_This {
	
	// atributo
	String Nome = "Luciano Alonso";
	// parâmetro
	public void setNome(String Nome) { 
		
		this.Nome = Nome; // atributo
		
	}
	
	public static void main(String[] args) {
		
		Aula05_This Obj = new Aula05_This();
		Obj.Nome = "Luciano Alonso da F. Junior"; // mandando a informação
		System.out.println("Nome: " + Obj.Nome);
		
	}

}
