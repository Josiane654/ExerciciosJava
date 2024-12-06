package matrizes;

import java.util.Scanner;

public class Exercicio106 {
    public static void main(String[] args) {
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        boolean iguais = true;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite os elementos da primeira matriz:");
        for (int n = 0; n < 2; n++) {
            for (int i = 0; i < 2; i++) {
                System.out.print("Digite o número para a posição [" + n + "][" + i + "]: ");
                matriz1[n][i] = entrada.nextInt();
            }
        }

        System.out.println("Digite os elementos da segunda matriz:");
        for (int n = 0; n < 2; n++) {
            for (int i = 0; i < 2; i++) {
                System.out.print("Digite o número para a posição [" + n + "][" + i + "]: ");
                matriz2[n][i] = entrada.nextInt();
            }
        }

        for (int n = 0; n < 2; n++) {
            for (int i = 0; i < 2; i++) {
                if (matriz1[n][i] != matriz2[n][i]) {
                    iguais = false;
                    break;
                }
            }
            if (!iguais) break;
        }

        if (iguais) {
            System.out.println("As matrizes são iguais.");
        } else {
            System.out.println("As matrizes não são iguais.");
        }
    }
}
