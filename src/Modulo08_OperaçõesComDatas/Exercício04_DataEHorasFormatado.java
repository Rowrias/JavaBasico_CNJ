package Modulo08_OperaçõesComDatas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercício04_DataEHorasFormatado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDateTime MeuObjeto = LocalDateTime.now();
		System.out.println("Data e Hora sem formatação: " + MeuObjeto);
		
		DateTimeFormatter Formatando = DateTimeFormatter.ofPattern("dd-MM-yyy HH-mm-ss");
		String Formatado = MeuObjeto.format(Formatando);
		System.out.println("Nova Data: " + Formatado);
		
	}

}
