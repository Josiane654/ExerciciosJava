package repeticaofor;

import java.util.Scanner;

public class Exercicio73 {
    /*73) Escreva um programa que leia um número inteiro e exiba a sequência de Fibonacci até o número lido.*/
    public static void main(String[] args) {

        int n;
        int a = 0;
        int b = 1;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com um número inteiro: ");
        n = entrada.nextInt();

        System.out.println("Sequência de Fibonacci até o número " + n);
        System.out.println(0);

        for (int i = 0; a <= n; i++) {
            System.out.print(b);
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
