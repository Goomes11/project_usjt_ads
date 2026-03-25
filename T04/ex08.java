import java.util.Scanner;
public class ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        double A = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        double B = sc.nextDouble();
        System.out.print("Digite o valor de C: ");
        double C = sc.nextDouble();
        // Calculo para colocar em ordem crescente
        if (A > B) {
            double temp = A;
            A = B;
            B = temp;
        }       
        if (B > C) {
            double temp = B;
            B = C;
            C = temp;
        }   
        if (A > B) {
            double temp = A;
            A = B;
            B = temp;
        }   
        System.out.println("Ordem crescente: " + A + ", " + B + ", " + C);
        sc.close();
    }
}