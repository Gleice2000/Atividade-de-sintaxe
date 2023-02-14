//Utilizando o for. Desenvolva um programa que receba um número e uma letra e mostre a letra repetida o número de vezes correspondente ao número recebido.

import java.util.Scanner;

public class Exercicio17 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Informe um número: ");
        int numero = sc.nextInt();
        System.out.print("Informe uma letra: ");
        char letra = sc.next().charAt(0);


        for (int i = 0; i < numero; i++) {
            System.out.print(letra);
        }

        sc.close();
    }
}