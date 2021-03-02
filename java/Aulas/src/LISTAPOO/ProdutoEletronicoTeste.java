package LISTAPOO;

import java.util.Scanner;

public class ProdutoEletronicoTeste {

	public static void main(String[] args) {
		
		ProdutoEletronico pe = new ProdutoEletronico();
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o nome do produto eletronico: ");
		pe.nome = ler.nextLine();
		System.out.println("Digite a marca do produto: ");
		pe.marca = ler.nextLine();
		System.out.println("Digite a função do produto: ");
		pe.funcao = ler.nextLine();
		System.out.println("Digite o preço do produto: ");
		pe.preco = ler.nextDouble();
		
		pe.dados();
		ler.close();
	}

}
