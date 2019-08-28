algoritmo
declare opcao, n, opcaof numerico
 nome literal
inicio
escreva "Digite seu nome para come�armos"
leia nome
iniciob(opcao)
fim
	// ============================================================================================================
se opcao = 1 entao
inicio
leia opcaof
fim
	// ============================================================================================================
se opcaof = 1 entao
inicio
limpar_tela()
condicao(n)
fim
	// ============================================================================================================
se opcaof = 2 entao
inicio
limpar_tela()
prepeticao(n)
fim
	// ============================================================================================================
	
se opcaof = 3 entao
inicio
	limpar_tela()
	vetores(n)
fim
se opcaof = 4 entao
inicio
	limpar_tela()
	matriz(n)
	fim
	// ============================================================================================================
se opcaof = 5 entao
inicio
	escreva "Sub-rotina sao chamadas de parametros, que foram utilizadas no uso das op�oes do menu"
	escreva "Escolha uma op��o do menu principal para chamar aqui"
	leia opcao
	se opcao = 1 entao
	inicio
	escreva "Chamada de parametro do Se e sen�o"
		condicao(n)
	fim
	se opcao = 2 entao
	inicio
		escreva "Chamada de parametro da condi��o de repeti��o Para e Enquanto"
		prepeticao(n)
	fim
	se opcao = 3 entao
	inicio
	escreva "Por exemplo eu posso chamar a op��o vetor aqui"
		vetores(n)
	fim
	se opcao = 4 entao
	inicio
		escreva "Chamada de parametro da matriz"
		matriz(n)
	fim
	se opcao = 5 entao
	inicio
		retorno(n)
	fim
	se opcao = 0 entao
	inicio
		escreva "Encerrando o progama..."
	fim
fim
	// ============================================================================================================
se opcaof = 0 entao
inicio
limpar_tela()
	escreva "Fechando o progama..."
fim
fim_algoritmo
	// ============================================================================================================
// Fun��o chamada de parametro do menu
// Usando uma das fun��es no menu com o Se no inicio
sub-rotina iniciob (opcao numerico)
escreva "Bem-vindo ", nome, " a explora��o da l�gica de progama��o"
escreva "Para continuar[1] para sair[0]"
leia opcao
enquanto opcao <> 1 e opcao <> 0 faca
inicio
escreva "Escolha uma op��o v�lida"
leia opcao
fim
limpar_tela()
inicio
fim
	// ============================================================================================================
se opcao = 1 entao
inicio
escreva "No come�o do progama utilizou-se a condi��o Se"
escreva "P�rem para melhor aprendizagem vai ser trabalhado novamente"
escreva "Qual op��o deseja escolher ", nome, "?"
escreva "======== Menu ========"
escreva "1 - Condi��o (Se ou Sen�o)"
escreva "2 - Repeti��o (Para OU enquanto)"
escreva "3 - Vetor"
escreva "4 - Matriz"
escreva "5 - Sub Rotina"
escreva "0 - Encerrar o algoritmo"
fim
	// ============================================================================================================
fim_sub_rotina iniciob
	// ============================================================================================================
// Se e senao
sub-rotina condicao (n numerico)
declare opcao numerico
	// ============================================================================================================
inicio
escreva "Sr.(a) " , nome, " voce selecionou 1 - Condi��o, caso queira sair digite[Sair]"
escreva "Vamos para um dos exemplos da condi��o Se e  Sen�o"
escreva "Exemplo: Se o numero for maior que 0 ele sera Positivo"
escreva " Sen�o o numero sera negativo"
escreva "O que deseja fazer " , nome , " ?"
escreva nome, " [1] Continuar"
escreva nome, " [2] Retornar ao menu prinicipal" 
escreva nome, " [0] Sair"
leia opcao
enquanto opcao <> 1 e opcao <> 2 e opcao <> 0 faca
inicio
	escreva nome, " Tente novamente, op��o invalida"
	leia opcao
fim
	// ============================================================================================================
se opcao = 1 entao
inicio
escreva "Digite um numero para iniciar o exemplo"
leia n
	// ============================================================================================================
	se n >= 0 entao
	inicio
	escreva "Positivo"
	inicio
	escreva "Deseja retornar ao menu?"
	escreva nome, " [1] Sim [0] N�o"
	leia opcao
	fim
	enquanto opcao <> 1 e opcao <> 0 faca
	inicio
		escreva nome, " Tente novamente, op��o inv�lida"
		leia opcao
	fim
fim
senao
inicio
escreva "Negativo"
inicio
	escreva "Deseja retornar ao menu?"
	escreva nome, " [1] Sim [0] N�o"
	leia opcao
	fim
	enquanto opcao <> 1 e opcao <> 0 faca
	inicio
		escreva nome, " Tente novamente, op��o inv�lida"
		leia opcao
	fim
	fim
fim
fim
	// ============================================================================================================
	
se opcao = 1 entao
	inicio
	limpar_tela()
		condicao(n)
	fim
	se opcao = 2 entao
	inicio
	limpar_tela()
	retorno(n)
	fim
inicio
	
	se opcao = 0 entao
	inicio
	escreva "Opa parece que voce decidiu fechar o progama"
	escreva "Ate breve " , nome, " bons estudos"
	escreva "Fechando o progama..."
	fim
fim
	// ============================================================================================================
retorne n
fim_sub_rotina condicao
	// ============================================================================================================
// Fim Se e Senao - OK
// Inicio condi��o de repeti��o
	// ============================================================================================================
sub-rotina prepeticao (n numerico)
declare a,opcao,nn, soma, opcaofe  numerico
	// ============================================================================================================
	inicio // OK
	limpar_tela()
	escreva "Seja bem-vindo novamente aventureiro(a) " ,nome, " nos la�os de repeti��es"
	escreva "Aqui o(a) sr(a) " , nome, " ira escolher qual repeti��o deseja usar"
	escreva "Entao bom proveito nesse progama de estudos"
	escreva nome, " [1] Repeti��o (Para)"
	escreva nome, " [2] para a repeti��o (Enquanto)"
	escreva nome, " [3] Retornar ao menu principal"
	escreva nome, " [0] Sair."
	leia opcaofe
	// ============================================================================================================
	limpar_tela()
	se opcaofe = 1 entao
	
inicio
	escreva "Vamos come�ar entao" , nome
	escreva "Aqui iremos utilizar a repeti��o (Para)"
	escreva "[1] Continuar"
	escreva "[2] Quantidade que deseja digitar"
	leia opcao
	
	
	
	// ============================================================================================================	
	se opcao = 1 entao
	inicio
	limpar_tela()
	escreva "[1] Repeti��o Para, com quantos valores serao digitados definido pelo progamador!"
	para n <- 1 ate 5 faca
	inicio
	escreva "Escreva o ", n , " � valor"
	leia n
	soma <- soma + n
	fim
	
		
	// ============================================================================================================
	limpar_tela()
	inicio
	escreva "Caso troque a fun��o (Para) de 1 ate 5 para 1 ate 4 ira demonstrar apenas 4 valores"
	escreva "Escolha a op��o para ver a soma de 1 a 5 e no  de 1 a 4 mostrar a soma e imprimir em 4 linhas"
	escreva "De 1 a 5 digite [1] de 1 a 4 digite [0]"
	leia n
	// ============================================================================================================	
	inicio
	enquanto n <> 1 e n <> 0 faca
	inicio
	escreva "Tente novamente," ,nome,"voce digitou uma op��o inexistente!"
	escreva "De 1 a 5 digite [1] de 1 a 4 digite [0]"
	leia n
	fim
	fim
	
	
	
	// ============================================================================================================	
	se n = 1 entao
	inicio
	limpar_tela()
	escreva "A soma foi de " , soma
	escreva "Parab�ns, ",nome," voce chegou no final dos exemplo da condi��o (Para)"
	inicio
		escreva "Deseja retornar ao menu?"
		escreva "[1] Sim [0] N�o"
		leia opcao
		enquanto opcao <> 1 e opcao <> 0 faca
		inicio
			escreva nome, " Tente novamente, op��o inv�lida"
			leia opcao
			fim
			se opcao = 1 entao
			inicio
				prepeticao(n)
				fim
				se opcao = 0 entao
				inicio
					escreva "Fechando o progama..."
				fim
	fim
	fim
	
	
	// ============================================================================================================	
	
	se n = 0 entao
	inicio
	escreva "Parab�ns, ", nome," chegou no final dos exemplo da condi��o (Para)"
	inicio
	para n <- 1 ate 4 faca
	inicio
	escreva "A soma foi de " , soma
	fim
	inicio
		escreva "Deseja retornar ao menu?"
		escreva "[1] Sim [0] N�o"
		leia opcao
		enquanto opcao <> 1 e opcao <> 0 faca
		inicio
			escreva nome, " Tente novamente, op��o inv�lida"
			leia opcao
			fim
			se opcao = 1 entao
			inicio
				prepeticao(n)
				fim
				se opcao = 0 entao
				inicio
					escreva "Fechando o progama..."
				fim
	fim
	fim
	fim
	
	fim
	fim
	
	
	
		
	// ============================================================================================================
	
	se opcao = 2 entao
	
inicio
	escreva "Quantos numeros deseja digitar? " , nome
	leia nn
	inicio
	para n <- 1 ate nn faca
	
inicio
	escreva "Escreva o ", n , "� valor"
	leia n
	soma <- soma + n
	fim
	
	escreva "Bom, ", nome, "aqui voce viu como funciona a repeti��o (Para) quando o usuario define os valores"
	escreva "E no exemplo que sera visto o progamador define quantos valores quer que o usuario digite"
	escreva "E podemos tambem usar outras fun��es para que apare�a ao usuario como somar os valores que ele digitar , ou quantos ele quer digitar"
	escreva "Olhe o exemplo abaixo de soma usando a repeti��o (Para)"
	escreva "A soma dos numeros que foram digitados anteriormente foi de: " , soma
	inicio
		escreva "Deseja retornar ao menu?"
		escreva "[1] Sim [0] N�o"
		leia opcao
		enquanto opcao <> 1 e opcao <> 0 faca
		inicio
			escreva nome, " Tente novamente, op��o inv�lida"
			leia opcao
			fim
			se opcao = 1 entao
			inicio
				prepeticao(n)
				fim
				se opcao = 0 entao
				inicio
					escreva "Fechando o progama..."
				fim
	fim
	fim
	fim
	fim
		
	se opcaofe = 2 entao
	
inicio
	escreva nome," ,voce selecionou a condi��o (Enquanto)"
	escreva "Assim como a repeti��o (Para) a repeti��o(Enquanto) como o proprio nome ja diz enquanto algo for verdade ele ira repetir"
	escreva "Vamos para um exemplo, logo abaixo"
	escreva "Por exemplo: Enquanto voce nao digitar o numero 1 ele ficara nesse loop"
	leia opcao
	enquanto opcao <> 1 faca
	
inicio
	escreva "Enquanto voce nao digitar o numero 1 ele ficara nesse loop"
	leia opcao
	
fim
	
	// ============================================================================================================
	se opcao = 1 entao
	inicio
	escreva nome, ", voce saiu da repeti��o (Enquanto) vamos continuar com alguns exemplos"
	escreva "Digite 2 para continuar com os exemplos"
	leia opcao
	fim
	
	// ============================================================================================================
	enquanto opcao <> 2 faca
	inicio
	escreva "Tente novamente!, " , nome, " voce digitou uma op�ao invalida, digite 2 para retornar nos exemplos!"
	leia opcao
	fim
	// ============================================================================================================
	
	se opcao = 2 entao
	inicio
	enquanto opcao = 2 faca
	inicio
	escreva  nome, ", enquanto voce  digitar 2 essa mensagem ficara repetindo, para ir ao ultimo exemplo digite um numero diferente de 2"
	leia opcao
	fim
	
	// ============================================================================================================
	se opcao <> 2 entao
	inicio
	enquanto opcao < 5 faca
	inicio
	escreva nome, ", enquanto voce digitar um numero menor que 5 esta mensagem ira se repetir"
	leia opcao
	fim
	fim
	
