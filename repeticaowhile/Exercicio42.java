package repeticaowhile;

import java.util.Scanner;

public class Exercicio42 {
    /*42 - Faça um programa que leia um número inteiro e exiba se ele é um número primo usando o loop "while".*/
    public static void main(String[] args) {
        int numero;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um número: ");
        numero = entrada.nextInt();

        if (numero <= 1) {
            System.out.println("Não é um número primo.");
        } else {
            int divisor = 2;
            boolean primo = true;

            while (divisor <= numero / 2) {
                if (numero % divisor == 0) {
                    primo = false;
                    break;
                }
                divisor++;
            }
            if (primo) {
                System.out.println("É um número primo.");
            } else {
                System.out.println("Não é um número primo.");
            }
        }
    }
}
