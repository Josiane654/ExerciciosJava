package vetores;

import java.util.Scanner;

public class Exercicio85 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        Scanner entrada = new Scanner(System.in);

        for (int n = 0; n < 5; n++) {
            System.out.print("Digite um número: ");
            numeros[n] = entrada.nextInt();
            if (numeros[n] > maior) {
                maior = numeros[n];
            }
            if (numeros[n] < menor) {
                menor = numeros[n];
            }
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

    }
}
