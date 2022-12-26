package Modulo17_;

import java.io.*;
import java.util.*;
@SuppressWarnings("unused")

class Estudante {
	String Nome;
	int id;
	String dept;
	
	Estudante(String Nome, int id, String dept){
		this.Nome = Nome;
		this.id = id;
		this.dept = dept;
	}
}

class Departamento{
	String Nome;
	private List<Estudante>estudantes;
	
	Departamento(String Nome, List<Estudante>estudantes){
		this.Nome = Nome;
		this.estudantes = estudantes;
	}
	
	public List<Estudante> getStudents(){
		return estudantes;
	}
}

class Instituto {
	String NomeInstituto;
	private List<Departamento>departamento;
	
	Instituto(String NomeInstituto, List<Departamento>departamento){
		this.NomeInstituto = NomeInstituto;
		this.departamento = departamento;
	}

	@SuppressWarnings("unused")
	public int getTotalStudentsInInstitute() {
		int noOfStudents = 0;
		List<Estudante>estudantes;
		for (Departamento dept : departamento) {
			estudantes = dept.getStudents();
			for(Estudante s : estudantes) {
				noOfStudents++;
			}
		}
		return noOfStudents;
	}
}

public class Aula10_Agregação {

	public static void main(String[] args) {
		
		Estudante E1 = new Estudante("Luciano", 1, "CFT");
		Estudante E2 = new Estudante("Alonso", 2, "CSF");
		
		List<Estudante> FisicaEstudante = new ArrayList<Estudante>();
		FisicaEstudante.add(E1);
		FisicaEstudante.add(E2);
		
		Departamento Fisica = new Departamento("CSF", FisicaEstudante);
		List<Departamento> departamento = new ArrayList<Departamento>();
		departamento.add(Fisica);
		
		Instituto instituto = new Instituto("SABER INFORMAÇÃO", departamento);
		
		System.out.println("Nome do instituto: " + instituto.NomeInstituto);
		System.out.println("Quantidade de Alunos" + instituto.getTotalStudentsInInstitute());
		
		}
	
}
