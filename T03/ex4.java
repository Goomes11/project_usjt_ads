import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em Reais (R$): ");
        double reais = scanner.nextDouble();

        double cotacao = 5.00;
        double dolares = reais / cotacao;

        System.out.printf("Valor em dólares: US$ %.2f\n", dolares);

        scanner.close();
    }
}