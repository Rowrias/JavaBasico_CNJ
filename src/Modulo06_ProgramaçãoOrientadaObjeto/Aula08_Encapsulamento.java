package Modulo06_ProgramaçãoOrientadaObjeto;

import javax.swing.JOptionPane;

public class Aula08_Encapsulamento { // Serve para proteger informaçoes

	private String Nome;
	
	// pegando as informações
	public String getNome() {
		return Nome; // retorno do método
	}
	// Carregar as informações
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	
	public void Carregar(String Nome) {
		Exibir();
	}
	
	public void Exibir() {
		System.out.println("Nome digitado: " + Nome);
		
	}
	
	public static void main(String[] args) {
		Aula08_Encapsulamento Obj = new Aula08_Encapsulamento(); // instanciar
		// Carregando o objeto
		Obj.Nome = JOptionPane.showInputDialog("Digite o nome!");
		Obj.Carregar(Obj.Nome); // Passagem de parâmetro
		
	}

}
