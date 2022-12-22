package Modulo17_;

//Classe Pai - Fazendo a herança
class Animal2 {
	public void SomDoAnimal() {
		System.out.println("Qual o Som que o ANIMAL faz?");
	}
}

//Classe Filha - Recebendo a herança
class Cão2 extends Animal2 {
	public void SomDoAnimal() {
		System.out.println("Cachorro");
		System.out.println("Au Au Au!");
		super.SomDoAnimal(); ////////////////
	}
}

class Porco2 extends Animal2 {
	public void SomDoAnimal() {
		System.out.println("Porco");
		System.out.println("Roinc Roinc!");
	}
}

class Gato extends Animal2 {
	public void SomDoAnimal() {
		System.out.println("Gato");
		System.out.println("Miau Miau!");
	}
}

public class Aula05_PalavraSuper {

	public static void main(String[] args) {
		
		// Chamadas junto com as instâncias
		Animal2 ANIMAL = new Animal2();
		Animal2 CÃO = new Cão2();
		Animal2 PORCO = new Porco2();
		Animal2 Gato = new Gato();
		
		// Chamar os métodos
		ANIMAL.SomDoAnimal(); 
		CÃO.SomDoAnimal();
		PORCO.SomDoAnimal();
		Gato.SomDoAnimal();
	}

}
