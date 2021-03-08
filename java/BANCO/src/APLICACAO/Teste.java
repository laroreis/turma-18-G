package APLICACAO;

import java.util.Scanner;

import CLASSES.Conta;
import CLASSES.ContaEspecial;

public class Teste {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		 String movimento [] = new String [10];
		 int contador = 0 ;
		 char continua; // loop das movimentações
		//menu inicial da conta:
		
		//teste de usuario
		//dados da conta
		
	
		
		System.out.println(" 3 -> [ Conta Especial   ]  ");
		System.out.println();
		System.out.println("Vamos abrir a conta? ");
		
		System.out.println("Digite o número da conta: ");
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

	
		ContaEspecial contaTeste = new ContaEspecial (numero,cpf,ativa,1000.00);
		 
		
		
		
		//retorno
		
		contaTeste.movimento();
		
		
		
		do {
		
			double valor;
			char opcao;
			
			
			System.out.println("Digite o valor: ");
			valor = leia.nextDouble();
		
			System.out.println("[D-> DÉBITO] [C-> CRÉDITO] -> ");
			opcao = leia.next().toUpperCase().charAt(0);
		
				if (opcao == 'D') {
					contaTeste.debito(valor);
					System.out.printf("Débito: %.2f",valor);
					movimento[contador] = "Debito " + valor;
								
					
				} else if (opcao == 'C') {
					contaTeste.credito(valor);	
					System.out.printf("Crédito: %.2f",valor);
					movimento[contador] = "Crédito " + valor;
					
				}else {
					System.out.println("Opção Invalida");
					break;
				}contador++;
				
			System.out.println();
			System.out.println("Deseja continuar fazendo as transações? [S-> SIM] [N-> NÃO] ->");
			continua = leia.next().toUpperCase().charAt(0);
			
			
			 if(contador == movimento.length)
	    		{
	    			System.out.println("                    [!!!!!ATENÇÃO!!!!!]                    ");
	    			System.out.println("[Você utilizou todas as 10 transações disponiveis para sua conta]");
	    			break;
	    		}
			}while (continua == 'S' && contador<10);
		
		//fim
		
		/*for (String movimentos : movimento) {
			System.out.println("Os movimentos da conta especial: " + movimentos);
		}*/
		
		
		
		System.out.println("Saldo atual da conta: " + contaTeste.getSaldo());
		System.out.println("O valor do Limite atual: " + contaTeste.getLimite());
		
	}

}
