import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        if (num1 == num2) {
            System.out.print("Os números são iguais");
        }
        else if (num1 > num2) {
            System.out.println("O número 1 é maior que o número 2");
        }
        else {
            System.out.println("O número 1 é menor que o número 2");
        }
    }
}
