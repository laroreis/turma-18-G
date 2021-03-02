package POO;

public class Carro {
	//atributo
	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
	
	//metodo
	
	void liga()  //indicação de frase sem retorno
	{
		System.out.println("O carro está ligado. ");
	}
	
	void acelera (double quantidade) // atualização de velocidade
	{
		double velocidadeNova = this.velocidadeAtual + quantidade;  //this é o atributo principal
		this.velocidadeAtual = velocidadeNova;
	}
	int pegaMarcha()  //indica qual marcha usar
	{
		if(this.velocidadeAtual<0) 
		{
			return -1;
		}
		if (this.velocidadeAtual>=0 && this.velocidadeAtual<40)
		{
			return 1;
		}
		if (this.velocidadeAtual>=40 && this.velocidadeAtual<80) 
		{
			return 2;
		}
		return 3;
	}

}
