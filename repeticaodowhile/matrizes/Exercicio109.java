package matrizes;

import java.util.Scanner;

public class Exercicio109 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        boolean identidade = true;
        Scanner entrada = new Scanner(System.in);

        for (int n = 0; n < 3; n++) {
            for (int i = 0; i < 3; i++) {
                System.out.print("Digite o número para a posição [" + n + "][" + i + "]: ");
                matriz[n][i] = entrada.nextInt();
            }
        }

        for (int n = 0; n < 3; n++) {
            for (int i = 0; i < 3; i++) {
                if ((n == i && matriz[n][i] != 1) || (n != i && matriz[n][i] != 0)) {
                    identidade = false;
                    break;
                }
            }
            if (!identidade) break;
        }

        if (identidade) {
            System.out.println("A matriz é identidade.");
        } else {
            System.out.println("A matriz não é identidade.");
        }
    }
}
