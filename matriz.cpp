Laboratório de Computação I
IFPR
Data de entrega: 3 de jun
Exercício - Problema do Contador para Resolver com Matrizes
100 pontos

Augusto Luengo
28 de mai
Faça um programa que leia 12 lançamentos de faturamento mensal para 5 empresas diferentes e encontre qual empresa (se 1, 2, 3, 4 ou 5) teve o menor faturamento anual. Na solução, você deve usar obrigatoriamente uma matriz 5x12, um vetor de 5 elementos e pelo menos três funções (para ler matriz, calcular faturamento anual, encontrar menor faturamento).
Comentários da turma
Seus trabalhos
Devolvidos

matriz.cpp
C++
Comentários particulares
Exercício - Problema do Contador para Resolver com Matrizes
#include <stdlib.h>
#include <stdio.h>
#include <math.h>
#include <locale.h>
#define QTDM 12
#define QTDE 5

void le_matrizfat (float matriz[QTDE][QTDM]){
	
	int i,j;
	
	for (i=0; i<QTDE; i++){for (j=0; j<QTDM; j++){
			printf ("Digite os lançamentos da empresa %d do mês %d\n", i+1 , j+1);
			scanf("%f", &matriz[i][j]);
		}
	}

}
void calc_fatanual(float matriz[QTDE][QTDM], float vetor[QTDE]){
	float soma = 0;
	int i,j;
	for (i=0; i<QTDE; i++){
		soma = 0;
		for (j=0; j<QTDM; j++){
			soma = soma + matriz[i][j];
		}
		vetor[i] = soma;
	}
}

int busca_menor (float vetor[QTDE]){
	int menori=0;
	float menorvalor = vetor[menori];
	int i;
	for (i=0; i<QTDE; i++){
		if (vetor[i] < menorvalor){
		menorvalor = vetor[i];
		menori=i;
		}
		
		
	}
	
	return menori+1;
}



int main (){
	setlocale (LC_ALL , "Portuguese");
	float lanc_mensal[QTDE][QTDM];
	float lanc_anual[QTDE];

	le_matrizfat(lanc_mensal);
	calc_fatanual(lanc_mensal,lanc_anual);
	printf ("O menor faturamento foi da empresa %d\n" , busca_menor(lanc_anual));
	
	system("pause");
	return 0;
}
matriz.cpp
Exibindo matriz.cpp.
