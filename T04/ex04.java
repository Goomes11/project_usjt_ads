import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        double media = (nota1 + nota2) / 2;
        if (media >= 6.0) {
            System.out.println("Aluno aprovado.");
        }
        if (media < 6.0) {
            System.out.println("Aluno reprovado.");
        }
        sc.close();
    }
}
