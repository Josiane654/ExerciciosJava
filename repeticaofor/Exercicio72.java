package repeticaofor;

import java.util.Scanner;

public class Exercicio72 {
    /*72) Faça um programa que leia um número inteiro e exiba se ele é um número primo.*/
    public static void main(String[] args) {
        int n;
        boolean primo = true;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com um número inteiro: ");
        n = entrada.nextInt();

        if (n <= 1) {
            primo = false;
        } else {
            for (int divisor = 2; divisor <= Math.sqrt(n); divisor++) {
                if (n % divisor == 0) {
                    primo = false;  // Se encontrar um divisor, o número não é primo
                    break;
                }
            }
        }

        if (primo) {
            System.out.println(n + " é um número primo.");
        } else {
            System.out.println(n + " não é um número primo.");
        }
    }
}
