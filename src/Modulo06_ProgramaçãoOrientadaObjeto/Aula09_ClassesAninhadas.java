package Modulo06_ProgramaçãoOrientadaObjeto;

public class Aula09_ClassesAninhadas { // Classe um
	
	public void ExibirClasseUm() {
		System.out.println("Minha Classe Um");
	}
	
	public class ClasseDois{
		public void ExibirClasseDois() {
			System.out.println("Minha Classe Dois");
		}
		
		public void MetodoExibir() {
			// Chamando método pra exibir a classe dois
			this.ExibirClasseDois();
			// Chamando método pra exibir a classe um
			Aula09_ClassesAninhadas.this.ExibirClasseUm();
		}
	}

	public static void main(String[] args) {
		Aula09_ClassesAninhadas Obj1 = new Aula09_ClassesAninhadas();
		Aula09_ClassesAninhadas.ClasseDois Obj2 = Obj1.new ClasseDois();
		Obj2.MetodoExibir();
		
	}

}
