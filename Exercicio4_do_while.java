package Revisao;
/* Faça um programa em C que calcula e escreve a seguinte soma: soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50
*/
public class Exercicio4 
{
  public static void main (String args[]) 
  {
	 float soma=0, num1=1, num2=1;
	
	do
	{    
	soma=soma+(num1/num2);
	num1=num1+2;
	num2=num2+1;
	 
	
	}while (num1<=99 && num2<=50);
	
	System.out.println(soma);	
	} 
    
  }
	

