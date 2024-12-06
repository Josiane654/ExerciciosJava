package matrizes;

import java.util.Scanner;

public class Exercicio108 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Scanner entrada = new Scanner(System.in);

        for (int n = 0; n < 4; n++) {
            for (int i = 0; i < 4; i++) {
                System.out.print("Digite o número para a posição [" + n + "][" + i + "]: ");
                matriz[n][i] = entrada.nextInt();
            }
        }

        for (int n = 0; n < 4; n++) {
            int maior = matriz[n][0];
            for (int i = 0; i < 4; i++) {
                if (matriz[n][i] > maior) {
                    maior = matriz[n][i];
                }
            }
            System.out.println("O maior valor na linha " + n + " é: " + maior);
        }
    }
}
