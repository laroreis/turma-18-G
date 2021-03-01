package ARRAYS;

import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		String agenda [][] = new String [24][31];
		int dia = 0;
		int hora = 0;
		int opcao = 0;
		int atividade = 0;
		
		do {
			System.out.println("Minha Agenda");
			
			System.out.println("Digite o dia de [1-31]");
			dia = ler.nextInt();
			dia = (dia-1);
			
			System.out.println("Digite a hora da atividade [0-23]: ");
			hora = ler.nextInt();
			
			ler.nextLine();
			System.out.println("Escreva sua atividade: ");
			agenda[hora][dia] = ler.nextLine();
			
			System.out.println("Deseja continuar? [2] Sim / [1] Não");
			opcao = ler.nextInt();
			
		} while (opcao != 1);
		
		for (int i=0; i<24; i++) {
			for (int j=0; j<31; ++j) {
				if (agenda[i][j] != null) {
					System.out.printf("Minhas anotações %d as %d horas: %s \n", (i+1), (j+1), agenda[i][j]);
					atividade++;
				}
			}
		}
		System.out.printf("\nVocê tem %d de atividades nesse mês", atividade);
	}

}
