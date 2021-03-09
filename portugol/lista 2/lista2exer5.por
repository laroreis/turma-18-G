programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		//p = peso do tomate
		//E = excesso
		//m = multa
		//kg = quilo
		
		real p = 0
		real E = 0
		real m = 0
		real kg

		escreva("Digite o peso do tomate: ")
		leia(p)

		E=p-50
		m = E*4

		se (p<=50)
		{
			escreva("Sem multa")
			escreva("\nE = 0")
		}
		senao se (E>=1)
		{
			escreva("seu peso excedeu: ",E, " kilos")
			escreva("\nsua multa é: ", mat.arredondar(m,2))
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 319; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */