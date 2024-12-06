package repeticaowhile;

import java.util.Scanner;

public class Exercicio43 {
    /*43 - Escreva um programa que leia um número inteiro e exiba a sequência de Fibonacci até o número lido usando o loop "while".*/
    public static void main(String[] args) {
        int numero;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um número: ");
        numero = entrada.nextInt();

        int a = 0;
        int b = 1;

        System.out.println("Sequência até o número " + numero + ":");
        System.out.println("0");

        while (b <= numero) {
            System.out.println(b);

            int c = a + b;
            a = b;
            b = c;
        }
    }
}
