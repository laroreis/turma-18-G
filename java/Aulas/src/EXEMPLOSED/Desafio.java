package EXEMPLOSED;

import java.util.Scanner;

public class Desafio {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		int tamanho;
		
		System.out.println("Escreva o tamanho da linha: ");
		tamanho = ler.nextInt();
		linha(tamanho);
		
	}
	
	public static void linha (int tamanho)
	{
		for (int x=1; x<tamanho; x++)
		{
			System.out.print("-");	
		}
	}

}
