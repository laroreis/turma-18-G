package LISTAPOO;

import java.util.Scanner;

public class ContaTeste {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		Conta conta1 = new Conta ("111.111.111-11", 231);
	
		conta1.banco();
		
		System.out.println("Come�amos com o seu nome: ");
		conta1.nome = ler.nextLine();
		System.out.println("Seu cpf � " + conta1.cpf );
		System.out.println();
		System.out.println("Qual tipo de conta voc� prefere: ");
		conta1.tipo = ler.nextLine();
		System.out.println("Seu n�mero de conta gerado foi esse " + conta1.numero + " N�o esque�a de anotar");
		System.out.println();
		
		conta1.dadosFinais();
		ler.close();
		
		
	}

}
