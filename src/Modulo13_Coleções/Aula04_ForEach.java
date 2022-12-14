package Modulo13_Coleções;
import java.util.ArrayList;

public class Aula04_ForEach {

	public static void main(String[] args) {
		
		// Declaração da coleção
		
		ArrayList<String> Objeto = new ArrayList<String>();
		Objeto.add("Fiat Uno");
		Objeto.add("Fiat Doblo");
		Objeto.add("Hyundai Hb20");
		Objeto.add("Forda KA");
		Objeto.add("Hyundai I20");
		
		Objeto.remove(0);
		Objeto.set(0, "Fusca");
		
		for(String Mostrar : Objeto) {
			System.out.println(Mostrar);
		}
		
		System.out.println("Vetor ...............");
		
		String[] CARROS = {"Uno","Hb20","I30","Fusca"};
		
		for(String i : CARROS) {
			System.out.println(i);
		}
		
	}

}
