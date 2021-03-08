package CLASSES;

public class Conta {
	//atributos segurança total
	protected int numero;
	protected String cpf;
	protected double saldo;
	protected boolean ativa;
	
	//contrutor mesmo nome da classe
	public Conta(int numero, String cpf) {
		this.numero = numero;
		this.cpf = cpf;
	}
	//sobrecarga
	public Conta (int numero) {
		this.numero = numero;
	}
	//sobrecarga contrusdor
	public Conta(int numero, String cpf, boolean ativa) {
		this.numero = numero;
		this.cpf = cpf;
		this.ativa = ativa;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}


	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
	//Metodos
	// credito soma
	public void credito(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	// debito subtrai
	public void debito (double valor)  // só vai ter debito se tiver saldo
	{
		if (this.saldo>= valor) {
			this.saldo = this.saldo - valor;
		}
		
	}
	
	//public void setSaldo (double saldo) {
	//this.saldo = saldo;
	//}
	
}
