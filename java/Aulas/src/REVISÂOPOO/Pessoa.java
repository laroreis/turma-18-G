package REVISÂOPOO;

public class Pessoa {
	//classe : pessoa [terreno]
	//atributos: segurança [material de contrução]
	//construtores: como a classe abre - criar
	// sobrecarga de construtor [segundo construtor]
	// encapsulamento - getters and setters - segurança [vigia]
	// metodo [vai fazer talvez] [casa ou terreno com acabamento]
		//sobrecarga de métodos
	//herança - a todo momento
	
	//*acabamento*
	//override
	//polimorfismo
	// collections
	//interface
	
	//atributo
	private String nome;
	private int anoNascimento;
	private boolean vivo;
	private char genero;
	
	//construtor
	public Pessoa(String nome) {
		super(); //classe 0
		this.nome = nome;
	}
	
	//sobrecarga
	public Pessoa(String nome, int anoNascimento, char genero) {
		super();
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.genero = genero;
	}

	//encapsulamento
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	// metodo
	
	public int idade() {
		return (2021 - anoNascimento);
	}
	
	// sobrecarga metodo
	public int idade(int anoAtual)
	{
		//Criar variavel auxiliar.
		//if (anoNascimento <= anoAtual) {
		//	System.out.println("Ano inserido foi incorreto!");
		//}
		return (anoAtual - anoNascimento);
	}
	

}
