package Modulo06_ProgramaçãoOrientadaObjeto;

public class Aula02_ClassesEObjetos {
	
	//Objetos
	
	String Raça = "Pitbull";
	int Idade = 3;
	double Peso = 8.5;
	boolean Status = true;
	
	public static void main(String[] args) {
		//Instanciar
		Aula02_ClassesEObjetos Obj = new Aula02_ClassesEObjetos();
		
		Aula02_ClassesEObjetos Obj2 = new Aula02_ClassesEObjetos();
		
		//Exibindo o conteúdo
		System.out.println("Raça: " + Obj.Raça);
		System.out.println("Peso: " + Obj2.Peso);
		System.out.println("Idade: " + Obj.Idade);
		System.out.println("Status: " + Obj2.Status);

		
		
	}

}
