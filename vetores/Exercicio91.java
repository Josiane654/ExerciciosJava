package vetores;

import java.util.Scanner;

public class Exercicio91 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int somaPositivos = 0, somaNegativos = 0;
        Scanner entrada = new Scanner(System.in);

        for (int n = 0; n < 10; n++) {
            System.out.print("Digite um número: ");
            numeros[n] = entrada.nextInt();
            if (numeros[n] > 0) {
                somaPositivos += numeros[n];
            } else if (numeros[n] < 0) {
                somaNegativos += numeros[n];
            }
        }

        System.out.println("Soma dos valores positivos: " + somaPositivos);
        System.out.println("Soma dos valores negativos: " + somaNegativos);
    }
}
