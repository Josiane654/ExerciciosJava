package matrizes;

import java.util.Scanner;

public class Exercicio101 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int soma = 0;
        int totalElementos = 16;
        Scanner entrada = new Scanner(System.in);

        for (int n = 0; n < 4; n++) {
            for (int i = 0; i < 4; i++) {
                System.out.print("Digite o número para a posição [" + n + "][" + i + "]: ");
                matriz[n][i] = entrada.nextInt();
                soma += matriz[n][i];
            }
        }

        double media = (double) soma / totalElementos;
        System.out.println("A média aritmética dos elementos é: " + media);
    }
}
