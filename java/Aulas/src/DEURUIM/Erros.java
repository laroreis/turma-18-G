package DEURUIM;

public class Erros {

	public static void main(String[] args) {
		// Exemplo da plataforma
		
		String frase = null;
		String novaFrase = null;
		
		try
		{
			novaFrase = frase.toUpperCase();
		}
		catch(NullPointerException e)
		{
			System.out.println("A frase inicial é nula, para solucionar tal problema foi lhe atribuibo um valor default.");
			frase = "Frase vazia";
			novaFrase = frase.toUpperCase();
		}
		
		System.out.println("Frase Antiga: " + frase);
		System.out.println("Frase Nova:" + novaFrase);
		
		
	}

}
