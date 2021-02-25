package LISTADOIS;

import java.util.Scanner;

public class ExemploSe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		int numeroMes;
		System.out.println("Digite o número do mês [1-12]: ");
		numeroMes = ler.nextInt();
		
		switch (numeroMes)
		{
			case 1:
			{
				System.out.println("Janeiro");
				break;
			}
			case 2:
			{
				System.out.println("Fevereiro");
				break;
			}
			case 3:
			{
				System.out.println("Março");
				break;
			}
			case 4:
			{
				System.out.println("Abril");
				break;
			}
			case 5:
			{
				System.out.println("Maio");
				break;
			}
			case 6:
			{
				System.out.println("Junho");
				break;
			}
			case 7:
			{
				System.out.println("Julho");
				break;
			}
			case 8:
			{
				System.out.println("Agosto");
				break;
			}
			case 9:
			{
				System.out.println("Setembro");
				break;
			}
			case 10:
			{
				System.out.println("Outubro");
			}
			case 11:
			{
				System.out.println("Novembro");
				break;
			}
			case 12:
			{
				System.out.println("Dezembro");
				break;
			}
			default:
			{
				System.out.println("Você não digitou o número correto!");
			}
		}

	}

}
