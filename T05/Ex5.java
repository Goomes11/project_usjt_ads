import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double num1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double num2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double num3 = sc.nextDouble();
        double calculo = (num1 + num2 + num3) / 3;

        if (calculo >= 7) {
            System.out.println("Você está aprovado!");
        }
        else if (calculo >= 3) {
            System.out.println("Você está de exame!");
        }
        else {
            System.err.println("Você está reprovado!");
        }
        sc.close();
    }
}