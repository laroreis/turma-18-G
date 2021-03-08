package LISTA3REPETICAO;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade;
		int sexo = 0 ;
		int temperamento = 0;
		int pessoas = 1;
		int contador = 0;
		int contador2 = 0;
		int contador3 = 0;
		int contador4 = 0;
		int contador5= 0;
		int contador6= 0;
		
		
		while(pessoas<=2) {
			
		System.out.println("Qual a sua idade?: ");
		idade = leia.nextInt();
		
		System.out.println("Qual o seu sexo? 1-Feminino / 2-Masculino / 3-Outros: ");
		sexo = leia.nextInt();
		System.out.printf("Você se considera um(a): %S",sexo(sexo));
		
		System.out.println("Você se considera uma pessoa:? 1-Calma / 2-Nervosa / 3-Agressiva: ");
		temperamento = leia.nextInt();
		System.out.printf("Você se considera uma pessoa: %S",temperamento(temperamento));
		
		
		if(temperamento == 1) {
			contador++;
		}
		 if (sexo == 1 && temperamento == 2) {
			contador2++;
		}
		 if(sexo == 2 && temperamento == 3) {
			contador3++;
		}
		 if(sexo == 3 && temperamento == 1) {
			contador4++;
		}
		 if(idade>40 && temperamento == 2) {
			contador5++;
		}
		 if(idade<18 && temperamento == 1) {
			contador6++;
		}
		pessoas = pessoas +1;
		}
		System.out.printf("O número de pessoas calmas são: %d\n",contador);
		System.out.printf("O número de mulheres nervosas são: %d\n",contador2);
		System.out.printf("O número de homens agressivos são: %d\n",contador3);
		System.out.printf("O número de outros calmos são: %d\n",contador4);
		System.out.printf("O número de pessoas nervosas acima de 40 anos são: %d\n",contador5);
		System.out.printf("O número de pessoas calmas com menos de 18 são: %d\n",contador6);
		
	}
	public static String sexo(int sexo) {
		String genero = "";
		if(sexo==1) {
			genero = ("Sra.\n");
		}
		
		else if (sexo==2) {
			genero = ("Sr.\n");

		}
		
		else if (sexo==3) {
			genero = ("Srx.\n");

		}
		
		else {
			genero = ("N/A, Digite um sexo válido 1-Feminino / 2-Masculino / 3-Outros: \n");
		}

		
		return genero;
		
	}
	public static String temperamento(int temperamento) {
		String mental = "";
		if(temperamento==1) {
			mental = ("Calma\n");
		}
		
		else if(temperamento==2) {
			mental = ("Nervosa\n");

		}
		
		else if(temperamento==3) {
			mental = ("Agressiva\n");

		}
		else {
			mental = ("N/A, Digite um temperamento válido 1-Calma / 2-Nervosa / 3-Agressiva: \n");
		}
		
		
		return mental;
		
	}
}