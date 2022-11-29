package ProgramaçãoOrientadaObjetos;

public class ClassesEObjetos {
	
	//Objetos
	
	String Raça = "Pitbull";
	int Idade = 3;
	double Peso = 8.5;
	boolean Status = true;
	
	public static void main(String[] args) {
		//Instanciar
		ClassesEObjetos Obj = new ClassesEObjetos();
		
		ClassesEObjetos Obj2 = new ClassesEObjetos();
		
		//Exibindo o conteúdo
		System.out.println("Raça: " + Obj.Raça);
		System.out.println("Peso: " + Obj2.Peso);
		System.out.println("Idade: " + Obj.Idade);
		System.out.println("Status: " + Obj2.Status);

		
		
	}

}
