package Modulo18_;

interface Empresa1{	// Declaração da interface
	// Métodos
	public void Função();
	public void Salario();	
}
class Gerente1 implements Empresa1{	// Nesta linha estamos implementado a interface
	
	public void Função() {
		System.out.println("Gerenciar a loja!");
	}
	public void Salario() {
		System.out.println("R$ 2.858,56");
	}
}

public class Aula01_IntroduçãoInterfaces01 {

	public static void main(String[] args) {
		
		Gerente1 obj = new Gerente1(); // Instancia
		// Chamando os metódos
		obj.Função();
		obj.Salario();
		
	}

}
