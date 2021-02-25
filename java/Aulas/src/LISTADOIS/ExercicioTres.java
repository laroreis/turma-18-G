package LISTADOIS;

import java.util.Scanner;

public class ExercicioTres {
	public static void main (String [] args)
	{
		Scanner ler = new Scanner(System.in);
		int idade = 0;
		
		System.out.printf("\nDigite a sua idade: ");
		idade = ler.nextInt();
		
		if (idade == 10 && idade <=14)
		{
			System.out.println("Seu grupo é o Infantil de 10 a 14 anos!");
		}
		else if (idade == 15 && idade<=17 ) 
		{
			System.out.println("Seu grupo é o Juvenil de 15 a 17 anos!");
		}
		else if (idade == 18 && idade <=25 )
		{
			System.out.println("Seu grupo é o adulto de 18 a 25 anos!");
		}
		else
		{
			System.out.println("Sua idade não atende o programa!");
		}
		
		System.out.println("Obrigada pela preferência!!!");
	}

}
