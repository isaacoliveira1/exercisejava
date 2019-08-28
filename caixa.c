#include <stdio.h>
#include <stdlib.h>

int main (){
    int dis, sal;
    int n1, n2, n5, n10, n20, n50, n100, resto;
    printf ("Quanto o senhor(a) vai sacar senhor(a)\n");
    scanf ("%d", &sal);
     n100 = sal /100;
     resto = sal % 100;

     n50 = resto / 50;
     resto = resto %50;
 
     n20 = resto /20;
     resto = resto %20;
  
     n10 = resto /10;
     resto = resto %10;
 
     n5 = resto / 5;
     resto = resto %5;
    
     n2 = resto / 2;
     resto = resto %2;

      n1 = resto /1;
      resto = resto % 1;
      printf ("_______________");
      printf("\n|Caixa MiNotas|\n");
      printf ("|_____________|\n");
      printf ("|Notas    |\n| 100 - %d |\n| 50 - %d  |\n| 20 - %d  |\n| 10 - %d  |\n| 5 - %d   |\n| 2 - %d   |\n| 1 - %d   |\n|_________|" ,n100, n50, n20, n10, n5,n2,n1); 

    
    
     


    





return 0;
}