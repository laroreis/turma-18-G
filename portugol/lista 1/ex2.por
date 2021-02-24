programa
{
	
	funcao inicio()
	{
	//Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 
		
		inteiro ano = 0
		inteiro mes = 0
		inteiro dia = 0
		inteiro idade

		escreva("Digite sua idade em dias: ")
		leia (idade)

		ano = idade/365
		mes = (idade % 365) /30
		dia = (idade % 365) % 1
		

		escreva ("Ano[s]",ano)
		escreva ("\nMes[es]",mes)
		escreva ("\nDia[s]",dia)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 347; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */