import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero inteiro positivo: ");
        int numero = sc.nextInt();

        boolean primo = true;
        int divisor = 2;

        while (divisor <= Math.sqrt(numero)) {
            if (numero % divisor == 0) {
                primo = false;
                break;
            }
            divisor = divisor + 1;
        }

        if (numero < 2) {
            primo = false;
        }

        if (primo) {
            System.out.println(numero + " é primo!");
        } else {
            System.out.println(numero + " não é primo.");
        }
        sc.close();
    }
}