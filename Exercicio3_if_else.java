package Revisao;

import java.util.Scanner;

/*Escrever um programa que leia uma quantidade desconhecida de n�meros e conte quantos deles est�o nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. 
 * A entrada de dados deve terminar quando for lido um n�mero negativo.
 */
public class Exercicio3 
{
 public static void main (String args[]) {
	 Scanner ler = new Scanner (System.in);
	 
	 int num, x=0, y=0, p=0, z=0;
	 
	 do {
		 System.out.println ("Insira um valor: ");
		 num = ler.nextInt();
		 
		 if (num>=0 && num<=25)		 
		 {
			 p++;
		 }
		 if (num>=26 && num<=50)
		 {
			 x++;
		 }
		 else if (num>=51 && num<=75)
		 {
			 y++;
		 }
		 else if (num>=76 && num<=100)
		 {
			 z++;
		 }
		 
	 }while (num>0);
	 
	 System.out.println("H� "+p+" numeros de 0 a 25.");
	 System.out.println("H� "+x+" numeros de 26 a 50.");
	 System.out.println ("H� "+y+" numeros de 51 a 75.");
	 System.out.println("H� "+z+" numeros de 76 a 100.");
 }
}
