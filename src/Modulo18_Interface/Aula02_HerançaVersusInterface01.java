package Modulo18_Interface;

interface EmpresaI{
	public void FuncaoI();
	public void SalarioI();
}

class GerenteI implements EmpresaI{ //
	public void FuncaoI(){
		System.out.println("Gerenciar a loja - EMBATE!");
	}
	public void SalarioI(){
		System.out.println("R$2.858,56 - EMBATE");
	}
	
}

public class Aula02_HerançaVersusInterface01 {

	public static void main(String[] args) {
		
		GerenteI obj = new GerenteI();
		obj.FuncaoI();
		obj.SalarioI();
	}

}