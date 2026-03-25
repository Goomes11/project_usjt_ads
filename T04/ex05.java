import java.util.Scanner;
public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-vindo a calculadora que dirá se o número é divisil por 3 ou 5 ao mesmo tempo. Vamos começar!");
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("O número é divisível por 3 e 5.");
        } else {
            System.out.println("O número não é divisível por 3 e 5 ao mesmo tempo.");
        }
        sc.close();
    }
}
