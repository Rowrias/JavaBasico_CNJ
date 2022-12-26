package Modulo17_;
//Classe Pai
class Pai{
	String nome;
	void MostrarPai() {
		System.out.println("Exibindo Pai");
	}
}

//Classe Filho
class Filho extends Pai{
	String FILHO;
	void MostrarFilho() {
		System.out.println("Exibindo Filho");
	}
}

public class Aula02_UpcastingDowncasting01 {

	public static void main(String[] args) {
		
		// Upcasting
		Pai obj = new Filho();
		obj.nome = "Luciano";
		obj.MostrarPai();
		
		Filho obj2 = (Filho) obj;
		
		// Downcasting
		obj2.FILHO = "Caio";
		System.out.println(obj2.nome);
		obj2.MostrarFilho();
		System.out.println(obj2.FILHO);
			
	}
	
}
