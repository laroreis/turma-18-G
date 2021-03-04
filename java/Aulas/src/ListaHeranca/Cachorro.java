package ListaHeranca;

public class Cachorro extends Animal {
	
	private String som = "latido";
	//atributos igual animal
	
	//contrutor igual animal
	public Cachorro(String nome, int idade, String som) {
		super(nome, idade);
		this.som = som;
	}
	
	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	@Override
	public void som() {
		System.out.println("Estou emitindo som " + this.getSom());
	}
	
	

}
