import java.util.Scanner;

public class ExercicioOito {
public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in); 
		double custoDeFabrica = 0.00;
		double custoAoConsumidor = 0.00;
		double custoTotal = 0.00;
		double porcentagem = 0.00;
		
		System.out.println("Digite o custo de fabrica: ");
		custoDeFabrica = ler.nextDouble();
		
		porcentagem = (custoDeFabrica*0.28) + (custoDeFabrica*0.45);
		custoAoConsumidor = custoDeFabrica + porcentagem;
		
		System.out.println("O custo do consumidor é "+ custoAoConsumidor+ " reais.");
}

}
