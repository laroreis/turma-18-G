package LISTAPOO;

import java.util.Scanner;

public class FuncionarioTeste {
	public static void main (String [] args) {
		
		Scanner ler = new Scanner(System.in);
		Funcionario fun1 = new Funcionario ("Beatriz","RH"); 
		
		System.out.println("Qual a profiss�o de " + fun1.nome + " ?");
		fun1.profissao = ler.nextLine();
		System.out.println("Qual o salario de " + fun1.nome + " ?");
		fun1.salario = ler.nextDouble();
		
		System.out.println("Nesse m�s teve a corre��o m�nino!");
		fun1.correcao();
		
		fun1.dadosFinais();
		ler.close();
	}

}
