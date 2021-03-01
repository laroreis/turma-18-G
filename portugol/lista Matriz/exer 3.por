programa
{
	//Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
	//a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
	//das matrizes N1 e N2;
	//b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
	//posição das matrizes N1 e N2.	
	funcao inicio()
	{
		inteiro N1 [4][6]
		inteiro N2 [4][6]
		inteiro M1 = 0
		inteiro M2 = 0
		

		para(inteiro x=0; x<4; x++){
			
			para(inteiro y=0; y<6; y++){
			escreva("\nDigite os valores da Matriz N1: [",x ,"][",y,"]:")
			leia(N1[x][y])
				
		}
		}
		para(inteiro x=0; x<4; x++){
			
			para(inteiro y=0; y<6; y++){
			escreva("\nDigite os valores da Matriz N2: [",x ,"][",y,"]:")
			leia(N2[x][y])
				
		}
		}
		para(inteiro x=0; x<4; x++){
			
			para(inteiro y=0; y<6; y++){
			M1 = (N1[x][y] + N2[x][y])
			M2 = (N1[x][y] - N2[x][y])
			escreva("\nA somatória das Matrizes N1 ", N1[x][y]," e N2 " ,N2[x][y]," é: ",M1)
			escreva("\nA diferença entre as matrizes N1 ", N1[x][y]," e N2 ",N2[x][y]," é: ",M2)
				
		}
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 552; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */