package TiposDeDados;

public class Exemplo10 {
//////Menor para o maior é "automatico"
	static int ninteiro = 10;
	static float nreal = ninteiro;
	static double nreal_double = nreal;
//////Maior para o menor precisa alterar "manualmente"
	static float nfloat = 10;
	static int nint = (int) nfloat;
	
public static void main(String args[]) {
//////////////////////////////////////////
	System.out.println("Exemplo 1");
	System.out.println(ninteiro);
	System.out.println(nreal);
	System.out.println(nreal_double);
//////////////////////////////////////////
	System.out.println("Exemplo 2");
	System.out.println(nfloat);
	System.out.println(nint);
	
	
	}
}
