package COLLECTION;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapaAluno {
	public static void main(String[] args) {
		Map <String, Alunos> mapa = new TreeMap<String,Alunos>();
		
		Alunos a = new Alunos ("João da Silva", "JAVA", 6.8);
		Alunos b = new Alunos ("Maria Souza", "Linux", 7.8);
		Alunos c = new Alunos ("Renata Almeida", "SO", 8.8);
		Alunos d = new Alunos ("Laro Reis", "HTML", 10);
		
		
		mapa.put("João da Silva", a);
		mapa.put("Maria Souza", b);
		mapa.put("Renata Almeida", c);
		mapa.put("Laro Reis", d);
		
		System.out.println(mapa);
		System.out.println(mapa.get(d));
		
		Collection <Alunos> alunos = mapa.values();
		for(Alunos e: alunos)
		{
			System.out.println(e);
		}
	}

}
