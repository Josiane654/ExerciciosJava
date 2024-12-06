package repeticaodowhile;

import java.util.Scanner;

public class Exercicio58 {
    /*58) Escreva um programa que leia um número inteiro e exiba a sequência de Fibonacci até o número lido usando o loop "do-while".*/
    public static void main(String[] args) {

        int n;
        int a = 0;
        int b = 1;
        int c;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com um número: ");
        n = entrada.nextInt();

        System.out.println("Sequência de Fibonacci até o número " + n + ": ");
        System.out.println("0");

        do {
            System.out.println(b);
            c = a + b;
            a = b;
            b = c;
        } while (b <= n);
    }
}
