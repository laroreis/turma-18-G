import java.util.Scanner;
import java.lang.Math;

public class exercicioQuatro {
public static void main (String [] args) {
		
		Scanner ler = new Scanner(System.in);
		double a,b,c;
		double r,d,s;
		
		System.out.println("Digite o valor de A: ");
		a = ler.nextInt();
		System.out.println("Digite o valor de B: ");
		b = ler.nextInt();
		System.out.println("Digite o valor de C: ");
		c = ler.nextInt();
		
		r = Math.pow((a+b), 2);
		s = Math.pow((b+c), 2);
		d = ((r+s)/2);
		
		System.out.println("O resultado da distancia é: " + d);
		
		
}

}
