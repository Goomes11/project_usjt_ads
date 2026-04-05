import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a altura: ");
        double altura = sc.nextDouble();
        System.out.print("Digite o peso (em kg): ");
        double peso = sc.nextDouble();
        double imc = peso / Math.pow(altura, 2);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidade grau I");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Obesidade grau II");
        } else {
            System.out.println("Obesidade grau III ou mórbida");
        }
        sc.close();
    }
}
       