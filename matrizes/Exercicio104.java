package matrizes;

import java.util.Scanner;

public class Exercicio104 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        boolean simetrica = true;
        Scanner entrada = new Scanner(System.in);

        for (int n = 0; n < 3; n++) {
            for (int i = 0; i < 3; i++) {
                System.out.print("Digite o número para a posição [" + n + "][" + i + "]: ");
                matriz[n][i] = entrada.nextInt();
            }
        }

        for (int n = 0; n < 3; n++) {
            for (int i = 0; i < 3; i++) {
                if (matriz[n][i] != matriz[i][n]) {
                    simetrica = false;
                    break;
                }
            }
            if (!simetrica) break;
        }

        if (simetrica) {
            System.out.println("A matriz é simétrica.");
        } else {
            System.out.println("A matriz não é simétrica.");
        }
    }
}
