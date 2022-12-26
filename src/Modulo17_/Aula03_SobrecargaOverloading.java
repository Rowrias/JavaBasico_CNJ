package Modulo17_;

// usa a sobrecarga quando utiliza o mesmo método com parâmetros diferentes
	
public class Aula03_SobrecargaOverloading {
	
	static int Metodo(int a, int b) {
		return a + b;
	}
	
	static double Metodo(double a, double b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		
		int Num1 = Metodo(8, 5);
		
		double Num2 = Metodo(4.5, 5.5);
		
		System.out.println("Valor do método INTEIRO: " + Num1);
		System.out.println("Valor do método REAL: " + Num2);
		
	}

}
