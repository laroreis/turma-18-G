package POO;

public class Pessoa {
	// Atributos
	private String primeiroNome;  //Só a classe pessoa mexe
	private String ultimoNome;
	private String nomesDoMeio;
	
	
	public Pessoa (String primeiro, String meio, String ultimo) //construdor com o mesmo nome da classe
	{
		primeiroNome = primeiro;
		ultimoNome = ultimo;
		nomesDoMeio = meio;
	}
	
	public String getNomeCompleto()  //método para juntar nomes e retornar o nome completo.
	{
		String nomeCompleto = primeiroNome + " " + nomesDoMeio + " " + ultimoNome;
		return nomeCompleto;
	}
	

}
