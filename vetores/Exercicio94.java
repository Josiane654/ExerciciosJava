package vetores;

import java.util.Scanner;

public class Exercicio94 {
    public static void main(String[] args) {
        int[] numeros = new int[7];
        Scanner entrada = new Scanner(System.in);

        for (int n = 0; n < 7; n++) {
            System.out.print("Digite um número: ");
            numeros[n] = entrada.nextInt();
            if (numeros[n] % 2 == 0) {
                System.out.println(numeros[n]);
            }
        }
    }
}
