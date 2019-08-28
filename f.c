#include <stdio.h>
#include <stdlib.h>


int main (){
    float sb, smi, smm, smf;
 
    const float g = 5 , im = 7;
    printf ("Digite o salario base do funcionario!\n");
    scanf ("%f" , &sb);

    smi = (sb * g) /100;

     printf ("Valor: %.2f\n", smi);

    smm = (sb * im /100);

    printf ("Valor: %.2f\n", smm);
    smf = (sb + smi - smm);

    printf ("Recebe: %.2f\n" , smf);

    system("pause");
    return 0;


}