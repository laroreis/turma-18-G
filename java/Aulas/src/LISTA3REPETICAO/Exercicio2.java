package LISTA3REPETICAO;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
		Scanner ler = new Scanner (System.in);
		
		int somaPares = 0;
		int somaImpares = 0;
		int numero = 0;
		
		for (int x=0; x < 10; x++)
		{
			System.out.println("\nDigite um n�mero inteiro positivo: ");
			numero = ler.nextInt();
			
			if (numero%2 == 0)
			{
				
				somaPares ++;
			}
			else 
			{
				somaImpares ++;
				
			}
			System.out.printf("\nQuantidade de pares %d: ", somaPares);
			System.out.printf("\nQuantidade de impares %d: ",somaImpares);
		}
		ler.close();
	}

}
