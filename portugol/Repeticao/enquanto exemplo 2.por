programa
{
	
	funcao inicio()
	{
		inteiro ano = 0
		inteiro idade
		inteiro anoAtual = 2021
		cadeia nome
		caracter parar = 'S'
		
		
		enquanto (parar != 'N')
		{
			escreva("Olá, qual seu nome? ")
			leia(nome)
			escreva("Qual o ano que você nasceu? ")
			leia(ano)

			idade = anoAtual - ano
			escreva("Olá",nome, " sua idade aproximada é: ",idade, "\n")
			escreva ("Quer continuar, S ou N? ")
			leia(parar)
		
			}
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 329; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */