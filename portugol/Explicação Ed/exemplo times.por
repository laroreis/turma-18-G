programa
{
	
	funcao inicio()
	{
		// 4 times - São Paulo, Palmeiras, Santos, Corinthians
		// pontos por times
		// ganha = 3 ponto, Empata - 1, Perde - o
		// 3 rodadas com todos perguntando se ganhou, perdeu, empatou
		// depois de 3 rodadas totalize e mostre os pontos por time.
		// usar vetor

		cadeia times [] = {"São Paulo","Palmeiras","Santos","corinthians"}
		inteiro pontos [4] 
		caracter resultado 

		para(inteiro y=1; y<=3; y++){
			escreva("Rodada",y,":")
			para(inteiro i = 0; i<4; i++){
				escreva("\n",times[i],"1-Ganhou, 2- Empatou, 3-Perdeu: ")
				leia(resultado)
				se(resultado == '1'){
						pontos[i] = pontos[i] + 3
					}
				senao se (resultado == '2'){
					 	pontos[i] = pontos [i] + 1
					 	}
				senao se (resultado == '3'){
					 			pontos[i] =pontos [i] + 0
					 		}
			}
					 		
		}
	

		escreva("\n","Resultado: ")
		para (inteiro x=0; x<4; x++){
			escreva("\n", times[x], " ", pontos[x])
		}
		
		
		
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 849; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */