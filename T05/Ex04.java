import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n ==BARATO, MÉDIO ou CARO?==");
        System.out.print("Digite o preço do produto: ");
            double preco = sc.nextDouble();
        
        if (preco <= 50) {
            System.out.println("O produto é barato.");
        } else if (preco > 50 && preco <= 100) {
            System.out.println("O produto é médio.");
        } else {
            System.out.println("O produto é caro.");
        }
        sc.close();
    }
}