fim
	se opcao >= 5 entao
	inicio
	escreva "Parab�ns, ", nome," chegou no final dos exemplos da condi��o (Enquanto)"
	inicio
		escreva "Deseja retornar ao menu?"
		escreva "[1] Sim [0] N�o"
		leia opcao
		enquanto opcao <> 1 e opcao <> 0 faca
		inicio
			escreva nome, " Tente novamente, op��o inv�lida"
			leia opcao
			fim
			se opcao = 1 entao
			inicio
				prepeticao(n)
				fim
				se opcao = 0 entao
				inicio
					escreva "Fechando o progama..."
				fim
	fim
	
fim
	fim
	se opcaofe = 0 entao
	inicio
	limpar_tela()
	escreva "Fechando o progama..."
	fim
	
	se opcaofe = 3 entao
	inicio
		limpar_tela()
		retorno(n)
	fim
	fim
	
	
	
	retorne n
fim_sub_rotina prepeticao
	// ============================================================================================================
//Fim da condi��o de repeti��o!
	// ============================================================================================================
//Inicio da fun��o vetores!
sub-rotina vetores (n numerico)
declare m[5] , v[5], x, verif, mult, soma numerico
	// ============================================================================================================
	inicio
	escreva "Seja bem-vindo, ",nome," a op��o 3 - Vetores, antes vou explicar o que � um vetor"
	escreva "Para come�ar a explica��o digite [1]"
	escreva "Multiplicar e somar digite [2]"
	escreva "Retornar menu principal [3]"
	escreva "Digite [0] para sair"
	leia n
	
	// ============================================================================================================
	enquanto n <> 1 e n  <> 0 e n <> 2 e n <> 3 faca
	
inicio
	escreva nome , " , escreva uma op��o val�da"
	leia n
	
fim
	
	se n = 0 entao
	inicio
	limpar_tela()
	escreva "Fechando o progama..."
	fim
	
	
	// ============================================================================================================
	
	se n = 1 entao
	inicio
 
	limpar_tela()
	escreva "Entao espero que goste, vamos l�!"
	escreva "Possuem vetores compostos homogeneas(do mesmo tipo) e unidmesionais(do mesmo tipo e pra identificar possuem o mesmo endere�o"
	escreva "Nas variaveis compostos simples nos usamos valores que sao alocados aleatoriamente na memoria"
	escreva "No vetor unidimensional ele se aloca em uma linha na horizontal ou vertical (veremos nas matrizes)"
	escreva "Este � o exemplo 2"
	
	para n <- 1 ate 5 faca
	inicio
	escreva "Digite o " , n, " � valor"
	leia v[n]
	fim
	inicio
	escreva "Digite um numero para encontrar no vetor"
	leia x	
	fim
	
	inicio
	para n <- 1 ate 5 faca
	inicio
	se x = v[n] entao
	verif <- x
	fim
	fim
			
	// ============================================================================================================
	se verif = x entao
	inicio
	escreva nome, " achei , voce colocou " , x, " confira acima o numero que voce escreveu"
	escreva nome ," voce chegou ao final do exemplo, deseja prosseguir ao proximo?"
	escreva "Se sim digite [2] se n�o digite [0]"
	leia n
	fim
	enquanto n <> 2 e n <> 0 faca
	inicio
		escreva nome," , Tente novamente, op��o inv�lida"
		leia n
	fim
	
	
	// ============================================================================================================
	se verif <> x entao
	inicio
	escreva nome, ", desculpe eu nao encontrei o numero desejado"
	escreva nome ," voce chegou ao final do exemplo, deseja prosseguir ao proximo?"
	escreva "Se sim digite [2] se n�o digite [0]"
	leia n
	fim
	enquanto n <> 2 e n <> 0 faca
	inicio
		escreva nome," , Tente novamente, op��o inv�lida"
		leia n
	fim
	fim
	
fim
	
	// ============================================================================================================
	se n = 2 entao
	inicio
	escreva nome, ", aqui nos iremos somar os valores digitados no vetor ou multiplicar por eles mesmo"
	escreva nome, ", escolha o que quer fazer"
	escreva "[1] Somar e [2] Multiplicar"
	leia n
	
	// ============================================================================================================
	se n = 1 entao
	inicio
	para n <- 1 ate 5 faca
	inicio
	escreva "Digite o " , n , " � valor"
	leia v[n]
	soma <- soma + v[n]
	fim
	
	
	inicio
escreva "Os valores somados s�o ", soma
	escreva nome ," voce chegou ao final do exemplo, deseja prosseguir ao proximo?"
	escreva "Se sim digite [2] se n�o digite [0]"
	leia n
	fim
	enquanto n <> 2 e n <> 0 faca
	inicio
		escreva nome," , Tente novamente, op��o inv�lida"
		leia n
	fim
	fim
	
	
	
	// ============================================================================================================
	se n = 2 entao
	inicio
	escreva "[2] Multiplica��o dos vetores"
	inicio
	para n <- 1 ate 5 faca
	inicio
	escreva "Digite o " , n , " � valor"
	leia v[n]
	escreva "Digite o " , n, " � valor pra multiplicar"
	leia m[n]
		mult <- m[n] * v[n]
	escreva nome, " ,o valor multiplicado: ", mult	
	fim
	fim
	
// ============================================================================================================
	inicio
	escreva "Parab�ns, ", nome," chegou no final do exemplo de vetor"
	escreva "Deseja retornar ao menu?"
	escreva "Se sim digite[1] se nao digite[0]"
	leia opcao
	enquanto opcao <> 1 e opcao <> 0 faca
		inicio
		escreva nome," Tente novamente, op��o invalida"
		leia opcao
		fim
		se opcao = 0 entao
		inicio
		escreva "Fechando o progama..."
		fim
		se opcao = 1 entao
		inicio
			escreva "Retornando"
			limpar_tela()
			vetores(n)
		fim
		fim
		fim
		fim
	
			se n = 3 entao
		inicio
		limpar_tela()
		retorno(n)
		
fim
		
		
	// ============================================================================================================
	
fim_sub_rotina vetores
//Fim da fun��o vetores
	// ============================================================================================================
sub-rotina matriz (n numerico)
declare m[5,5] , opcao, i, j, sl[5], sc[5] , soma, verif, x numerico
	// ============================================================================================================
	escreva "Seja bem vindo, " , nome, " , � op��o 4 - Matrizes"
	escreva "As matrizes possuem linhas e colunas"
	escreva "Matrizes podem ser iguais vetores, armazenando os valores em linhas passando pelas colunas"
	escreva "Vamos para o exemplo"
	escreva "O que deseja fazer?"
	escreva "[1] Somar linhas e colunas"
	escreva "[2] Encontrar um numero na matriz"
	escreva "[3] Retornar ao menu principal"
	escreva "[0] Sair."
	leia opcao
	enquanto opcao <> 1 e opcao <> 2 e opcao <> 3 e opcao <> 0 faca
	inicio
	escreva nome, " Tente novamente, op��o inv�lida"
	leia opcao
	fim
	// ============================================================================================================
	limpar_tela()
	se opcao = 1 entao
	inicio
	para i <- 1 ate 5 faca
	inicio
	para j <- 1 ate 5 faca
	inicio
	escreva "Digite o valor da matriz [" , i , "," , j , "]"
	escreva nome, " aqui nos estamos passando pelas linhas e colunas da matriz"
	escreva "no final ira ser demonstrado a soma"
	leia m[i,j]
	sl[i] <- sl[i] + m[i,j]
	sc[j] <- sc[j] + m[i,j]
	
