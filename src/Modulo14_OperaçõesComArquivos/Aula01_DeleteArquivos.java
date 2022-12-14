package Modulo14_OperaçõesComArquivos;
import java.io.File;

public class Aula01_DeleteArquivos {

	public static void main(String[] args) {

		// Instanciando
		
		File Obj = new File("C:\\Users\\User\\Desktop\\NomeDoArquivo.txt");
				
		if(Obj.delete()) {
			System.out.println("Arquivo deletado");
		}else {
			System.out.println("Falha ao deletar");
		}
		
	}

}
