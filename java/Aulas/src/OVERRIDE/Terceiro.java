package OVERRIDE;

public class Terceiro extends Funcionario{
	
	private double adicional;

	
	//construtor
	public Terceiro(String nome, int matricula, int horasTrabalhadas, double valorPorHora, double adicional)
	{
		super(nome, matricula, horasTrabalhadas, valorPorHora);
		this.adicional = adicional;
	}

	//encapsulamento
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	// metodo 
	@Override
	public double salario() {
		return (horasTrabalhadas * valorPorHora) + adicional;
	}
	
	@Override
	public double salario(double imposto) {
		return (horasTrabalhadas * valorPorHora) - ((horasTrabalhadas * valorPorHora) * imposto);
	}
	
	

}//fim
