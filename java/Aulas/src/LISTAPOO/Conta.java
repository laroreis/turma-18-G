package LISTAPOO;

public class Conta {
	// atributo
	public String cpf;
	public String tipo;  //corrente, poupança, empresa
	public String nome;
	public int numero;
	
	
	
	//construtor
	public Conta(String cpf, int numero) {
		super();
		this.cpf = cpf;
		this.numero = numero;
	}
	
	//metodo
	public void banco() {
		System.out.println("Seja bem vinde ao banco Laro, o que posso fazer por você hoje?");
		System.out.println("Vamos abrir uma conta?");
		
	}
	
	//saida
	public void dadosFinais() {
		System.out.println("Olá " + nome + " Seja bem vinde!");
		System.out.println("Sua conta é  " + tipo + " com o número " + numero);
		System.out.println("Você precisa fazer o seu primeiro deposito para validar a conta.");
		
	}

}
