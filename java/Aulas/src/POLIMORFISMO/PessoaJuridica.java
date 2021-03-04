package POLIMORFISMO;
// classe filha
public class PessoaJuridica extends Pessoa1 {
	//atributo
	private long cnpj;
	
	//encapsullamento vazio
	public PessoaJuridica() {
		
	}

	//get
	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	
	//metodo
	
	public String getNome() {
		return "Pessoa Jurídica" + super.getNome() + " - CNPJ: " + this.getCnpj();
	}
	

}
