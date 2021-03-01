programa
{
	// Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
	//em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
	//diagonal, ou seja, diagonal principal.	
	
	funcao inicio()
	{
		inteiro matriz [3][3]
		inteiro soma = 0
		inteiro diagonal = 0 

		para(inteiro x=0; x<3; x++){
			para(inteiro y=0;y<3;y++){
			escreva("\nDigite os valores da Matriz: [",x ,"][",y,"]:")
			leia(matriz[x][y])
			}
		}
		para(inteiro x=0; x<3; x++){
			
			para(inteiro y=0; y<3; y++){
			diagonal = (matriz[0][0] + matriz[1][1] + matriz[2][2])
			soma = (matriz[x][y]+ diagonal)
			
			escreva("\nA somatória da Matriz principal ",matriz[x][y]," mais a diagonal princial ",diagonal," é  ",soma)
			}
		}
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 718; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */