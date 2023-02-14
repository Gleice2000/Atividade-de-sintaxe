import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        // cria um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // lê o número de pessoas que comprou o pacote
        System.out.print("Digite o número de pessoas: ");
        int numPessoas = sc.nextInt();

        // lê o número de dias do pacote turístico
        System.out.print("Digite o número de dias do pacote turístico: ");
        int numDias = sc.nextInt();

        // calcula o preço do pacote turístico com base na tabela de preços
        double preco;
        if (numPessoas <= 4) {
            preco = 160.0;
        } else if (numPessoas <= 8) {
            preco = 120.0;
        } else {
            preco = 80.0;
        }
        double valorTotal = numPessoas * preco * numDias;

        // imprime o valor total do pacote turístico
        System.out.printf("O valor total do pacote turístico para %d pessoas por %d dias é R$%.2f\n", numPessoas, numDias, valorTotal);

        // fecha o objeto Scanner
        sc.close();
    }

}