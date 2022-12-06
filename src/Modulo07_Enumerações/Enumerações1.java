package Modulo07_Enumerações;
// Declaração da enumeração
enum Altura{
	ALTO,
	MEDIO,
	BAIXO	
}

public class Enumerações1 {

	public static void main(String[] args) {
		Altura Obj = Altura.MEDIO; // Instacia com atribuição do valor
		
		// Estrutura case para verificar		
		switch(Obj) {
		case BAIXO:
			System.out.println("Valor do enum: BAIXO" );
			break;
		case MEDIO:
			System.out.println("Valor do enum: MEDIO" );
			break;
		case ALTO:
			System.out.println("Valor do enum: ALTO" );
			break;
		}
		
	}

}
