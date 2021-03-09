programa
{
	
	funcao inicio()
	{
		inteiro valor = 0
		inteiro soma = 0
		real media = 0.00

		para(inteiro x=1; x<=5; x++){
			escreva("Leia o numero: ",x,":")
			leia(valor)
			soma = soma + valor
		}

		media = (soma / 5)
		escreva("Soma dos Valores:", soma, "\n")
		escreva("A média dos Valores: ", media,"\n")
		
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