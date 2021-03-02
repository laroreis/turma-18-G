package LISTAPOO;

public class Funcionario {
	public String nome;
	public String profissao;
	public String setor;
	public double salario;
	public double valorCorrecao = 0.5;
	
	public Funcionario (String nome, String setor) {
		this.nome = nome;
		this.setor = setor;
	}
	
	public void dadosFinais(){
		System.out.println("O nome do funcionario: " + nome);
		System.out.println("Sua profissão: " + profissao);
		System.out.println("Esta no setor " + " da empresa");
		System.out.println("Recebe R$ " + salario + " por mês");
	}
	
	public void correcao() {
		this.salario = (this.salario * valorCorrecao) + this.salario;
		
	}
	

}
