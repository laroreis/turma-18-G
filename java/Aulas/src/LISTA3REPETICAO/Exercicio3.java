package LISTA3REPETICAO;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		
		int idade = 0;
		int soma1= 0;
		int soma2 = 0;
		
		System.out.println("Escreva a sua idade: ");
		idade = ler.nextInt();
		
		while (idade != -99)
		{
			System.out.printf("\nSua idade:  %d",idade);
			
			if (idade<21)
			{
				soma1++;
			}
			else if(idade>=50)
			{
				soma2++;
			}
			
			System.out.println("\nEscreva a sua idade: ");
			idade = ler.nextInt();
		}
		System.out.printf("\nQuantidade de pessoas menores de 21 anos: %d", soma1);
		System.out.printf("\nQuantidade de pessoas maiores de 50 anos: %d", soma2);
		ler.close();
	}

}
