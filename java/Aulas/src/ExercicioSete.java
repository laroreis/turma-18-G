import java.util.Scanner;
import java.lang.Math;

public class ExercicioSete {
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in); 
		double a,b,c,d,e,f,x,y;
		
		System.out.println("Digite o valor de a: ");
		a = ler.nextDouble();
		System.out.println("Digite o valor de b: ");
		b =ler.nextDouble();
		System.out.println("Digite o valor de c: ");
		c =ler.nextDouble();
		System.out.println("Digite o valor de d: ");
		d =ler.nextDouble();
		System.out.println("Digite o valor de e: ");
		e =ler.nextDouble();
		System.out.println("Digite o valor de f: ");
		f =ler.nextDouble();
		
		x = (((c*e)-(b*f)) / ((a*e)-(b*d)));
		y = (((a*f)-(c*d)) / ((a*e)-(b*d)));
		
		System.out.println("Valor de x: "+ Math.round(x) );
		System.out.println("Valor de y: "+ Math.round(y) );

		
	}

}
