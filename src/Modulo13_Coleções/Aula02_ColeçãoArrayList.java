package Modulo13_Coleções;
import java.util.ArrayList;

public class Aula02_ColeçãoArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> Obj = new ArrayList<String>();
		
		Obj.add("Luciano");
		Obj.add("Amanda");
		Obj.add("Bernardo");
		
		Obj.set(1, "Yasmin"); // trocou o segundo nome
		
		System.out.println("Mostrar o item 1: " + Obj.get(0));
		System.out.println("Mostrar o item 2: " + Obj.get(1));
		System.out.println("Mostrar o item 3: " + Obj.get(2));
		
		
	}

}
