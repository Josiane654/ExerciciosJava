package matrizes;

import java.util.Scanner;

public class Exercicio97 {
    public static void main(String[] args) {
        int[][] matriz = new int[2][2];
        int soma = 0;
        Scanner entrada = new Scanner(System.in);

        for (int n = 0; n < 2; n++) {
            for (int i = 0; i < 2; i++) {
                System.out.print("Digite o número para a posição [" + n + "][" + i + "]: ");
                matriz[n][i] = entrada.nextInt();
                soma += matriz[n][i];
            }
        }

        System.out.println("A soma de todos os elementos é: " + soma);
    }
}
