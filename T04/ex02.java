import java.util.Scanner;
public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual a sua idade? ");
        int idade = sc.nextInt();
        if (idade >= 18) {
            System.out.println("Categoria adulta.");
        } else {
            System.out.println("Você é menor de idade.");
        }
    }
}
