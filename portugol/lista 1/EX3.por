programa
{
	
	funcao inicio()
	{
		inteiro duracao
		real horas = 0
		real minutos = 0
		real segundos = 0

		escreva("Digite o tempo de duração em segundos: ")
		leia(duracao)

		horas = duracao / 3600
		minutos = (duracao % 3600) / 60
		segundos = (duracao % 3600) % 60

		escreva ("Hora[s]",horas)
		escreva ("\nMinutos[s]",minutos)
		escreva ("\nSegundo[s]",segundos)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 354; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */