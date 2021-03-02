package LISTAPOO;

public class Paciente {
	public String nome;
	public String hospital;
	public String doenca;
	public String quarto;
	public String estado; //recebeu alta 
	
	//contrudor
	public Paciente(String hospital) {
		super();
		this.hospital = hospital;
	}
	
	//metodo
	
	public void dadosIniciais() {
		System.out.println("Seja bem vindo ao hospital " + hospital);
		System.out.println("Espero que seu problema seja resolvido !");
		System.out.println("Vamos colocar alguns dados iniciais.");
		
	}
	
	public void dadosFinais()
	{
		System.out.println("O paciente do nome: " + nome + " Hospedado no quarto " + quarto);
		System.out.println("Com a doença " + doenca);
		System.out.println("Foi liberado? ");
	}
	
	public void liberado() {
		 if (estado != "S") 
		 {
			 System.out.println("Rcebeu alta, está liberado");
		 } else if (estado != "N") {
			 System.out.println("Não recebeu alta, precisa permanecer no hospital!");
		 }
		 else {
			 System.out.println("Dado inválido!");
		 }
	}
}
