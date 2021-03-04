package POLIMORFISMO;
//classe filha
public class PessoaFisica extends Pessoa1{
	//atributo
	private long cpf;
	
	//encap. vazio
	public PessoaFisica() {
		
	}

	//get
	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	//metodo
	public String getNome() {
		return "Pessoa Fisica" + super.getNome() + " - CPF: " + this.getCpf();
	}

}
