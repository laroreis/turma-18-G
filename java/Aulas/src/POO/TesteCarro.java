package POO;

public class TesteCarro {
	public static void main (String [] args)
	{
		Carro meuCarro = new Carro();  //instanciou
		
		meuCarro.cor = "vermelho"; 		//iniciou o atributo
		meuCarro.modelo = "Passat";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;
		
		meuCarro.liga(); 		//chamou o liga
		
		meuCarro.acelera(20);
		System.out.println(meuCarro.velocidadeAtual);  //modificou a valocidade
		meuCarro.pegaMarcha();
	}

}
