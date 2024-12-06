package matrizes;

import java.util.Scanner;

public class Exercicio105 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int[] somaColunas = new int[4];
        Scanner entrada = new Scanner(System.in);

        for (int n = 0; n < 4; n++) {
            for (int i = 0; i < 4; i++) {
                System.out.print("Digite o número para a posição [" + n + "][" + i + "]: ");
                matriz[n][i] = entrada.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int n = 0; n < 4; n++) {
                somaColunas[i] += matriz[n][i];
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("A soma dos elementos da coluna " + i + " é: " + somaColunas[i]);
        }
    }
}
