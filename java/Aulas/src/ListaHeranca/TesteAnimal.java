package ListaHeranca;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {
		
		//Scanner ler = new Scanner (System.in);
		
		Cachorro dog = new Cachorro("Lola",3,"auau");
		Cavalo cav = new Cavalo ("Ventania",6,"ruge");
		Preguica preg = new Preguica ("Luli",10,"ai");
		
		Animal [] animais = new Animal[3];
		animais[0] = dog;
		animais[1] = cav;
		animais[2] = preg;
		
		for(Animal animal : animais ) {
			System.out.println(animal.getSom());
		}
		
		//System.out.println(dog.getNome() + ", O cachorro faz " + dog.getSom());

	}

}
