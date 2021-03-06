package APLICACAO;

import java.util.Scanner;

import CLASSES.Conta;
import CLASSES.ContaEspecial;

public class Teste {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//menu inicial da conta:
		
		//teste de usuario
		//dados da conta
		
	
		
		System.out.println(" 3 -> [ Conta Especial   ]  ");
		System.out.println();
		System.out.println("Vamos abrir a conta? ");
		
		System.out.println("Digite o n�mero da conta: ");
		int numero = leia.nextInt();
		System.out.println("Digite o cpf da conta: ");
		String cpf = leia.next();
		System.out.println("Digite 1 - conta ativa ou 2 - conta inativa: ");
		char tipo = leia.next().charAt(0);
		boolean ativa;
			if(tipo == '1') {
				ativa = true;
			}else {
				ativa = false;
			}
			
		
		final double limite = 1000;
		ContaEspecial contaTeste = new ContaEspecial (numero,cpf,ativa,limite);
		 double movimento [] = new double [2];
		
		
		
		
		//retorno
		
		contaTeste.movimento();
		
		char continua; // loop das movimenta��es
		
		do {
			double valor;
			char opcao;
			
		
			System.out.println("Digite o valor: ");
			valor = leia.nextDouble();
			System.out.println("[D-> D�BITO] [C-> CR�DITO] -> ");
			opcao = leia.next().toUpperCase().charAt(0);
				
				if (opcao == 'D') {
					contaTeste.debito(valor);
				} else if (opcao == 'C') {
					contaTeste.credito(valor);
				}else {
					System.out.println("Op��o Invalida");
				}
			contaTeste.usarLimite(valor);
			System.out.println("Deseja continuar fazendo as transa��es? [S-> SIM] [N-> N�O] ->");
			continua = leia.next().toUpperCase().charAt(0);
			}while (continua == 'S');
		
		//fim
		System.out.println("Saldo atual da conta: " + contaTeste.getSaldo());
		System.out.println("O valor do Limite atual: " + contaTeste.getLimite());
	}

}
