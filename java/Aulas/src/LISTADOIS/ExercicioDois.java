package LISTADOIS;

import java.util.Scanner;


public class ExercicioDois {
	public static void main (String [] args)
	{
		Scanner ler = new Scanner (System.in);
		int numeroUm = 0;
		int numeroDois = 0;
		int numeroTres = 0;
		
		System.out.println("Digite o primeiro número: ");
		numeroUm = ler.nextInt();
		System.out.println("Digite o segundo número: ");
		numeroDois = ler.nextInt();
		System.out.println("Digite o terceiro número: ");
		numeroTres = ler.nextInt();
		
		if (numeroUm > numeroDois && numeroDois> numeroTres)
		{
			System.out.printf("%d --- %d --- %d",numeroUm, numeroDois,numeroTres);
		}
		else if (numeroDois > numeroUm && numeroUm> numeroTres)
		{
			System.out.printf("%d --- %d --- %d",numeroDois, numeroUm,numeroTres);
		}
		else if (numeroTres > numeroDois && numeroDois > numeroUm)
		{
			System.out.printf("%d --- %d --- %d",numeroTres, numeroDois,numeroUm);
		}
		else if (numeroUm>numeroTres && numeroTres>numeroDois)
		{
			System.out.printf("\n%d --- %d --- %d",numeroUm, numeroTres,numeroDois);
		}
		else if (numeroDois > numeroTres && numeroTres> numeroUm)
		{
			System.out.printf("\n%d --- %d --- %d",numeroDois, numeroTres,numeroUm);
		}
		else
		{
		System.out.printf(" Numeros iguais %d - %d - %d\n",numeroUm, numeroDois,numeroTres);
		}
	}

}
