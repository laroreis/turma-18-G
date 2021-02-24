import java.util.Scanner;

public class ExercicioTres {
public static void main (String [] args) {
		
		Scanner ler = new Scanner(System.in);
		int duracao = 0;
		float horas = (float) 0.00;
		float minutos = (float) 0.00;
		float segundos= (float) 0.00;
		
		System.out.println("Digite o tempo de duração em segundos: ");
		duracao = ler.nextInt();
		
		horas = (duracao/3600);
		minutos = ((duracao % 3600)/60);
		segundos = ((duracao%3600)%60);
		
		System.out.println("Hora[s]: " + horas);
		System.out.println("Minuto[s]: " + minutos);
		System.out.println("Segundo[s]: " + segundos);
		
}

}
