import java.util.Scanner;

public class EntradaeSaida {
	public static void main (String [] args) 
	{
		Scanner ler = new Scanner(System.in);
		int a,b,soma;
		
		System.out.println("Entre com o valor de A: ");
		a = ler.nextInt();
		System.out.println("Entre com o valor de B: ");
		b = ler.nextInt();
		soma = a+b;
		System.out.println("A soma foi de: " + soma);
		
	}

}
