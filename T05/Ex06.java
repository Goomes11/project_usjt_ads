import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        if (idade >= 5 && idade <= 10) {
            System.out.println("Infantil");
        } else if (idade > 11 && idade <= 17) {
            System.out.println("Juvenil");
        } else if (idade >= 18 && idade <= 60) {
            System.out.println("Sênior");
        } else {
            System.out.println("Idade inválida! Digite uma idade entre 5 e 60 anos.");
        }


    }
}
