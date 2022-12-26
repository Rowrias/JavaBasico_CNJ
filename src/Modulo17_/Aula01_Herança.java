package Modulo17_;
// Classe Pai - Fazendo a herança
class Animal{
	public void SomDoAnimal() {
		System.out.println("Qual o Som que esse ANIMAL faz?");
	}
}

// Classe Filha - Recebendo a herança
class Cão extends Animal{
	public void SomDoAnimal() {
		System.out.println("Cachorro:");
		System.out.println("Au Au Au!");
	}
}

class Porco extends Animal{
	public void SomDoAnimal() {
		System.out.println("Porco:");
		System.out.println("Roinc Roinc!");
	}
}

public class Aula01_Herança {

	public static void main(String[] args) {
		
		// Chamadas junto com as instâncias
		Animal ANIMAL = new Animal();
		Animal CÃO = new Cão();
		Animal PORCO = new Porco();
		
		// Chamar os métodos
		ANIMAL.SomDoAnimal();
		CÃO.SomDoAnimal();
		PORCO.SomDoAnimal();
		
	}

}
