package Modulo16_;

public class Aula01_TryCatch2 {
	
	public static void main(String[] args) {
		
		String Teste = "Luciano"; // se colocar "null" vai pro erro (catch)
		String NovoTeste = null;
		
		try {
			
			NovoTeste = Teste.toLowerCase();
			System.out.println("Resultado: " + NovoTeste);
			
		}catch(NullPointerException Erro) {
			
			System.out.println("Erro apresentado!" + Erro);
			
		}
			
	}

}
