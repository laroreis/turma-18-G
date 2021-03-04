package COLLECTION;

public class Alunos {
	//atributo
	private String nome;
	private String curso;
	double nota;
	
	//const.
	public Alunos(String nome, String curso, double nota) {
		super();
		this.nome = nome;
		this.curso = curso;
		this.nota = nota;
	}
	
	//get and set
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCurso() {
		return curso;
	}



	public void setCurso(String curso) {
		this.curso = curso;
	}



	public double getNota() {
		return nota;
	}



	public void setNota(double nota) {
		this.nota = nota;
	}


//met.
	public String toString() {
		return this.nome;
	}
	

}
