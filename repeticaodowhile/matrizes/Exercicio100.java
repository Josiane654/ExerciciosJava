package matrizes;

import java.util.Scanner;

public class Exercicio100 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int maior = Integer.MIN_VALUE;
        Scanner entrada = new Scanner(System.in);

        for (int n = 0; n < 3; n++) {
            for (int i = 0; i < 3; i++) {
                System.out.print("Digite o número para a posição [" + n + "][" + i + "]: ");
                matriz[n][i] = entrada.nextInt();
                if (matriz[n][i] > maior) {
                    maior = matriz[n][i];
                }
            }
        }

        System.out.println("O maior valor presente na matriz é: " + maior);
    }
}
