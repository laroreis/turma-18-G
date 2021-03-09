programa
{
	//par e impar exercício
	funcao inicio()
	{
		//variavel
		inteiro num

		escreva("Digite um numero inteiro: ")
		leia(num)

		
		se ((num%2) == 0 )
		{
			escreva("O numero é par")
			}
		senao se ((num%2) == 1)
		{
			escreva("O numero informado é impar")
			}
		senao  se (num == 0)
		{
				
				escreva ("o numero 0 é neutro")
			}
			
		escolha(num)
		{
			caso +num:
			escreva("\nnumero positivo ")
			pare

			caso - num: 
			escreva("\nnumero negativo ")
		}
		
		
		}
		
	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 223; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */