import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o ano de nascimento: ");
        int ano = sc.nextInt();
        
        if (ano >= 2001 && ano <= 2100) {
            System.out.println("Você nasceu no século XXI");
        } else if (ano >= 1901 && ano <= 2000) {
            System.out.println("Você nasceu no século XX");
        } else if (ano >= 1801 && ano <= 1900) {
            System.out.println("Você nasceu no século XIX");
        } else {
            System.out.println("Ano inválido. Por favor, digite um ano entre 1801 e 2100.");
        }
        sc.close();
    }
}