import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro em R$: ");
        int valor = sc.nextInt();

        int n100 = valor / 100;
        valor = valor % 100;

        int n50 = valor / 50;
        valor = valor % 50;

        int n20 = valor / 20;
        valor = valor % 20;

        int n10 = valor / 10;
        valor = valor % 10;

        int n5 = valor / 5;
        valor = valor % 5;

        int n2 = valor / 2;
        valor = valor % 2;

        int n1 = valor;
        int total = n100 + n50 + n20 + n10 + n5 + n2 + n1;

        System.out.println("Notas de 100: " + n100);
        System.out.println("Notas de 50: " + n50);
        System.out.println("Notas de 20: " + n20);
        System.out.println("Notas de 10: " + n10);
        System.out.println("Notas de 5: " + n5);
        System.out.println("Notas de 2: " + n2);
        System.out.println("Moedas de 1: " + n1);
        System.out.println("Total de notas e moedas: " + total);

        sc.close();
    }
}