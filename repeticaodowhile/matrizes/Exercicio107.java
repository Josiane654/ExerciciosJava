package matrizes;

import java.util.Scanner;

public class Exercicio107 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int produto = 1;
        Scanner entrada = new Scanner(System.in);

        for (int n = 0; n < 3; n++) {
            for (int i = 0; i < 3; i++) {
                System.out.print("Digite o número para a posição [" + n + "][" + i + "]: ");
                matriz[n][i] = entrada.nextInt();
            }
        }

        for (int n = 0; n < 3; n++) {
            produto *= matriz[n][2 - n]; // Elementos da diagonal secundária
        }

        System.out.println("O produto dos elementos da diagonal secundária é: " + produto);
    }
}
