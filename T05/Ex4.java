import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quanto você gastou: ");
        double valorgasto = sc.nextDouble();
        int operacao;
        System.out.println("1 - Prazo");
        System.out.println("2 - A vista");
        System.out.print("Digite aqui: ");
        operacao = sc.nextInt();

        if (operacao == 1) {
            valorgasto = valorgasto * 1.10;
        }
        System.out.println("O valor ficará R$" + valorgasto);
        sc.close();
    }

}
