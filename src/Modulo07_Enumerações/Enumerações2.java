package Modulo07_Enumerações;

public enum Enumerações2 {
	A("Opção 1"),
	B("Opção 2"),
	C("Opção 3");

	private String descrição;
	
	// criação do construtor
	Enumerações2(String descrição){
		this.descrição = descrição;
	}
	
	// pegar a descrição
	public String getDescrição() {
		return descrição;
	}
	
	
	public static void main(String[] args) {
		
		for(Enumerações2 DESCRIÇÃO : Enumerações2.values()) {
			System.out.println(DESCRIÇÃO.getDescrição());
		}
		
	}

}
