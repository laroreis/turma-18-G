programa
{
	inclua biblioteca Matematica 
	
	funcao inicio()
	{
		//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
  		//atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.

		inteiro pontuacao [5]
		real maior = 0.00

		para(inteiro x=0;x<=4;x++){
			escreva("Digite sua pontuação ",x+1, " :")
			leia(pontuacao[x])
			maior = Matematica.maior_numero(maior, pontuacao[x])
			//se (pontuacao[x]>maior){
			//	maior = pontuacao[x]
		}
	limpa()
		para(inteiro y=0; y<=4;y++){
		escreva("\nPontuação ",y+1,": ", pontuacao[y])
		}
		 escreva("\nO maior numero é: ",maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 492; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */