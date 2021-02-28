package PLATAFORMAGENE;

import java.util.Scanner;

public class Repeticao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		
		int idade;
		
		System.out.println("Digite a sua idade: ");
		idade = ler.nextInt();
		
		while(idade>=1)
		{
			System.out.printf("\nSua idade: %d", idade);
			if (idade>=18) {
				System.out.printf("\nVocê é de maior ...");
			}
			else
			{
				System.out.printf("\nVocê é de menor! ");
			}
			
			System.out.println("\nDigite a sua idade! ");
			idade = ler.nextInt();
		}
		 System.out.println("Fim de programa!");
		 ler.close();
	}

}
