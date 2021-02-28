package LISTA3REPETICAO;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;
		
		for(x=1000; x<=1999; x++)
		{
			
			if ((x%11)==5)
			{
				System.out.printf("\nO número dividido por 11 que resulta 5 é %.2f",x);
			}
			else
			{
				System.out.printf("");
			}
		}

	}

}
