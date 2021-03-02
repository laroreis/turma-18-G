package LISTAPOO;

import java.util.Scanner;

public class ClienteTeste {
	public static void main (String [] args)
	{
		Cliente cliente1 = new Cliente();
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o nome de cliente: ");
		//ler.nextLine();
		cliente1.nome = ler.nextLine();
			
		System.out.println("O número do cartão da loja: ");
		cliente1.numeroCartao = ler.nextInt();
		
		System.out.println("O valor da compra foi: ");
		cliente1.compra = ler.nextDouble();
		
		cliente1.dadosCliente();
		ler.close();
		
	}

}
