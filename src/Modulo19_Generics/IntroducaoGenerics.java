package Modulo19_Generics;

//criando a classe GENERICS
class Verificando<Parametro>{
	
// Parametro
	private Parametro item;
	
// Método
	public Verificando(Parametro item) {
		this.item = item;
	}
	
// Método pegar
	public Parametro getItem() {
		return item;
	}
	
// Método carregar
	public void setItem(Parametro item) {
		this.item = item;
	}
	
// Método Mostrar
	public void Detalhes() {
		System.out.println("Valor do Item: " + item);
		System.out.println("Tipo do item: " + item.getClass().getName());
	}
		
}

public class IntroducaoGenerics {

	public static void main(String[] args) {
		
		Verificando<String> obj = new Verificando<String>("Testando o tipo da informação");
		obj.Detalhes();
		
		System.out.println("_______________________________");
		
		Verificando<Integer> obj2 = new Verificando<Integer>(255);
		obj2.Detalhes();
		
	}

}
