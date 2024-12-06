package vetores;

import java.util.Scanner;

public class Exercicio82 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int soma = 0;
        Scanner entrada = new Scanner(System.in);

        for (int n = 0; n < 10; n++) {
            System.out.print("Digite um número: ");
            numeros[n] = entrada.nextInt();
            soma += numeros[n];
        }

        System.out.println("A soma dos números é: " + soma);
    }
}
