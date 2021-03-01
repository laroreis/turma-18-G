package ARRAYS;

import java.util.Scanner;

public class Tarefa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Faça um programa que crie um vetor por leitura com 5 valores
		 * de pontuação de uma atividade e o escreva em seguida. Encontre após
		 * a maiorpontuaçãoe apresente.
		 */
		
		Scanner ler = new Scanner (System.in);
		int valores[] = new int [5];
		int maior = 0;
		
		for (int y=0; y<valores.length; y++)   //pega informação com o usuario / .lengh fala o tamanho do vetor
		{
			System.out.printf("Digite o valor %d: ", (y+1));
			valores[y]= ler.nextInt();	
		}
		for (int y = 0; y<valores.length; y++) //imprime no console
		{  
			System.out.printf("O valor %d: é %d \n ", (y+1), valores[y]);
			
			if (valores[y] > maior) {
				maior = valores[y];
			}
		}
		System.out.printf("A maior pontuação é %d",maior);
	}

}
