package Modulo09_EntradaESaídaBásicaDeDados;
import java.util.Scanner;

// nextFloat - nextInt - nextDouble - nextByte - nextBoolean
// nextLong - nextLine - ...

public class EntradaESaídaSimples {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// instanciando e utilizando a passagem "System.in"
		Scanner Obj = new Scanner(System.in);
		
		// solicitando o usuário o que eu desejo que digite:
		System.out.println("Digite seu nome: "); 
		// Carregando a váriavel com a informaçao digitada
		String Nome = Obj.nextLine();
		// Exibindo a informação
		System.out.println("NOME DIGITADO: " + Nome);
		
		
		System.out.println("Digite a idade: ");
		String Idade = Obj.nextLine();
		System.out.println("IDADE DIGITADA: " + Idade);
				
		System.out.println("Digite um valor 'FLOAT': ");
		float FLOAT = Obj.nextFloat();
		System.out.println("INFORMAÇÃO DIGITADA 'FLOAT': " + FLOAT);
		
		System.out.println("Digite um valor 'INT': ");
		int INTEIRO = Obj.nextInt();
		System.out.println("INFORMAÇÃO DIGITADA 'INT': " + INTEIRO);
		
		System.out.println("Digite um valor 'DOUBLE': ");
		double REAL = Obj.nextDouble();
		System.out.println("INFORMAÇÃO DIGITADA 'DOUBLE': " + REAL);
		
		System.out.println("Digite 'true' para sim e 'false' para não, 'BOOLEAN': ");
		boolean LOGICO = Obj.nextBoolean();
		System.out.println("INFORMAÇÃO DIGITADA 'BOOLEAN': " + LOGICO);
		
		if(LOGICO == true) {
			System.out.println("Sim");
		}else {
			System.out.println("Não");
		}
		
	}

}
