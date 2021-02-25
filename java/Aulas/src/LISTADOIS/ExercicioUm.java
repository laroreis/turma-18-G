package LISTADOIS;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		//Faça um programa que receba três inteiros e diga qual deles é o maior.
		Scanner ler = new Scanner(System.in);
		int numeroUm = 0;
		int numeroDois =0;
		int numeroTres = 0;
		int maior = 0;
		
		System.out.printf("Digite o primeiro Número: ");
		numeroUm = ler.nextInt();
		System.out.printf("\nDigite o segundo Número: ");
		numeroDois = ler.nextInt();
		System.out.printf("\nDigite o terceiro Número: ");
		numeroTres = ler.nextInt();
		
		if (numeroUm > numeroDois || numeroUm > numeroTres) 
		{
			maior = numeroUm;
			System.out.printf("\nO maior número é %d", maior );
		}
		else if (numeroDois > numeroUm || numeroDois>numeroTres)
		{
			maior = numeroDois;
			System.out.printf("\nO maior número é %d", maior);
		}
		else if (numeroTres > numeroUm || numeroTres > numeroDois) 
		{
			maior = numeroTres;
			System.out.printf("\nO maior número é %d", maior);
		}
		else
		{
			System.out.println("Nenhum número é o maior");
		}

	}

}
