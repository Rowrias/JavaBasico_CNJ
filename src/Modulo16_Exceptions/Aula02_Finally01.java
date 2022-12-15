package Modulo16_Exceptions;

public class Aula02_Finally01 {

	public static void main(String[] args) {
		try {
			
			int[] Numeros = {1,2,3};
			System.out.println(Numeros[3]); // altere aqui
			
		}catch(Exception MSN) {
			
			System.out.println("Algo deu errado." + MSN);
			
		}finally {
			
			System.out.println("Mensagem final!!!");
			
		}

	}

}
