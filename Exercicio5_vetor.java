package Revisao;

import java.util.Scanner;

/* Faça um programa que leia um vetor de 5 posições para números reais e, depois, um código inteiro. 
 * Se o código for zero, finalize o programa; se for 1, mostre o vetor na ordem direta; se for 2, mostre o vetor na ordem inversa. 
 * Caso, o código for diferente de 1 e 2, escreva uma mensagem informando que o código inválido.
 */

public class Exercicio5 
{
 public static void main (String args[])
 {
	 Scanner ler = new Scanner(System.in);
   float[] vetor = new float[5]; 
   int x, cod;   
   
   for (x=0;x<5;x++)
   {
	   System.out.println("Entre com um valor: ");
	   vetor[x] = ler.nextFloat();
   }   
   System.out.println("Entre com o código: ");
       cod = ler.nextInt();  
    	 
     if (cod==1)
     {   for (x=0;x<5;x++)
     	{
    	 System.out.println("Estes é o valor da "+(x+1)+"º posição, no valor de: "+vetor[x]);
     	}	
     }
     	
     if (cod==2)
    	{ for (x=4;x>=0;x--)
     		{
    	 System.out.println("Estes é o valor da "+(x+1)+"º posição, no valor de: "+vetor[x]);
     		}	
    	}
     		else if (cod==0)
     			{;}
     			else if (cod!=1 && cod!=2 && cod!=0)
     			{
     				System.out.println("Código inválido.");
     			}
 }
}