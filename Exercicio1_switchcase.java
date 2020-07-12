package Revisao;

import java.util.Scanner;

public class Exercicio1 
{
	public static void main (String args[]) 
	{ Scanner ler= new Scanner (System.in);
	 
	 int num, num1;
	 float prod;

	
	 System.out.println("Entre com o valor de seu produto: R$");
	 prod = ler.nextInt();
	 System.out.println("Escolha uma opção: 1 - À vista em dinheiro ou cheque, recebe 20% de desconto \r\n" + 
	 		"2 - À vista no cartão de crédito, recebe 15% de desconto \r\n" + 
	 		"3 - Em duas vezes, preço normal de etiqueta sem juros \r\n" + 
	 		"4 - Em três vezes, preço normal de etiqueta mais juros de 10%\r\n" + " ");
	 num = ler.nextInt();
	 
	 switch (num)
	 {
		 case 1: 
			 prod = prod-((prod*20)/100);
			 System.out.println ("O valor do seu produto agora é: R$ "+prod);
			 break;
		 case 2:
			 prod = prod-((prod*15)/100);
			 System.out.println("O valor do seu produto agora é: R$"+prod);
			 
			 break;
		 case 3:
			 System.out.print("O valor do seu produto não teve alteração. Continua no valor de R$"+prod);
			 break;
		 case 4:
			 prod = prod+((prod*10)/100);
			 System.out.println ("O valor de seu produto com juros é: R$"+ prod);
			 break;
				 default: 
					System.out.println( "Opção inválida");
	 }   
    }
}