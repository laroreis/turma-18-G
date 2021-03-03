package HERANCA;
//extends traz a herança
public class Funcionario extends Pessoa {
	//atributo especifico
	private String departamento;
	
	
	//construtor
	public Funcionario(String nome, int matricula, String departamento) {
		super(nome,matricula);
		this.departamento = departamento;
	}

	//get and set

	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
}
