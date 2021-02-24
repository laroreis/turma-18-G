
import java.util.Scanner;

public class exercicioUm {
	
	public static void main (String [] args)
	{
		Scanner ler = new Scanner(System.in);
		int anos, meses, dias, total;
		
		System.out.println("Digite sua idade em anos: ");
		anos = ler.nextInt();
		System.out.println("Digite sua idade em meses: ");
		meses = ler.nextInt();
		System.out.println("Digite sua idade em dias: ");
		dias = ler.nextInt();
		
		total= ((anos*365) + (meses*30) + dias);
		System.out.println("Sua idade em dias é : " + total + " dias vividos");
		
		
		
		
	}

}


