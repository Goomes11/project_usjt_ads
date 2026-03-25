import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Digite seu peso(kg): ");
        double peso = sc.nextDouble();

        System.out.println("Digite sua altura(m) com (,): ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC é: %.2f\n", imc);

        sc.close();
    }
}