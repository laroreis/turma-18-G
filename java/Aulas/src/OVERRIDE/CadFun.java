package OVERRIDE;

import java.util.List;
import java.util.Locale;
import java.util.ArrayList;
import java.util.Scanner;

public class CadFun {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner (System.in);
		
		List <Funcionario> lista = new ArrayList <> ();
		
		System.out.println("Digite a quantidade de funcionarios na lista: ");
		int quantidade = ler.nextInt();
		
		for (int x=1; x<=quantidade; x++)
		{
			System.out.println("Funcionario " + x);
			System.out.println("1- Funcinario ou 2 -terceiro? ");
			char tipo = ler.next().charAt(0);
			System.out.println("Nome: ");
			String nome = ler.next();
			System.out.println("Matricula: ");
			int matricula = ler.nextInt();
			System.out.println("Horas Trabalhadas: ");
			int horasTrabalhadas = ler.nextInt();
			System.out.println("Valor por Hora: ");
			double valorPorHora = ler.nextDouble();
			
			
			
			if (tipo == '2') {
				System.out.println("Valor do adicional R$: ");
				double adicional = ler.nextDouble();
				lista.add(new Terceiro(nome,matricula,horasTrabalhadas,valorPorHora,adicional));
			}
			else {
				lista.add(new Funcionario(nome,matricula,horasTrabalhadas,valorPorHora));
			}
			
		}
		System.out.println();
		System.out.println("Pagamento de salarios: ");
		
		for (Funcionario fun : lista) {
			System.out.println(fun.getNome() + " seu salário é R$ " + fun.salario());
		}
		System.out.println("Fim de programa!!");
		
		/*Funcionario colaborador1 = new Funcionario("Carlos",1,10,15.25);
		Terceiro colaborador2 = new Terceiro ("Joana",45,10,15.25,50);
		
		System.out.println("Salário do " + colaborador1.getNome() + "é R$ " + colaborador1.salario());
		System.out.println("Salário do " + colaborador2.getNome() + "é R$ " + colaborador2.salario());*/

	}

}
