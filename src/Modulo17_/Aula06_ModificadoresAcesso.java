package Modulo17_;

public class Aula06_ModificadoresAcesso {
	
	// Modificadores de atributos
	private String Nome1 = "Luciano"; ////
		
	// Modificadores de método
	static void ModificadoresAcesso1() { ////
		int R = 0, A = 10, B = 5;
		R = A + B;
		System.out.println("Total: " + R);
	}
	public void ModificadoresAcesso2() { ////
		int R = 0, A = 10, B = 5;
		R = A + B;
		System.out.println("Total: " + R);
	}
	
	public static void main(String[] args) {
		// static void
		ModificadoresAcesso1(); 
		
		
		// public void
		Aula06_ModificadoresAcesso Acesso = new Aula06_ModificadoresAcesso();
		
		Acesso.ModificadoresAcesso2();
		System.out.println(Acesso.Nome1);
		
	}

}
