import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do lado A: ");
        double A = sc.nextDouble();
        System.out.print("Digite o valor do lado B: ");         
        double B = sc.nextDouble();
        System.out.print("Digite o valor do lado C: ");
        double C = sc.nextDouble();

        if (A + B > C && A + C > B && B + C > A) {
            System.out.println("Forma um triângulo");
        } else {
            System.out.println("Não forma um triângulo");
        }

        sc.close();
    }
}