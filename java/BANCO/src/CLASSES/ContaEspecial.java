package CLASSES;

public class ContaEspecial extends Conta {
	
	//*Usar o limite do saldo se no momento do movimento o saldo fica negativo, ajusta 
	//no saldo e diminuir no limite.
	
	//atributo
	private double limite;  //s� pode ser usado depois do saldo
 
	 //construtor

	public ContaEspecial(int numero, double limite) {
		super(numero);
		this.limite = limite;
	}
	
//construtor - sobrecarga
	
	public ContaEspecial(int numero, String cpf, double limite) {
		super(numero, cpf);
		this.limite = limite;
	}
	
	//Construtor sobrecarga
	public ContaEspecial(int numero, String cpf, boolean ativa, double limite) {
		super(numero, cpf, ativa);
		this.limite = limite;
	}
	
	//encapsulamento 
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void movimento() {
		int movimentacao;
		System.out.println("Vamos come�ar a movimenta��o da Conta Especial!");
		System.out.println("Voc� tem direito a 10 movimenta��es sendo interrompido quando zera o limite da sua conta!");
		System.out.println("Seu saldo est� zerado.");
		System.out.println("Voc� pode: 1. depositar 2. sacar do seu limite " + limite);
	}
	
	//override
	@Override
	public void debito (double valor)  // s� vai ter debito se tiver saldo
	{
		if (this.saldo < valor) {
			if (valor <= limite) {
				System.out.println("Voc� est� usando o limite da conta");
				limite = limite - valor;
			}
			else {
				System.out.println("voc� n�o pode realizar essa tranfer�ncia, limite estourado! ");
		
			}
		}
		
		
		if (this.saldo>= valor) {
			this.saldo = this.saldo - valor;
		}
		
	}
	
	

		 
}
