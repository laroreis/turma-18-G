package LISTADOIS;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		Scanner ler = new Scanner(System.in);
		int numeroUm = 0;
		int numeroDois =0;
		int numeroTres = 0;
		int maior = 0;
		
		System.out.printf("Digite o primeiro N�mero: ");
		numeroUm = ler.nextInt();
		System.out.printf("\nDigite o segundo N�mero: ");
		numeroDois = ler.nextInt();
		System.out.printf("\nDigite o terceiro N�mero: ");
		numeroTres = ler.nextInt();
		
		if (numeroUm > numeroDois || numeroUm > numeroTres) 
		{
			maior = numeroUm;
			System.out.printf("\nO maior n�mero � %d", maior );
		}
		else if (numeroDois > numeroUm || numeroDois>numeroTres)
		{
			maior = numeroDois;
			System.out.printf("\nO maior n�mero � %d", maior);
		}
		else if (numeroTres > numeroUm || numeroTres > numeroDois) 
		{
			maior = numeroTres;
			System.out.printf("\nO maior n�mero � %d", maior);
		}
		else
		{
			System.out.println("Nenhum n�mero � o maior");
		}

	}

}
