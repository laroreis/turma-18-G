programa
{
	
	funcao inicio()
	{
	//n= horas trabalhadas c= codigo
		inteiro c
		real n
		real salarioTotal
		real salarioExcedente

		escreva("Digite horas trabalhadas: ")
		leia(n)

	salarioTotal= n*10
	

	se(n>50)
	{
	 escreva("você excedeu suas horas trabalhadas: ",(n-50), " horas")
	 escreva("\nSalario excedido foi de:  ", ((n-50)*20), " reais")
	 escreva("\nSeu salario total é: ",(((n-50)*20)+500), " reais")	
	}
	
	senao se (n<=50)
	{
		escreva("Seu salario total é: ",salarioTotal)
	}
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 410; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */