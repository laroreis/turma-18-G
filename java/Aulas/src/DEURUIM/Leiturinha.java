package DEURUIM;

import java.io.File; //i- input - entrada - o - output - saida
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Leiturinha 
{

	public static void main(String[] args) 
	{

		File arquivo = new File("C:\\teste\\lista.txt");
		Scanner sc = null;  //criou scanner vazio
		try
		{
		sc = new Scanner(arquivo);  //instanciou o arquivo para ler ele
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
	
		}
	} catch (FileNotFoundException erro)
		{
			System.out.println("Arquivo não encontrado!!!");
	    }
		finally
		{
			if (sc != null) {
			sc.close();
			}
		}
		
		
		
		

	}

}
