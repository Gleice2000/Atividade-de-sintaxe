//Faça um programa que leia pelo teclado um valor, em dolar, converta e imprima o mesmo num valor em reais. 
//Considere que $ 1.00 dolar seja equivalente a R$5.10

import java.util.Scanner;

public class Exercicio4 {
    
    public static void main(String[] args){
   
  float valor, dolar, real=(float)5.10;
   
Scanner ent = new Scanner(System.in);
      
   System.out.println("Digite o valor em dolares ");
   
   
   dolar=ent.nextFloat();
   valor=dolar*real;
   
   System.out.printf("O valor em reais é R$ %.2f.", valor);
   
   
 }
}
