package LISTADOIS;

import java.util.Scanner;
import java.lang.Math;

public class ExercicioQuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 0;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		numero = ler.nextInt();
		
		if (numero%2 == 0)
		{
			System.out.println("O n�mero " + numero + " � par!!");
			System.out.println("A raiz quadrada �:" + Math.sqrt(numero));
		}
		
		else 
		{
			System.out.printf("O n�mero %d � impar !!", numero);
			System.out.println("Ele elevado a quadrado � " + Math.pow(numero,2));
		}
		ler.close();

	}

}
