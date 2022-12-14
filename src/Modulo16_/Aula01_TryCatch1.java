package Modulo16_;

public class Aula01_TryCatch1 {
	
	public static void main(String[] args) {
		
		// Try e Catch é similar ao if e else
		try {
			int[] Numeros = {1,2,3,4,5,6,7,8,9,10};
			System.out.println("Posição 10: " + Numeros[10]);
		}catch(Exception Erro){
			System.out.println("Erro ao executar: " + Erro); // Dá erro pq não tem a posição 10 (O zero tbm conta)
		}
	
	}
	
}
