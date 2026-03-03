public class Variaveis {
    public static void main(String[] args) {
    // entrada da variavel
    int a = 19, b = 4;
    int c = 5, d = 10;
    int e = 255, f = 500;
    // operador (contas)
    int soma = a + b;
    int subtracao = f - b;
    int multiplicacao = e * b;
    int divisao = a / b;
    int divisao2 = d / c;
    int resto = c % b;
    // Sistemas = Resultados das Operações
    System.out.println ("Resultado da Soma = " + soma);
    System.out.println ("Resultado da Subtração = " + subtracao);
    System.out.println ("Resultado da Divisão = " + divisao);
    System.out.println ("Resultado do Resto = " + resto);
    System.out.println ("Resultado da Multiplicação = " + multiplicacao);
    System.out.println ("Resultado Divisão 2 = " + divisao2);
    // Trabalhando com Variáveis double
    // Declaração
    double x = 7.5, y = 0.25;
    // Realiza as Operações, declarando as variáveis de resultado
    double somaDouble = x + y;
    double subtracaoDouble = x - y;
    double multiplicacaoDouble = x * y;
    double divisaoDouble = x / y;
    // Sistemas para o Double
    System.out.println ("Resultado da Soma Double = " + somaDouble);
    System.out.println ("Resultado da Subtração Double = " + subtracaoDouble);
    System.out.println ("Resultado da Multiplicação Double = " + multiplicacaoDouble);
    System.out.println ("Resultado da Divisão Double = " + divisaoDouble);
    System.out.println (x + " + " + y + " = " + somaDouble);
    System.out.println (x + " + " + y + " = " + multiplicacaoDouble);
    System.out.println (x + " - " + y + " = " + subtracaoDouble);
    System.out.println (x + " / " + y + " = " + divisaoDouble);
    // Exemplo de int com double
    double resultado = a * x + b * y;
    System.out.println ("Resultado = " + resultado);
    
    String nome = "Ryan", sobrenome = "Gomes";
    System.out.println(nome + " " + sobrenome);
    }
}