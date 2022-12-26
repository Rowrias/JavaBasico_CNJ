package Modulo17_;

import java.util.HashMap;

public class Aula11_BoxingUnboxingWrapper {

	@SuppressWarnings({ "removal", "rawtypes", "unchecked", "unused" })
	public static void main(String[] args) {
		
		//criando um wrapper
		
		Integer NUMERO = new Integer(10);
		Double NUMERO2 = new Double(2.5);
		
		System.out.println(NUMERO + " " + NUMERO2);
		
		HashMap hashMapSemAutoBoxing = new HashMap();
		hashMapSemAutoBoxing.put(new Integer(15),"Amanda");
		hashMapSemAutoBoxing.put(new Integer(16),"Caio");
		
		System.out.println(hashMapSemAutoBoxing.get(16));
		
		HashMap hashMapComAutoBoxing = new HashMap();
		hashMapComAutoBoxing.put(15,"Daiana");
		hashMapComAutoBoxing.put(16,"Bernardo");
		
		System.out.println(hashMapComAutoBoxing.get(16));
		
		// boxing
		Boolean Logico = true;
		Integer Inteiro = 1569;
		Double Real = 45.69;
		
		// unboxing
		
		boolean Logico2 = new Boolean("True");
		int Inteiro2 = new Integer(10);
		double Real2 = new Double(45.69);
				
	}

}
