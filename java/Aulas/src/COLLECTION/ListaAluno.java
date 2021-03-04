package COLLECTION;

import java.util.HashSet;
import java.util.Set;

public class ListaAluno {

	public static void main(String[] args) {
	
		Set <Alunos> conjunto = new HashSet <Alunos> ();
		Alunos a = new Alunos ("João da Silva", "JAVA", 6.8);
		Alunos b = new Alunos ("Maria Souza", "Linux", 7.8);
		Alunos c = new Alunos ("Renata Almeida", "SO", 8.8);
		Alunos d = new Alunos ("Laro Reis", "HTML", 10);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		
		System.out.println(conjunto);

	}

}
