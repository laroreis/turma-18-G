import java.util.Scanner;
import java.lang.Math;

public class ExercicioSeis {
public static void main (String [] args) {
		
		Scanner ler = new Scanner(System.in);
		double d = 0.00;
		double xUm = 0.00;
		double xDois = 0.00;
		double yUm = 0.00;
		double yDois = 0.00;
		double pUm = 0.00;
		double pDois = 0.00;
		
		System.out.println("Digite o valor de X1: ");
		xUm = ler.nextInt();
		System.out.println("Digite o valor de X2: ");
		xDois = ler.nextInt();
		System.out.println("Digite o valor de Y1: ");
		yUm = ler.nextInt();
		System.out.println("Digite o valor de y2: ");
		yDois = ler.nextInt();
		
		pUm = (xDois - xUm);
		pDois = (yDois - yUm);
		pUm = Math.pow(pUm, 2);
		pDois = Math.pow(pDois, 2);
		d = Math.sqrt(pUm+pDois);
		System.out.println("O resultado da distância é: " + d);
		
		
		
	}

}
