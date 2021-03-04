package POLIMORFISMO;

public class TestePolimorfismo {

	public static void main(String[] args) {
		
		PessoaFisica fisica = new PessoaFisica(); //instanciou
			fisica.setNome("Juliana");
			fisica.setCpf(123456789L);
			
			PessoaJuridica juridica = new PessoaJuridica(); //instanciou
			juridica.setNome("Laro");
			juridica.setCnpj(1100023365548L);
			
			Pessoa1[] pessoas = new Pessoa1[2];  //criou vetor
			pessoas[0] = fisica;
			pessoas[1] = juridica;
			
			for (Pessoa1 pessoa:pessoas) //criou pessoa para mostrar os dados
			{
				System.out.println(pessoa.getNome());
			}
			
		

	}

}
