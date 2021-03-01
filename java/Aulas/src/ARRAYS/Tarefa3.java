package ARRAYS;

import java.util.Random;

public class Tarefa3 {

	public static void main(String[] args) {
		
		
		Random numeros = new Random();
		int N1 [][] = new int [4][6];
		int N2 [][] = new int [4][6];
		int M1 [][] = new int [4][6];
		int M2 [][] = new int [4][6];
		final int LINHA = 4, COLUNA = 6;
		int l = 0, c= 0;
		
		for (l=0; l<LINHA; l++) {
			for ( c=0; c<COLUNA; c++) {
				N1[l][c]=numeros.nextInt(9)+1;
				N2[l][c] = numeros.nextInt(9)+1;
				M1[l][c] = N1[l][c] + N2[l][c];
				M2[l][c] = N1[l][c] - N2[l][c];
			}
		}
		
		System.out.println("Dados N1");
		for (l=0; l<LINHA; l++) {
			for ( c=0; c<COLUNA; c++) {
				System.out.print(N1[l][c] + "\t");
			}
			System.out.println();
		}
		System.out.println("Dados N2");
		for (l=0; l<LINHA; l++) {
			for ( c=0; c<COLUNA; c++) {
				System.out.print(N2[l][c] + "\t");
			}
			System.out.println();
		}
		System.out.println("Dados M1");
		for (l=0; l<LINHA; l++) {
			for ( c=0; c<COLUNA; c++) {
				System.out.print(M1[l][c] + "\t");
			}
			System.out.println();
		}
		System.out.println("Dados M2");
		for (l=0; l<LINHA; l++) {
			for ( c=0; c<COLUNA; c++) {
				System.out.print(M2[l][c] + "\t");
			}
			System.out.println();
		}
		
	}
		
}


