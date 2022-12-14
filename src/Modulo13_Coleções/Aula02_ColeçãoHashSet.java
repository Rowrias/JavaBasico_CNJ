package Modulo13_Coleções;
import java.util.HashSet;

public class Aula02_ColeçãoHashSet {

	public static void main(String[] args) {
		
		HashSet<String> Obj = new HashSet<String>();
		
		Obj.add("Luciano"); // ADICIONANDO
		Obj.add("Amanda");
		Obj.add("Bernardo");
		
		if(Obj.contains("Luciano")) { // VERIFICANDO SE CONTEM A STRING
			System.out.println("Contem a string Luciano");
		}else {
			System.out.println("Não contem a string Luciano");
		}
		
		System.out.println("Itens: " + Obj);
		
		Obj.remove("Luciano"); // REMOVENDO
	
		if(Obj.contains("Luciano")) { // VERIFICANDO SE CONTEM A STRING
			System.out.println("Contem a string Luciano");
		}else {
			System.out.println("Não contem a string Luciano");
		}
		
		System.out.println("Itens: " + Obj);
		
	}

}
