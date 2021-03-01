package ARRAYS;

import java.util.Random;

public class LetrasMalucas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random letra = new Random ();
		String vogais [] = {"A", "E", "I", "O", "U"}; //letras
		int teste = 0;
		
		System.out.println("Randomizando as Vogais");
		
		for (int x=0; x<20; x++) {
			teste = letra.nextInt(5); //gambiarra
			System.out.println(vogais[teste]); //ele vê a posição inteiro
		}

	}

}
