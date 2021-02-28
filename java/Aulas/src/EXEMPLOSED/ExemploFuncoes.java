package EXEMPLOSED;

import java.util.Locale;
import java.util.Scanner;

public class ExemploFuncoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US); // instanciar teclado para americano
		Scanner ler = new Scanner(System.in); //instanciar
		
		int numero;
		String nome;
		char genero; // M - F - O
		String vocativo = "0";
		
		System.out.println("Digite o seu nome: ");
		nome = ler.next().toUpperCase();
		System.out.println("Você se define M-masculino. F-Feminino ou O-Outrx: ");
		genero = ler.next().toUpperCase().charAt(0);
		pula();
		
		System.out.println("Digite um numero inteiro positivo: ");
		numero = ler.nextInt();
		parImpar(numero);
		//System.out.printf("A raiz quadrada  do numero é %.2f", raiz());
		
		System.out.println("-------------------------------------");

	}
	
	public static String tipo (char genero) {
		String vocativo = "";
		if(genero == 'M')
		{
			vocativo = "Sr";
		}
		else if (genero == 'F')
		{
			vocativo = "Sra";
		}
		else if (genero == 'O')
		{
			vocativo = "Srx";
		}
		else {
			vocativo = "N/D";
		}
		return vocativo;
	}
	
	public static void pula () {
		System.out.println();
	}
	
	public static void parImpar(int numero) {
		
		if ((numero % 2) == 0)
		{
			System.out.printf("O numero %d é par!!",numero);
			pula();
		}
		else
		{
			System.out.printf("O número %d é impar!!", numero);
			pula();
		}
		
	}
	
	//public static void raiz ( double raiz) {
		//int numero = 0;
		//Math.sqrt(numero);
		//return raiz;
	//}

}
