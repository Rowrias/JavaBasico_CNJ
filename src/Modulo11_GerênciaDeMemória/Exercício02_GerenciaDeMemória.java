package Modulo11_GerênciaDeMemória;

public class Exercício02_GerenciaDeMemória {

	public static void main(String[] args) {
		
		Runtime Obj = Runtime.getRuntime();
		
		System.out.println("Memória TOTAL: " + Obj.totalMemory());
		System.out.println("Memória antes da instância: " + Obj.freeMemory());
		
		for(int i =0; i <100000; i++) {
		}
		
		System.out.println("Depois: " + Obj.freeMemory());
		Obj.gc();
		System.out.println("Coleta de lixo:" + Obj.freeMemory());
		
	}

}
