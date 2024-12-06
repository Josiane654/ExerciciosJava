package vetores;

import java.util.Scanner;

public class Exercicio88 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int somaPares = 0, somaImpares = 0, contadorPares = 0, contadorImpares = 0;
        Scanner entrada = new Scanner(System.in);

        for (int n = 0; n < 5; n++) {
            System.out.print("Digite um número: ");
            numeros[n] = entrada.nextInt();
            if (numeros[n] % 2 == 0) {
                somaPares += numeros[n];
                contadorPares++;
            } else {
                somaImpares += numeros[n];
                contadorImpares++;
            }
        }

        double mediaPares = contadorPares > 0 ? (double) somaPares / contadorPares : 0;
        double mediaImpares = contadorImpares > 0 ? (double) somaImpares / contadorImpares : 0;

        System.out.println("Média dos valores pares: " + mediaPares);
        System.out.println("Média dos valores ímpares: " + mediaImpares);
    }
}
