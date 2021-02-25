package LISTADOIS;

import java.util.Scanner;

public class CondicionalUm {
	public static void main (String[] args)
	{
		Scanner ler = new Scanner (System.in);
		int idade = 0;
		String nome;
		
		System.out.println("Entre com sua idade: ");
		idade = ler.nextInt();
		ler.nextLine();
		System.out.println("Entre com o seu nome: ");
		nome = ler.nextLine();
		System.out.printf("\nSeu nome: %s",nome);
		System.out.printf("\nSua Idade: %d",idade);
		
		if (idade>=18)
		{
			System.out.printf("Você é maior de idade! ");
		}
		else if (idade >= 1 && idade <18)
		{
			System.out.printf("\nVocê é menor de idade! ");
		}
		else
		{
			System.out.printf("\nVocê entrou com uma idade inválida");
		}
		ler.close();
	}

}
