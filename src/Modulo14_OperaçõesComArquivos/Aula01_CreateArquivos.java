package Modulo14_OperaçõesComArquivos;
import java.io.File;
import java.io.IOException;

public class Aula01_CreateArquivos {

	public static void main(String[] args) {
		
		// Instanciando
		
		File Obj = new File("C:\\Users\\User\\Desktop\\NomeDoArquivo.txt");
		
		// Criar
		
		try {
			if(Obj.createNewFile()) {
			
				System.out.println("Arquivo criado " + Obj.getName());
			
			}else {
			
				System.out.println("Arquivo já existe");
			
			}
				
		}catch(IOException erro){
			
			System.out.println("Errou ao executar" + erro);
			
			// erro.ptrintStackTrace();
			
		}
				
	}

}
