package ListaHeranca;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
//cria programas
public class Estoque {

	public static void main(String[] args) {
		
		
		//Scanner ler = new Scanner (System.in);
		Collection <String> estoque = new ArrayList <> (); //lista
		
		//armazenar
		estoque.add("Camisa");
		estoque.add("Short");
		estoque.add("AllStar");
		estoque.add("Moletom");
		
		//mostrando lista inicial
		System.out.println("A lista de itens é: ");
		System.out.println("Lista de itens: " + estoque);
		//remover
		
		System.out.println("Removendo item");
		//System.out.println("Lista de itens: " + estoque);
		estoque.remove("Camisa");
		
		//atualizando a lista
		System.out.println("Lista atualizada");
		System.out.println("Lista de itens: " + estoque);
		
		//mostrar dados
		
		for (String itens : estoque)
		{
			System.out.println("Lista de itens: " + itens);
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//armazenar a lista: 
		/*System.out.println("Digite a quantidade de itens no estoque: ");
		int quantidade = ler.nextInt();
		
		for (int x=1; x<=quantidade; x++) {
			System.out.println("Lista de estoque número: " + x);
			System.out.println("Qual o item: ");
			String item = ler.next();
			System.out.println("Qual o valor? ");
			double valor = ler.nextDouble();
		}*/
		
		//mostrar a lista
		
		

	}

}
