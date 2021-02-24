import java.util.Scanner;

public class exercicioDois {
	public static void main (String [] args) {
		
		Scanner ler = new Scanner(System.in);
		int anos, meses, dias, idade;
		
		System.out.println("Digite sua idade em dias: ");
		idade = ler.nextInt();
		
		anos = (idade/365);
		meses = ((idade%365)/30);
		dias = ((idade%365)%1);
		
		System.out.println("Ano[s]: " + anos);
		System.out.println("Mes[es]: " + meses);
		System.out.println("Dia[s]: " + dias);
		
	}

}
