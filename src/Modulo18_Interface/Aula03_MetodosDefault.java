package Modulo18_Interface;

interface Tela{
	// Método Default
	default void tela() {
		System.out.println("Programação Java");
	}
	
	// Método Abstrato
	abstract void TelaMensagem(String Mensagem);
	
}
// implementando
public class Aula03_MetodosDefault implements Tela {
	// implementando o método abstrato
	public void TelaMensagem(String Mensagem) {
		System.out.println(Mensagem);
	}
	
	public static void main(String[] args) {
		
		Aula03_MetodosDefault Mostrar = new Aula03_MetodosDefault();
		
		// chamando método
		Mostrar.tela();
		Mostrar.TelaMensagem("Métodos Abstratos - Métodos Default");
		
	}

}
