package repeticaofor;

import java.util.Scanner;

public class Exercicio71 {
    /*71) Crie um programa que leia um número inteiro positivo e exiba todos os divisores desse número.*/
    public static void main(String[] args) {

        int n;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        n = entrada.nextInt();

        System.out.println("Divisores de " + n+ ":");

        for (int divisor = 1; divisor <= n; divisor++) {
            if (n % divisor == 0) {
                System.out.println(n);
            }
        }
    }
}
