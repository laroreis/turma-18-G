programa
{
    inclua biblioteca Util

    funcao inicio()
    {

        cadeia agenda[24][31]
        inteiro dia
        inteiro hora
        inteiro opcao
        inteiro atividades = 0

        faca{
            escreva("Minha agenda\n")
            escreva("\n")

            escreva("Digite o numero do dia [1-31]")
            leia(dia)

            dia = dia - 1

            escreva("Digite o numero da hora [0-23]")
            leia(hora)

            escreva("Digite sua anotacao: ")
            leia(agenda[hora][dia])

            escreva("Desenja continuar? [1] - Sim / [0] - Nao")
            leia(opcao)

        }enquanto(opcao != 0)

        para(inteiro i = 0; i < Util.numero_linhas(agenda); i++){
            para(inteiro j = 0; j < Util.numero_colunas(agenda); j++){
                se(agenda[i][j] != ""){
                    escreva("Minhas anotacoes: "+ (i + 1) +" as "+ (j + 1) +"h : "+ agenda[i][j] +"\n")
                    atividades++
                }
            }
        }

        escreva("Voce tem "+ atividades +" atividade nesse mes.")
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 652; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */