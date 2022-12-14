package Modulo13_Coleções;
import java.util.ArrayList;
import java.util.Iterator;

public class Aula03_Iteradores01 {

	public static void main(String[] args) {
		//criação da coleção
		ArrayList <Integer> Objeto = new ArrayList<Integer>();
		
		Objeto.add(25);
		Objeto.add(10);
		Objeto.add(8);
		Objeto.add(9);
		Objeto.add(15);
		
		//criação do Iterador
		
		Iterator <Integer> Percorrer = Objeto.iterator();
		
		while(Percorrer.hasNext()) {
			
			Integer i = Percorrer.next();
			if(i < 10) {
				Percorrer.remove();
			}
			
		}
		
		System.out.println(Objeto);
		
		// add - remove - clear - put - set - get - size
		
		
	}

}
