import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // leitura dos dados de entrada
        System.out.print("Quantos dias o veículo foi utilizado? ");
        int dias = sc.nextInt();
        System.out.print("Qual a quilometragem do veículo? ");
        double quilometros = sc.nextDouble();

        // cálculo do valor a ser pago
        double custoFixo = dias * 45.00;
        double quilometrosExcedidos = Math.max(quilometros - (dias * 60), 0);
        double custoPorQuilometro = quilometrosExcedidos * 0.50;
        double totalAPagar = custoFixo + custoPorQuilometro;

        // impressão do resultado
        System.out.printf("O valor a ser pago é de R$ %.2f", totalAPagar);
        sc.close();
    }
}