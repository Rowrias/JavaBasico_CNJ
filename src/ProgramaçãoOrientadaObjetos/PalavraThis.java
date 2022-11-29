package ProgramaçãoOrientadaObjetos;

public class PalavraThis {
	
	// atributo
	String Nome = "Luciano Alonso";
	// parâmetro
	public void setNome(String Nome) { 
		
		this.Nome = Nome; // atributo
		
	}
	
	public static void main(String[] args) {
		
		PalavraThis Obj = new PalavraThis();
		Obj.Nome = "Luciano Alonso da F. Junior"; // mandando a informação
		System.out.println("Nome: " + Obj.Nome);
		
	}

}
