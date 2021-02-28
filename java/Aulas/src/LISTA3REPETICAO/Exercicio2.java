package LISTA3REPETICAO;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ler 10 números e imprimir quantos são pares e quantos são ímpares.
		Scanner ler = new Scanner (System.in);
		
		int somaPares = 0;
		int somaImpares = 0;
		int numero = 0;
		
		for (int x=0; x < 10; x++)
		{
			System.out.println("\nDigite um número inteiro positivo: ");
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
