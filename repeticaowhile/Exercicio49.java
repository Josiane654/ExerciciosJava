package repeticaowhile;

import java.util.Scanner;

public class Exercicio49 {
    /*49 - Escreva um programa que calcule o fatorial de um número inteiro inserido pelo usuário usando o loop "while".*/
    public static void main(String[] args) {
        int numero;
        long fatorial = 1;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um número: ");
        numero = entrada.nextInt();

        int n = 1;

        while (n <= numero) {
            fatorial *= n;
            n++;
        }

        System.out.println("Fatorial de " + numero + " = " + fatorial);
    }
}
