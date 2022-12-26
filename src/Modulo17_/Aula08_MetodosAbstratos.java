package Modulo17_;

abstract class Animal4 {
	public abstract void comer();
}

class lobo extends Animal4{
	@Override
	public void comer() {
		System.out.println("Comida de Lobo!");
	}
}

class peixe extends Animal4{
	@Override
	public void comer() {
		System.out.println("Comida de Peixe!");
	}
}

public class Aula08_MetodosAbstratos {
		
	public static void main(String[] args) {
		
		Animal4 acao1 = new lobo();
		Animal4 acao2 = new peixe();
		
		acao1.comer();
		acao2.comer();
		
	}

}
