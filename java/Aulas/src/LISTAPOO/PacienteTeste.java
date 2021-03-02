package LISTAPOO;

import java.util.Scanner;

public class PacienteTeste {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		Paciente p1 = new Paciente("Hospital Laro");
		
		p1.dadosIniciais();
		
		System.out.println("Digite o nome do Paciente: ");
		p1.nome = ler.nextLine();
		System.out.println("Digite o estado da doença do Paciente: ");
		p1.doenca = ler.nextLine();
		System.out.println("Qual quarto ele vai ficar? ");
		p1.quarto = ler.nextLine();
		
		p1.dadosFinais();
		
		System.out.println("Paciente Liberado: S/N");
		p1.estado = ler.nextLine();
		
		p1.liberado();
		ler.close();
	}

}
