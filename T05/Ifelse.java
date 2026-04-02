import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        if (num1 > 0) {
            System.out.println("O número é positivo");
        } 
        else if (num1 == 0) {
            System.out.println("O numero é neutro ");
        }
        else {
            System.out.println("O número é negativo");
        } 
        sc.close();
    }
}