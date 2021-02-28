package LISTA3REPETICAO;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int numero = 0;
		int soma = 0;
		int quantidade = 0;
		double media = 0;
		
		do
		{
		System.out.println("Digite um número");
		numero = ler.nextInt();
		
		if((numero %3) == 0 && numero != 0)
		{
			soma = (soma + numero);
			quantidade = numero++;
			media =(soma/quantidade);
			
		}
		
		}while (numero != 0);
		
		System.out.printf("A média dos números multiplos de 3: %.2f", media);
		ler.close();
	}

}
