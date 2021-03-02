package LISTAPOO;

public class Aviao {
	public String vooIda;
	public String vooVolta;
	public String empresa;
	public double tempodeChegada;
	public double tempodePartida;
	
	void viagem()
	{
		System.out.println("O avião está pronto para partir...");
	}
	void partida (double horario)
	{
		double horarionovo = this.tempodePartida + horario;
		this.tempodePartida = horario;
	}

}
