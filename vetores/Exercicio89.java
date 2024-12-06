package vetores;

import java.util.Scanner;

public class Exercicio89 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int contadorPositivos = 0, contadorNegativos = 0;
        Scanner entrada = new Scanner(System.in);

        for (int n = 0; n < 10; n++) {
            System.out.print("Digite um número: ");
            numeros[n] = entrada.nextInt();
            if (numeros[n] > 0) {
                contadorPositivos++;
            } else if (numeros[n] < 0) {
                contadorNegativos++;
            }
        }

        System.out.println("Quantidade de números positivos: " + contadorPositivos);
        System.out.println("Quantidade de números negativos: " + contadorNegativos);
    }
}
