package LISTAPOO;

public class Conta {
	// atributo
	public String cpf;
	public String tipo;  //corrente, poupan�a, empresa
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
		System.out.println("Seja bem vinde ao banco Laro, o que posso fazer por voc� hoje?");
		System.out.println("Vamos abrir uma conta?");
		
	}
	
	//saida
	public void dadosFinais() {
		System.out.println("Ol� " + nome + " Seja bem vinde!");
		System.out.println("Sua conta �  " + tipo + " com o n�mero " + numero);
		System.out.println("Voc� precisa fazer o seu primeiro deposito para validar a conta.");
		
	}

}
