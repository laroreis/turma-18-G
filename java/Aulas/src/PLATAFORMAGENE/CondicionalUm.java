package PLATAFORMAGENE;

import java.util.*;

public class CondicionalUm {

	public static void main(String[] args)
	{
		Scanner ler = new Scanner (System.in);
		
		int idade;
		String nome;
		
		System.out.printf("Digite sua idade: ");
		idade = ler.nextInt();
		ler.nextLine(); //limpar antes de inserir
		System.out.printf("Digite seu nome: ");
		nome = ler.nextLine();
		
		System.out.printf("\nSeu nome: %s ",nome);
		System.out.printf("\nSua idade: %d",idade);
		
		if (idade>=18)
		{
			System.out.println("\nVocê é maior de idade!");
		}
		else if (idade>=1 && idade<18)
		{
			System.out.println("\nVocê é menor de idade");
		}
		else
		{
			System.out.println("Você entrou com o número invalido");
		}
		ler.close();

	}
 
}
