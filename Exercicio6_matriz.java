package Revisao;

import java.util.Scanner;

/* Faça um programa que lê um vetor de 3 elementos e uma matriz de 3 x 3 elementos. Em seguida o programa deve fazer a multiplicação do vetor pelas colunas da matriz.
*/
public class Exercicio6 
{
 public static void main (String args[])
 {
	 Scanner ler = new Scanner (System.in);
	 float []v1 = new float [3];
	float [][] m1 = new float [3][3], m2 = new float [3][3];
	
	 
	for (int x=0;x<3;x++) 
	{
	 System.out.print("Entre com um valor para o vetor: ");
	 v1[x] = ler.nextFloat();
	} 
	for (int i=0;i<3;i++)
	{
		for (int j=0;j<3;j++) 
		{
		 System.out.print("Entre com um valor para a matriz: ");
		 m1[i][j] = ler.nextFloat();
		}
	}
			for (int i=0;i<3;i++) 
			{ 
				for (int j=0;j<3;j++)
				{
				m2[i][j]=(m1[i][j]*v1[j]);
				System.out.println("O valor do matriz multiplicada é: "+m2[i][j]);
			    }
	        }
 }
}
