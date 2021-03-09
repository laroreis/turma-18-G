programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real n1,n2,n3,n4
		real q1,q2,q3,q4

		escreva("Digite o numero 1: ")
		leia(n1)
		escreva("Digite o numero 2: ")
		leia(n2)
		escreva("Digite o numero 3: ")
		leia(n3)
		escreva("Digite o numero 4: ")
		leia(n4)

		limpa()

		q1 = mat.potencia(n1, 2)
		q2 = mat.potencia(n2, 2)
		q3 = mat.potencia(n3, 2)
		q4 = mat.potencia(n4, 2)

		se (q3>=1000)
		{
			escreva("O valor do terceiro quadrado é de: ",q3)
		}
  		senao
  		{
		escreva("O valor do quadrado do primeiro número é: ",q1)
		escreva("\nO valor do quadrado do segundo número é: ",q2)
		escreva("\nO valor do quadrado do terceiro número é: ",q3)
		escreva("\nO valor do quadrado do quarto número é: ",q4)
  		}
		}
	}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 693; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */