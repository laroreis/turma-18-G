package ListaHeranca;

public class Cavalo extends Animal {
	
	private String som = "Relinchar";

	
	public Cavalo(String nome, int idade, String som) {
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
