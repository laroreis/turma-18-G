package DEURUIM;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteErros {

	public static void main(String[] args) {
		
		//estruturas.
		// se if - desvio condicional
		// for - while - do while- la�os de repeti��o
		// try - catch try(tente) catch(pegue)
		
		Scanner ler = new Scanner(System.in);
		int numero = 0;
		String nomes [] = { "Jo�o", "Maria", "Pedro"};
		
		try {
		System.out.println("Digite o numero da posi��o do vetor [0-2]");
		numero = ler.nextInt();
		
		System.out.println("O nome escolhido foi: " + nomes[numero]);
		}
		catch(InputMismatchException erro) {
			System.out.println("Voc� digitou uma letra ao inv�s de n�mero!!! ");
		}
		 
		catch(ArrayIndexOutOfBoundsException erro) {
			System.out.println("Voc� colocou um valor difierente de 0,1,2. !!! ");
		}
		finally {
			System.out.println("Isso vai sempre acontecer!");   //independente do que acontecer vai fechar o programa.
		}
		System.out.println("Fim de programa!!!");
		
		
		//erro de tipo diferente
		 //java.util.InputMismatchException
		
		//erro de tamanho de vetor
		// java.lang.ArrayIndexOutOfBoundsException
	}

}
