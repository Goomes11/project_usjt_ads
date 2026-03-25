
import java.util.Scanner;
public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual seu ano de nascimento: ");
        int anoNascimento = sc.nextInt();
        System.out.print("Digite o ano atual: ");
        int anoAtual = sc.nextInt();
        int idade = anoAtual - anoNascimento;
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
            System.out.println("Você pode dirigir.");
        } 
        else if (idade >= 16 && idade < 18) {
            System.out.println("Você pode votar, mas não pode dirigir.");
        }
        if (idade < 16) {
            System.out.println("Você é menor de idade.");
            System.out.println("Você não pode votar.");
            System.out.println("Você não pode dirigir.");
        }
        sc.close();


    }
}
