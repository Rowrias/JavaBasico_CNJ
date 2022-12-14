package Modulo13_Coleções;
import java.util.HashMap;

public class Aula02_ColeçãoHashMap {

	public static void main(String[] args) {
		
		HashMap<String, String> Obj = new HashMap<String, String>();
		
		Obj.put("FORD", "KA");
		Obj.put("FIAT", "UNO");
		Obj.put("FIAT1", "DOBLO"); // repitir o "FIAT" vai trocar o item pelo outro novo q adicionou
		
		Obj.clear(); // remove a lista inteira
		
		Obj.put("FIAT", "MAREA");
		
		System.out.println(Obj);
				
	}

}
