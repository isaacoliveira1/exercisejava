#include <stdio.h>

int main (){
   /* int n, n1, m;
    printf ("Digiti i numeri\n");
    scanf ("%d" , &n);
   printf ("Digiti i numeri2\n");
    scanf ("%d" , &n1);

    m = n > n1 ? n : n1;
    printf ("Maior: %d", m);

int target, source, *n;
source = 10;
n = &source;
target = *n;
printf ("O numero e %d e esta na memoria %p", target, n);


int a =0 ;
int b =123456;
char c = 'a';
int *pa, *pb;
char *pc;
pa = &a;
pb = &b;
pc = &c;

printf ("O valor de de endereço %p e %d\n", pa, *pa);

printf ("O valor de de endereço %p e %d\n", pb, *pb);

printf ("O valor de de endereço %p e %c\n", pc, *pc);
*/

float valor_teste;
printf ("---TIPO-------!----BYTES----\n");
printf ("char ---------! %d bytes \n" , sizeof(char));
printf ("short ---------! %d bytes \n" , sizeof(short));
printf ("int ---------! %d bytes \n" , sizeof(int));
printf ("long ---------! %d bytes \n" , sizeof(long));
printf ("float ---------! %d bytes \n" , sizeof(float));
printf ("double ---------! %d bytes \n" , sizeof(double));
printf ("long double ---------! %d bytes \n\n" , sizeof(long double));
printf ("O tamanho de valor_teste eh... %d\n\n", sizeof valor_teste);

return 0;
}