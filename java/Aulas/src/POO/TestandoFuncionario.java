package POO;

public class TestandoFuncionario {

	public static void main(String[] args)
	{
		// getters e setters
		Funcionario func = new Funcionario();
		func.setNome("Antonia"); //coloca valor
		func.setSalario(2500);
		
		//imprime
		System.out.println(func.getNome());
		System.out.println(func.getSalario());
	}

}
