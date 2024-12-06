package repeticaowhile;

import java.util.Scanner;

public class Exercicio46 {
    /*46 - Escreva um programa que leia um número inteiro e exiba a soma de todos os números pares entre 1 e o número lido usando o loop "while".*/
    public static void main(String[] args) {
        int numero;
        int par = 0;
        int soma = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero = entrada.nextInt();

        while (par <= numero){
            if (par % 2 == 0){
                soma += par;
            }
            par++;
        }

        System.out.println("A soma dos números pares até " + numero + " é: " + soma);
    }
}
