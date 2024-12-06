package vetores;

import java.util.*;

public class Exercicio86 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner entrada = new Scanner(System.in);

        for (int n = 0; n < 10; n++) {
            System.out.print("Digite um número: ");
            numeros[n] = entrada.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("Os números em ordem crescente são:");
        for (int n = 0; n < 10; n++) {
            System.out.println(numeros[n]);
        }
    }
}
