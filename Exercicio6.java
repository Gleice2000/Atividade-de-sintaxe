//Faça um programa que, a partir da leitura das medidas dos lados de um retângulo(comprimento e largura), lidos do teclado, 
//calcule e imprima a área e o perímetro do retângulo. A fórmula da área do retângulo é A=C*L e do perímetro P=2*C+2*L.

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

  float area, comp, larg, perimetro;
  
  Scanner ent = new Scanner(System.in);
  
  System.out.println("Digite o comprimento do retangulo:");
  comp=ent.nextFloat();
  
  System.out.println("Digite a largura do retangulo:");
  
  larg=ent.nextFloat();
  area=larg*comp;
       
  System.out.printf("A area do retangulo é: "+area);
  perimetro=(comp*2)+(larg*2);
  
  System.out.printf("\nO perimetro do retangulo é: "+perimetro);
 }

}
