package ARRAYS;

import java.util.Random;
import java.util.Scanner;

public class Tarefa4{ 
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        Random numero =  new Random();
        int matriz[][] =  new int[3][3];
        int soma=0, somadiagonal=0;

        for(int linha=0; linha<3; linha++)
        {
            for(int coluna=0; coluna<3; coluna++)
            {
                matriz[linha][coluna] = numero.nextInt(10)+1;
                soma+=matriz[linha][coluna];
                if(linha==coluna)
                {
                    somadiagonal += matriz[linha][coluna];
                }
            }
        }
   
        System.out.printf("Soma dos valores da matriz: %d", soma);
        System.out.printf("\nSoma dos valores da diagonal principal: %d", somadiagonal);
        ler.close();
    }
}


