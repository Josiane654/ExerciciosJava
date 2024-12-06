package repeticaodowhile;

import java.util.Scanner;

public class Exercicio61 {
    /*61) Escreva um programa que leia um número inteiro e exiba a soma de todos os números pares entre 1 e o número lido usando o loop "do-while".*/
    public static void main(String[] args) {

        int n;
        int soma = 0;
        int par = 2;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com um número: ");
        n = entrada.nextInt();

        do {
            soma += par;
            par += 2;
        } while (par <= n);

        System.out.println("Soma dos números pares até " + n + ": " + soma);
    }
}
