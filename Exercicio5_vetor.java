package Revisao;

import java.util.Scanner;

/* Fa�a um programa que leia um vetor de 5 posi��es para n�meros reais e, depois, um c�digo inteiro. 
 * Se o c�digo for zero, finalize o programa; se for 1, mostre o vetor na ordem direta; se for 2, mostre o vetor na ordem inversa. 
 * Caso, o c�digo for diferente de 1 e 2, escreva uma mensagem informando que o c�digo inv�lido.
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
   System.out.println("Entre com o c�digo: ");
       cod = ler.nextInt();  
    	 
     if (cod==1)
     {   for (x=0;x<5;x++)
     	{
    	 System.out.println("Estes � o valor da "+(x+1)+"� posi��o, no valor de: "+vetor[x]);
     	}	
     }
     	
     if (cod==2)
    	{ for (x=4;x>=0;x--)
     		{
    	 System.out.println("Estes � o valor da "+(x+1)+"� posi��o, no valor de: "+vetor[x]);
     		}	
    	}
     		else if (cod==0)
     			{;}
     			else if (cod!=1 && cod!=2 && cod!=0)
     			{
     				System.out.println("C�digo inv�lido.");
     			}
 }
}