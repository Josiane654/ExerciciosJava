package vetores;

import java.util.Scanner;

public class Exercicio84 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int contadorPares = 0;
        Scanner entrada = new Scanner(System.in);

        for (int n = 0; n < 5; n++) {
            System.out.print("Digite um número: ");
            numeros[n] = entrada.nextInt();
            if (numeros[n] % 2 == 0) {
                contadorPares++;
            }
        }

        System.out.println("A quantidade de números pares é: " + contadorPares);

    }
}
