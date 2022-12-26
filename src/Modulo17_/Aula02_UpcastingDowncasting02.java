package Modulo17_;

class ClassePai{
	String nome;
	int IdadePai = 38;
	void PAI() {
		System.out.println("Pai");
	}
}

class ClasseFilho extends ClassePai{
	String nome;
	int IdadeFilho;
	void FILHO() {
		System.out.println("Filho");
	}
}

public class Aula02_UpcastingDowncasting02 {

	public static void main(String[] args) {
		
		ClassePai pai = new ClasseFilho();
		pai.nome = "Luciano Alonso";
		pai.PAI();
		System.out.println(pai.nome + " " + pai.IdadePai + " anos");
		
		ClasseFilho filho = (ClasseFilho) pai;
		
		filho.nome = "Bernardo de Souza";
		filho.IdadeFilho = 2;
		filho.FILHO();
		System.out.println(filho.nome + " " + filho.IdadeFilho + " anos");
		
	}

}
