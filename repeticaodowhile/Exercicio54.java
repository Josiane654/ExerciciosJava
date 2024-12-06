package repeticaodowhile;

import java.util.Scanner;

public class Exercicio54 {
    /*54) Faça um programa que leia 5 números inteiros usando o loop "do-while" e exiba a média aritmética dos valores lidos.*/
    public static void main(String[] args) {
        int n;
        int soma = 0;
        double media;
        int contador = 0;

        do {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Entre com um número: ");
            n = entrada.nextInt();

            soma += n;
            contador++;
        } while (contador < 5);

        media = soma / 5.0;

        System.out.println("A média dos números inseridos é: " + media);
    }
}