import java.util.Scanner;

public class exercicioQuinto {
public static void main (String [] args) {
		
		Scanner ler = new Scanner(System.in);
		int notaUm = 0;
		int notaDois = 0;
		int notaTres = 0;
		double media = 0.0;
		
		System.out.println("Digite a primeira nota: ");
		notaUm = ler.nextInt();
		System.out.println("Digite a segunda nota: ");
		notaDois = ler.nextInt();
		System.out.println("Digite a terceira nota: ");
		notaTres = ler.nextInt();
		
		media = ((notaUm*0.2)+(notaDois*0.3)+(notaTres*0.5));
		System.out.println("A nota do aluno é: " + media);
				
	}

}
