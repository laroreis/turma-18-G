programa
{
	inclua biblioteca Matematica --> Mat
	//grupo 2 rece uma temperatura em graus farenheit e transforma em celcius
	// C=(f-32)/1.8
	funcao inicio()
	{
		real f
		real c

		
		escreva("Digite os graus em farenheit: ")
		leia(f)

		c = (f-32)/1.8

		escreva ("A temperatura em celcius em: ", Mat.arredondar(c,2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 325; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */