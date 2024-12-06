package repeticaofor;

import java.util.Scanner;

public class Exercicio69 {
    /*69) Faça um programa que leia 5 números inteiros e exiba a média aritmética dos valores lidos.*/
    public static void main(String[] args) {

        int soma = 0;

        Scanner entrada = new Scanner(System.in);

        for (int n = 1; n <= 5; n++) {
            System.out.print("Digite um número: ");
            soma += entrada.nextInt();
        }

        double media = (double) soma / 5;
        System.out.println("A média dos números é: " + media);

    }
}
