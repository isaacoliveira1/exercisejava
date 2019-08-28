#include <stdio.h>
#include <stdlib.h>

int main (){
    float valor, entrada;
    int parcela;
    printf ("Informe o valor da compra\n");
    scanf ("%f", &valor);
    parcela = valor / 3;
    entrada = valor - (2 * parcela);

    printf ("Valor: %.2f\n", valor);
    printf ("Entrada: %.2f\n", entrada);
    printf ("Parcelas: %d\n", parcela);
    
    return 0;
}