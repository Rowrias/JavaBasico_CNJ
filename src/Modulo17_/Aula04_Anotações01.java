package Modulo17_;

public class Aula04_Anotações01 {
	
	public void mostrar() {
		System.out.println("Texto do método");
	}
	
}
	
	class Modelo extends Aula04_Anotações01{
		//@Override
		public void mostrar(int x){
			System.out.println("Texto do outro método");
		}
	
	
	public static void main(String[] args) {
		
		Modelo obj = new Modelo();
		obj.mostrar();
		
	}

}
