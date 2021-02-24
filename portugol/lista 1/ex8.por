programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{
		real	custoDeFabrica = 0.00
		real custoAoConsumidor = 0.00
		real custoTotal = 0.00
		real porcentagem = 0.00

		escreva("Digite o custo de fabrica: ")
		leia(custoDeFabrica)

		porcentagem = (custoDeFabrica*0.28) + (custoDeFabrica*0.45)
		custoAoConsumidor = custoDeFabrica + porcentagem

		escreva("O custo do consumidor é ", custoAoConsumidor, " reais.")

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 320; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */