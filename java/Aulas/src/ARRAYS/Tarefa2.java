package ARRAYS;

import java.util.Random;
import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in); //instanciar
		int lancamentos[] = new int [10];
		double mediaAritmetica = 0.0;
		double  somaValores = 0.0;
		int maiorPontuacao = 0;
		int contadorMaiorPontuacao = 0;
		Random numeroDado = new Random(); // instanciar o objeto pela classe
		
		for (int x=0; x<lancamentos.length; x++) { //ler os valores do usuario
			System.out.printf("Digite o %d° resultado do lançamento :", (x+1));
			//lancamentos[x] = ler.nextInt(); // usuario no manual	
			//lancamentos[x] = (int) (Math.random()*6)+1; // o programa da o numero atravez da interface // clearcode
			lancamentos[x] = numeroDado.nextInt(6)+1; //instancia objeto.
		}
		for (int x=0; x<lancamentos.length; x++) {   //imprimir os valores
			System.out.printf("O valor do %d° lançamento é %d \n",(x+1), lancamentos[x]);
			somaValores = (somaValores + lancamentos[x]);  // soma para a média
			
			if (lancamentos[x] >= maiorPontuacao) {  //maior numero e quantas vezes
				
				if (lancamentos[x]> maiorPontuacao) { // zera o valor contado.
					contadorMaiorPontuacao = 0 ;
				}
				maiorPontuacao = lancamentos[x];
				contadorMaiorPontuacao ++;
				
			}
		}
		//processamentos
		mediaAritmetica = (somaValores / lancamentos.length);
		
		//saida
		System.out.printf("Total dos lançamentos digitados: %.0f \n", somaValores);
		System.out.printf("A média é %.2f \n", mediaAritmetica);
		System.out.printf("O maior valor é %d \n", maiorPontuacao);
		System.out.printf("O maior valor aparece %d vez(es) \n", contadorMaiorPontuacao);
	}

}
