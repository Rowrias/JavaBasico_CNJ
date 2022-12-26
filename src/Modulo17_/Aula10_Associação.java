package Modulo17_;
class Banco{
	private String Nome;
	Banco(String Nome){
		this.Nome = Nome;
	}
	public String getNomeBanco() {
		return this.Nome;
	}
}
class Empregado{
	private String Nome;
	Empregado(String Nome){
		this.Nome = Nome;
	}
	public String getNomeEmpregado() {
		return this.Nome;
	}
	
}
public class Aula10_Associação {

	public static void main(String[] args) {
		
		Banco banco = new Banco("banco EXEMPLO");
		Empregado empregado = new Empregado("Rodrigo Najdek");
		
		System.out.println(empregado.getNomeEmpregado() + " empregado do " + banco.getNomeBanco());
		
	}

}
