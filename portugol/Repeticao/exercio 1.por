programa
{
	inclua biblioteca Matematica -->Mat
	
	funcao inicio()
	{
		inteiro filhos = 0
		real salario = 0.0
		real mediaSalario = 0.0 //media do salario
		inteiro mediaFilhos = 0
		real soma1 = 0.0 //salario
		inteiro soma2 = 0 //filhos
		real potencia = 0.0

		para (inteiro x=1; x<=20; x++ )
		{
			escreva("Qual seu salário? ",x)
			leia(salario)
			
			escreva("quantos filhos você tem? ",x)
			leia(filhos)
			
			soma1 = soma1 + salario
			soma2 = soma2 + filhos
		}

		mediaSalario = (soma1/20)
		mediaFilhos = (soma2/20)
		escreva("A média de filhos é: ",mediaFilhos)
		escreva("\nA média de salários e: ",mediaSalario)
		escreva("\nO maior salário é ", Mat.maior_numero(salario,salario))

		 se (salario<=100)
		 	potencia = ((salario*100)/20)
		    escreva("\nO porcentual de pessoas com o salário até 100 reais é: ",potencia,"%")
		}
	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 740; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */