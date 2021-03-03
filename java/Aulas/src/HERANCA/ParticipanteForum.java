package HERANCA;

// para puxar a interface usa implements
public class ParticipanteForum implements Leitor, Programador {
	
	String pensamento; //atributo
	
	public String lendo()   //chama do leitor
	{
		return "Forum";
	}
	
	public void pensando (char[] ideias)  //chama programador
	{
		pensamento = new String (ideias);
	}
	public String digitando () {  //criado na classe
		return pensamento;
	}
	
	private String aprendendo()
	{
		return "JAVA";
	}

}
