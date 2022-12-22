package Modulo17_;

abstract class Animal3{
	
	public abstract void animal(String AÇÃO);
	
	public void Ação() {
		System.out.println("Dormindo!");
	}
}

	class Bicho extends Animal3 {
		public void animal() {
			System.out.println("Acordando!");
		}
		
		@Override
		public void animal(String Ação) {
			
		}
	}
	
	class Bicho2 extends Animal3 {
		public void animal() {
			System.out.println("Comendo!");
		}
		
		@Override
		public void animal(String Ação) {
			
		}
	}

public class Aula07_ClassesAbstratas {
	
	
	public static void main(String[] args) {
		
		Bicho Obj = new Bicho();
		Obj.Ação();
		Obj.animal();
		
		Bicho2 Obj1 = new Bicho2();
		Obj1.Ação();
		Obj1.animal();
	}
	
}
