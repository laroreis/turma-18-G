programa
{
	inclua biblioteca Matematica --> Mat
	funcao inicio()
	{
		real a,b,c
		real r,d,s

		escreva("valor de a: ")
		leia (a)
		escreva("valor de b: ")
		leia (b)
		escreva("valor de c: ")
		leia (c)


		r = Mat.potencia((a+b),2)
		s = Mat.potencia((b+c), 2)
		d= (r + s)/2

		escreva ("resultado da distancia = " ,d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 195; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */