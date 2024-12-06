package repeticaodowhile;

import java.util.Scanner;

public class Exercicio60 {
    /*60) Faça um programa que exiba os primeiros 20 números da sequência de Fibonacci usando o loop "do-while".*/
    public static void main(String[] args) {
        int n = 0;
        int a = 0;
        int b = 1;
        int c;

        System.out.println("20 primeiros números da Sequência de Fibonacci:");
        System.out.println("0");

        do {
            System.out.println(b);
            c = a + b;
            a = b;
            b = c;
            n++;
        } while (n < 19);
    }
}
