programa
{
	//explicação de se 
	funcao inicio()
	{
		//variavel 
		cadeia alune
		inteiro nota
		caracter sexo

		//entrada
		escreva("Digite o nome do alune: ")
		leia(alune)
		escreva("Digite o sexo M/F/O: ")
		leia(sexo)
		escreva("Qual a nota de 1-10: ")
		leia(nota)

		//processamento
		//estrutura condicional
		se(nota > 5)
		{
			se(sexo=='M')
			{
				escreva("OI", alune, " Você foi APROVADO!!!")
				}
			senao se (sexo == 'F')
			{
				escreva("OI", alune, " você foi APROVADA!!!")
				}
			senao se (sexo =='O')
			{	
				escreva ("OI", alune, " você foi APROVADE!!!")
		}
		}

		se (nota <= 5)
		{
			se(sexo=='M')
			{
				escreva("OI", alune, " Você foi APROVADO!!!")
				}
			senao se (sexo == 'F')
			{
				escreva("OI", alune, " você foi APROVADA!!!")
				}
			senao se (sexo =='O')
			{	
				escreva ("OI", alune, " você foi APROVADE!!!")
			
			}
		}
		
		//Saida
		escreva("\nFim de programa")
	}
}		

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 925; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */