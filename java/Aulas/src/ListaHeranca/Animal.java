package ListaHeranca;

public class Animal {
	//atri.
	private String nome;
	private int idade;
	private String som;
	
	//const.
	
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
		}
	
	//get e set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	//met.
	public void som() {
		System.out.println("Estou emitindo som " + som);
	}
	
	public String correr() {
		return "Estou correndo";
		
	}

}//fim
