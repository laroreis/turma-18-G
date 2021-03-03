package REVISÂOPOO;

import java.util.Scanner;

public class PessoaTeste {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome;
		int anoNascimento;
		char genero;
		
		System.out.println("Digite o nome do amigo: ");
		nome = ler.nextLine();
		Pessoa amigo = new Pessoa (nome); // objeto - prof

		System.out.println("Digite o ano de nascimento: ");
		anoNascimento = ler.nextInt();
		System.out.println("Digite o genero do cliente: M- Masculino F-Feminino O-Outros:");
		genero = ler.next().toUpperCase().charAt(0);
		Pessoa cliente = new Pessoa(nome, anoNascimento, genero);
		
		System.out.println("O nome do amigo é: "+ amigo.getNome());
		System.out.println("O nome do cliente é " + cliente.getNome() + " e seu ano de nascimento é:"+ cliente.getAnoNascimento());
		System.out.println("Do gênero: " + cliente.getGenero());
		
		
		if (cliente.idade(2050) >=18) {
			System.out.println("CLIENTE É ADULTO!");
			System.out.println("E a idade é " + cliente.idade(2050));
		}
		else {
			System.out.println("CLIENTE É MENOR");
			System.out.println("E a idade é " + cliente.idade(2050));
		}
		ler.close();
	}

}
