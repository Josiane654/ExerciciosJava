package vetores;

import java.util.Scanner;

public class Exercicio83 {
    public static void main(String[] args) {
        int[] numeros = new int[7];
        int soma = 0;
        Scanner entrada = new Scanner(System.in);

        for (int n = 0; n < 7; n++) {
            System.out.print("Digite um número: ");
            numeros[n] = entrada.nextInt();
            soma += numeros[n];
        }

        double media = soma / 7.0;
        System.out.println("A média dos números é: " + media);
    }
}
