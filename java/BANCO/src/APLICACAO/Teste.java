package APLICACAO;

import java.util.Scanner;

import CLASSES.Conta;

public class Teste {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Conta conta1 = new Conta(1, "111.111.111-11");
		double valor;
		char opcao;
		
		System.out.println("Digite o valor: ");
		valor = ler.nextDouble();
		System.out.println("Debito ou crédito? D/C: ");
		opcao = ler.next().toUpperCase().charAt(0);
		
		if (opcao == 'D') {
			conta1.debito(valor);
		} else if (opcao == 'C') {
			conta1.credito(valor);
		}else {
			System.out.println("Opção Invalida");
		}
	}

}
