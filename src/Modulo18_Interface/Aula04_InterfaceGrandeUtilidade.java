package Modulo18_Interface;

interface AreaRetangulo{
	void getArea(int Largura, int Altura);
}

class Retangulo implements AreaRetangulo{
	public void getArea(int Largura, int Altura) {
		
		int Resultado = Largura * Altura;
		System.out.println("A area do RETANGULO é: " + Resultado);
	}
}

public class Aula04_InterfaceGrandeUtilidade {

	public static void main(String[] args) {
		
		Retangulo Mostrar = new Retangulo();
		
		Mostrar.getArea(5, 8);
		
	}

}
