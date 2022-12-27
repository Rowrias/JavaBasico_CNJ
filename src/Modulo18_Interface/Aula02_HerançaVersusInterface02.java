package Modulo18_Interface;

class EmpresaH{
	public void FuncaoH(){
		System.out.println("Gerenciar a loja - EMBATE - HERANÇA!");
	}
	public void SalarioH() {
		System.out.println("R$ 2.858,56 - EMBATE - HERANÇA");
	}
	
}

public class Aula02_HerançaVersusInterface02 extends EmpresaH{

	public static void main(String[] args) {
		
		EmpresaH obj = new EmpresaH();
		EmpresaH obj2 = new EmpresaH();
		
		obj.FuncaoH();
		obj2.SalarioH();
		
	}

}