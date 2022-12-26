package Modulo17_;

class Animal5{
	public void SomDoAnimal() {
		System.out.println("Qual o Som que esse ANIMAL faz?");
	}
}

// Classe Filha - Recebendo a herança
class Cão3 extends Animal5{
	public void SomDoAnimal() {
		System.out.println("Cachorro:");
		System.out.println("Au Au Au!");
	}
}

class Porco3 extends Animal5{
	public void SomDoAnimal() {
		System.out.println("Porco:");
		System.out.println("Roinc Roinc!");
	}
}

class Gato3 extends Animal5{
	public void SomDoAnimal() {
		System.out.println("Gato:");
		System.out.println("Miau Miau!");
	}
}

class Leao3 extends Animal5{
	public void SomDoAnimal() {
		System.out.println("Leão:");
		System.out.println("Hurch Hurch!");
	}
}

public class Aula09_Polimorfismo {

	public static void main(String[] args) {
		
		// Chamadas junto com as instâncias
		Animal5 ANIMAL = new Animal5();
		Animal5 CÃO = new Cão3();
		Animal5 PORCO = new Porco3();
		Animal5 GATO = new Gato3();
		Animal5 LEAO = new Leao3();
		
		// Chamar os métodos
		ANIMAL.SomDoAnimal();
		CÃO.SomDoAnimal();
		PORCO.SomDoAnimal();
		GATO.SomDoAnimal();
		LEAO.SomDoAnimal();
		
	}

}
