package POO;

import java.util.Scanner;

public class TrianguloPOO {
// orientado a objeto
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangulo T1 = new Triangulo(); 	//objeto
		Triangulo T2 = new Triangulo();
		Scanner ler = new Scanner (System.in);
		
		
		System.out.println("Primeiro triângulo");
		System.out.println("Digite a base: ");
		T1.base = ler.nextDouble();
		System.out.println("Digite a altura: ");
		T1.altura = ler.nextDouble();
	
		T1.areaTriangulo();
		
		System.out.println("Segundo triângulo");
		System.out.println("Digite a base: ");
		T2.base = ler.nextDouble();
		System.out.println("Digite a altura: ");
		T2.altura = ler.nextDouble();
		
		T2.areaTriangulo();
		
		ler.close();
	}

}
