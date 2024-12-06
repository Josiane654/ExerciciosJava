package repeticaofor;

import java.util.Scanner;

public class Exercicio76 {
    /*76) Escreva um programa que leia um número inteiro e exiba a soma de todos os números pares entre 1 e o número lido.*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        int soma = 0;

        for (int n = 2; n <= numero; n += 2) {
            soma += n;
        }

        System.out.println("A soma dos números pares entre 1 e " + numero + " é: " + soma);
    }
}
