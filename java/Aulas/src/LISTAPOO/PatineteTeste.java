package LISTAPOO;

import java.util.Scanner;

public class PatineteTeste {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Patinete pat1 = new Patinete ();
		
		System.out.println("Comece sua compra.");
		System.out.println("Qual cor do patinete?");
		pat1.cor = ler.nextLine();
		System.out.println("Qual o tamanho: infantil/ juvenil/ adulto");
		pat1.tamanho = ler.nextLine();
		System.out.println("Quantas rodas: 3/2 ");
		pat1.tipo = ler.nextLine();
		System.out.println("Vai ser eletrico? S/N");
		pat1.eletrico = ler.next().toUpperCase().charAt(0);
		
		pat1.dados();
		ler.close();

	}

}
