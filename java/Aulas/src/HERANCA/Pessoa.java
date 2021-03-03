package HERANCA;

public class Pessoa {
	//atributo
	private String nome;
	private int matricula;
	
	//construtor
	public Pessoa(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
//get and set
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	

}
