package vetores;

import java.util.Scanner;

public class Exercicio87 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int contadorPositivos = 0;
        Scanner entrada = new Scanner(System.in);

        for (int n = 0; n < 10; n++) {
            System.out.print("Digite um número: ");
            numeros[n] = entrada.nextInt();
            if (numeros[n] > 0) {
                contadorPositivos++;
            }
        }

        System.out.println("A quantidade de números positivos é: " + contadorPositivos);
    }
}