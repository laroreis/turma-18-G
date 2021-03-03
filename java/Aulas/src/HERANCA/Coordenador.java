package HERANCA;

public class Coordenador extends Pessoa {
	
	//atributo especifico
	private String cursoCoordenado;

	//costrutor
	public Coordenador(String nome, int matricula, String cursoCoordenado) {
		super(nome, matricula);
		this.cursoCoordenado = cursoCoordenado;
	}
	
	//get and set

	public String getCursoCoordenado() {
		return cursoCoordenado;
	}

	public void setCursoCoordenado(String cursoCoordenado) {
		this.cursoCoordenado = cursoCoordenado;
	}
	
	

}
