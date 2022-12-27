package Modulo18_Interface;

interface Empresa2{	// Declaração da interface
	// Métodos
	public void Função2();
	public void Salario2();	
}

// Outra interface
interface Dois{
	
	public void FunçãoNova();
	public void SalarioNovo();
	public void FolgaNova();
}

class Gerente2 implements Empresa2{	// Nesta linha estamos implementado a interface
	
	public void Função2() {
		System.out.println("Gerenciar a loja!");
	}
	public void Salario2() {
		System.out.println("R$ 2.858,56");
	}
	public void Folga() {
		System.out.println("Maravilha");
	}
}

public class Aula01_IntroduçãoInterfaces02 {

	public static void main(String[] args) {
		
		Gerente2 obj2 = new Gerente2(); // Instancia
		// Chamando os metódos
		obj2.Função2();
		obj2.Salario2();
		obj2.Folga();
		
	}
	
}	