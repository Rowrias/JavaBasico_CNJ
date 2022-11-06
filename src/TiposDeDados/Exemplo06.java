package TiposDeDados;

/*Área do trapézio: (basemaior + basemenor).h
 * 							   2
 *Volume do cilíndro: V = pi * r² * h
 */

public class Exemplo06 {
	static int baseMaior = 7, baseMenor = 5, h = 3, areat;
	
	final static float PI = 3.14f;
	static float volumec, raio = 3, altura = 5;	
	
	static int idade = 30, peso = 60;

public static void main(String args[]) {
	
	areat = (( baseMaior + baseMenor ) * h ) / 2;
	System.out.println(areat);
	
	volumec = PI * (raio * raio) * altura;
	System.out.println(volumec);
	
	if (idade >= 18 && peso >= 50) {
		System.out.println("Pode doar =)!!");
		} else {
			System.out.println ("Não pode doar =(!");
			}
	}
}
