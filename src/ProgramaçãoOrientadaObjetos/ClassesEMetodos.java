package ProgramaçãoOrientadaObjetos;

public class ClassesEMetodos {
	// Classes
	
	// Atributos
	
	// Método static
	static void MeuMetodo() {		
		System.out.println("Resultado do método!");
		Somar();		
	}
	static void Somar() {
		int Num1 = 10, Num2 = 25;
		int Resultado = Num1 + Num2;
		System.out.println("Resposta: " + Resultado);
	}
	
	// Método public	
	public void Metodo() {
		
		System.out.println("Testando método public");
		
	}
	
	public static void main(String[] args) {
		
		// Objetos
		
		// Chamar o método static
		MeuMetodo();
		
		// Chamar o método public
		ClassesEMetodos Obj = new ClassesEMetodos();
		Obj.Metodo();				
	}

}
