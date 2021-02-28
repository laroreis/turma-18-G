package LISTA3REPETICAO;

import java.util.Scanner;

public class Exercicio5 {
	//*Crie um programa que leia um número do teclado até que encontre um
		//*número igual a zero. No final, mostre a soma dos números
		//*digitados.(DO...WHILE)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		
		int numero = 0;
		int soma = 0;
		
		do {
			System.out.println("Digite um número: ");
			numero = ler.nextInt();
			
			 if (numero >=1)
			 {
				 soma= soma + numero;
			 }
			
		}while (numero !=0);
		
		System.out.printf("A soma dos números digitados: %d ",soma);
		ler.close();
	}

}
