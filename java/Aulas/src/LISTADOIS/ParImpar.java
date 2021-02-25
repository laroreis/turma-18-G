package LISTADOIS;

import java.util.Scanner;

public class ParImpar {
	public static void main (String[] args)
	{
		int numero = 0;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro positivo: ");
		numero = ler.nextInt();
		
		if (numero%2 == 0)
		{
			System.out.println("O número " + numero + "é par!!");
		}
		
		else 
		{
			System.out.printf("O número %d é impar !!", numero);
		}
		
		// %d - numero inteiro - tipo int
		// %s - tipo string - tipo cadeia de caractere
		// %f - tipo real - tipo double -- %.2f para 2 casas decimais
		
	}

}
