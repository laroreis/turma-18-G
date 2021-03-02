package POO;

import java.util.Scanner;

public class DesafiodoTriangulo {
 //código procedual
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		
		int base1 = 0;
		int base2 = 0;
		int base3 = 0;
		int altura1 = 0;
		int altura2 = 0;
		int altura3 = 0;
		int area1 = 0;
		int area2 = 0;
		int area3 =0;
		int maior = 0;
		
		System.out.println("Digite a base do triangulo 1: ");
		base1 = ler.nextInt();
		System.out.println("Digite a altura do triangulo 1:");
		altura1 = ler.nextInt();
		
		area1 = ((base1 * altura1)/2);
		maior = area1;
		
		System.out.println("Digite a base do triangulo 2: ");
		base2 = ler.nextInt();
		System.out.println("Digite a altura do triangulo 2:");
		altura2 = ler.nextInt();
		area2 = ((base2 * altura2) / 2);
		
		if  (area2 > maior ) {
			maior = area2;
		}
			
		System.out.println("Digite a base do triangulo 3: ");
		base3 = ler.nextInt();
		System.out.println("Digite a altura do triangulo 3:");
		altura3 = ler.nextInt();
		
		area3 = ((base3 * altura3) /2);
		
		if (area3 > maior) {
			maior = area3;
		}
		
		System.out.printf("\n A área do primeiro triangulo é: %d ", area1);
		System.out.printf("\n A área do segundo triangulo é:  %d", area2);
		System.out.printf("\n A área do terceiro triangulo é: %d", area3);
		System.out.printf("\n A maior area é %d",maior);
		ler.close();

	}

}
