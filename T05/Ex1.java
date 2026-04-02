import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("O número é igual");
        }
        else {
            System.out.println(" O número diferente");
        }
        sc.close();
    }
    
}