fim
	fim
	
	
	
	// ============================================================================================================
	limpar_tela()
	
	para i <- 1 ate 5 faca
	escreva nome ," a soma da linha " , i , " � " , sl[i]
	
	inicio
	para j <- 1 ate 5 faca
	escreva nome ," a soma da coluna " , j , " � " , sc[j]
	fim
	escreva nome ," voce chegou ao final do exemplo, deseja prosseguir ao proximo?"
	escreva "Se sim digite [2] se n�o digite [0]"
	leia opcao
	enquanto opcao <> 2 e opcao <> 0 faca
	inicio
		escreva nome," , Tente novamente, op��o inv�lida"
		leia opcao
	fim
		fim
	
	
	
	// ============================================================================================================
	limpar_tela()
	se opcao = 2 entao
	inicio
	para i <- 1 ate 5 faca
	para j <- 1 ate 5 faca
	inicio
	escreva "Digite o valor da matriz [" , i , "," , j , "]"
	escreva nome, " aqui nos estamos passando pelas linhas e colunas da matriz"
	escreva "no final iremos buscar o numero desejado para verificar se h� na matriz"
	leia m[i,j]
	fim
	inicio
		escreva nome, " digite o numero que deseja verificar se h� na matriz"
		leia x
		fim
	para i <- 1 ate 5 faca
	para j <- 1 ate 5 faca
	inicio
	se x = m[i,j] entao
	verif <- x
	fim
	
	inicio
		se verif = x entao
		escreva "O numero existe na matriz"
		escreva "Deseja retornar ao menu?"
		escreva "Digite [1] para retornar e [0] para encerrar o progama"
		leia opcao
		enquanto opcao <> 1 e opcao <> 0 faca
		inicio
		escreva nome," Tente novamente, op��o invalida"
			leia opcao
			fim
			
		se opcao = 1 entao
		inicio
		limpar_tela()
		matriz(n)
		fim
		
		
		se verif <> x entao
		inicio
			escreva "O numero n�o existe na matriz"
			escreva "Deseja retornar ao menu?"
		escreva "Digite [1] para retornar e [0] para encerrar o progama"
		leia opcao
		enquanto opcao <> 1 e opcao <> 0 faca
		inicio
			escreva nome," Tente novamente, op��o invalida"
			leia opcao
			fim
			
		se opcao = 1 entao
		inicio
		limpar_tela()
		matriz(n)
		fim
		
	fim
	fim
		
	fim
	
	// ============================================================================================================
	se opcao = 0 entao
	inicio
	limpar_tela()
	escreva nome, " Obrigado por usar este progama"
	escreva "Fechando o progama..."
	fim
	// ============================================================================================================
	
se opcao = 3 entao
	inicio
		retorno(n)
	fim
	
fim_sub_rotina matriz
sub-rotina retorno (n numerico)
declare opcaof numerico nome literal
inicio
escreva "Digite seu nome para come�armos"
leia nome
iniciob(opcao)
fim
	// ============================================================================================================
se opcao = 1 entao
inicio
leia opcaof
fim
	// ============================================================================================================
se opcaof = 1 entao
inicio
limpar_tela()
condicao(n)
fim
	// ============================================================================================================
se opcaof = 2 entao
inicio
limpar_tela()
	prepeticao(n)
fim
	// ============================================================================================================
se opcaof = 3 entao
inicio
	limpar_tela()
	vetores(n)
fim
	se opcaof = 4 entao
inicio
	limpar_tela()
	matriz(n)
	fim
	// ============================================================================================================
se opcaof = 5 entao
inicio
	escreva "Sub-rotina sao chamadas de parametros, que foram utilizadas no uso das op�oes do menu"
fim
	// ============================================================================================================
se opcaof = 0 entao
inicio
limpar_tela()
	escreva "Fechando o progama..."
fim
fim_sub_rotina retorno
