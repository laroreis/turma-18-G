package COLLECTION;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecoes {
	public static void main(String[] args) {
		Collection <String> nomes = new ArrayList();
		//adicionando nomes na lista
		nomes.add("Mario");
		nomes.add("Maria");
		nomes.add("Marciano");
		nomes.add("Mariana");
		
		//percorrer elementos da lista
		for (String name : nomes)
		{
			System.out.println("Lista de nomes: " + name);
		}
		
		/*Collection <String> nomes2 = Arrays.asList("Marcos","Marizete");   //adicionando nova lista
		nomes.addAll(nomes2);  //adicionando nomes na lista anterior
		System.out.println("Lista de nomes: " + nomes); */
		
		/* //verificando dados
		System.out.println("Contém o nome Maria? " +nomes.contains("Maria"));
		System.out.println("Lista: " +nomes); */
		
		
	/*	//limpando a lista
		System.out.println("Lista de nomes: " + nomes);
		nomes.clear();
		System.out.println("Lista de nomes: " + nomes);*/
		
		
		
	/*	//remove um nome da lista
	 * System.out.println("Lista de nomes: " + nomes);
		nomes.remove("Mario");				
		System.out.println("Lista de nomes: " + nomes); */
		
		//usado para saber se a lista esta vazia
		/*if(nomes.isEmpty())   
		{
			System.out.println("Lista vazia...");
		}
		else
		{
			System.out.println("Lista de nomes: " + nomes);
		} */
		
		//imprime a lista normalmente
		//System.out.println("Lista de nomes: " + nomes);
	}

}
