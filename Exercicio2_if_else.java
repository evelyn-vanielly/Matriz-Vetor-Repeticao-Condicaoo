package Revisao;

import java.util.Scanner;

/*O IMC � �ndice de Massa Corporal � um crit�rio da Organiza��o Mundial de Sa�de para dar uma indica��o sobre a condi��o de peso de uma pessoa adulta. A f�rmula � IMC = peso / ( altura )2 
Elabore um programa que leia o peso e a altura de um adulto e mostre sua condi��o de acordo com a tabela abaixo. 
IMC em adultos Condi��o 
Abaixo de 18,5 Abaixo do peso 
Entre 18,5 e 25 Peso normal 
Entre 25 e 30 Acima do peso 
Acima de 30 obeso
*/
public class Exercicio2 
{
	public static void main (String args[]) 
	{
		Scanner ler = new Scanner (System.in);
		int peso;
		float  altura=0;
		double imc=0;
		
		System.out.println("Entre com seu peso: ");
		peso = ler.nextInt();
		System.out.println ("Entre com sua altura: ");
		altura = ler.nextFloat();
		
		
		imc = peso/(Math.pow(altura, 2));
	
		System.out.println("Seu IMC � de: "+Math.round(imc));
		
		
		if (imc<18.5){
		 System.out.println ("Seu IMC est� abaixo do peso. ");}
		  else if (imc>=18.5 && imc <25) {
		  System.out.println ("Seu IMC est� dentro do peso normal. ");}
		  	else if (imc>=25 && imc<=30) {
		  		System.out.println("Seu IMC est� acima do peso.");}
		  		else if (imc>30) {
		  			System.out.println ("Seu IMC est� obeso.");}
		
	    
		
    }
}