package repeticaowhile;

public class Exercicio45 {
    /*45 - Faça um programa que exiba os primeiros 20 números da sequência de Fibonacci usando o loop "while".*/
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int contador = 0;

        System.out.println("20 primeiros números da sequência de Fibonacci:");
        System.out.println("0");

        while (contador < 19) {
            System.out.println(b);
            int c = a + b;
            a = b;
            b = c;

            contador++;
        }
    }
}
