package APLICACAO;

import java.util.Scanner;

import CLASSES.Conta;
import CLASSES.ContaEspecial;

public class Teste {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		//teste de usuario
		//dados da conta
		System.out.println("Vamos abrir a conta Especial!");
		System.out.println("Digite o numero da conta: ");
		int numero = ler.nextInt();
		System.out.println("Digite o cpf da conta: ");
		String cpf = ler.next();
		System.out.println("Digite 1 - conta ativa ou 2 - conta inativa: ");
		char tipo = ler.next().charAt(0);
		boolean ativa;
		if(tipo == '1') {
			ativa = true;
		}else {
			ativa = false;
		}
		System.out.println("Digite o limite da conta: ");
		double limite = ler.nextDouble();
		ContaEspecial contaTeste = new ContaEspecial (numero,cpf,ativa,limite);
		
		
		//
		//Conta conta1 = new Conta(1, "111.111.111-11"); //teste programador
		//ContaEspecial cliEspecial1 = new ContaEspecial (555,1000);
		
		
		//retorno
		
		contaTeste.movimento();
		
		char continua = '0'; // loop das movimentações
		
		do {
			double valor;
			char opcao;
			
		
			System.out.println("Digite o valor: ");
			valor = ler.nextDouble();
			System.out.println("Debito ou crédito? D/C: ");
			opcao = ler.next().toUpperCase().charAt(0);
				
				if (opcao == 'D') {
					contaTeste.debito(valor);
				} else if (opcao == 'C') {
					contaTeste.credito(valor);
				}else {
					System.out.println("Opção Invalida");
				}
			
			System.out.println("Deseja continuar as movimentações? 1 - Sim / 2 - Não.");
			continua = ler.next().charAt(0);
			}while (continua == 2);
		
		//fim
		System.out.println("Saldo atual da conta:" + contaTeste.getSaldo());
		System.out.println("O valor do Limite atual: " + contaTeste.getLimite());
	}

}
