package LISTAPOO;

public class AviaoTeste {
	public static void main (String[] args)
	{
		Aviao aviao = new Aviao();
		
		aviao.vooIda = "Salvador";
		aviao.vooVolta = "São Paulo";
		aviao.empresa = "Gol";
		aviao.tempodeChegada = 20.00;
		aviao.tempodePartida = 0;
		
		aviao.viagem();
		
		aviao.partida(18.00);
		System.out.println("O aviao vai sair as "+ aviao.tempodePartida + " Horas");
		
	}

}
