package Modulo17_;

import java.io.*;
import java.util.*;
@SuppressWarnings("unused")
class Livro{
	public String título;
	public String autor;
	
	Livro(String título, String autor){
		this.título = título;
		this.autor = autor;
	}
}
class Livraria{
	private final List<Livro>livro;
	
	Livraria(List<Livro>livro){
		this.livro = livro;
	}
	public List<Livro> getTotalLivroLivraria(){
		return livro;
	}
		
}

public class Aula10_Composição {

	public static void main(String[] args) {
		Livro L1 = new Livro("Int. Java", "Pedro");
		Livro L2 = new Livro("Java", "Paulo");
		
		List<Livro> livros = new ArrayList<Livro>();
		
		livros.add(L1);
		livros.add(L2);
		
		Livraria livraria = new Livraria(livros);
		List<Livro> LIVROS = livraria.getTotalLivroLivraria();
		
		for(Livro livro : LIVROS) {
			System.out.println("Título: " + livro.título + " " + "Autor: " + livro.autor);
		}
		
	}

}
