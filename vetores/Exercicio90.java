package vetores;

import java.util.Scanner;

public class Exercicio90 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        boolean encontrouZero = false;
        Scanner entrada = new Scanner(System.in);

        for (int n = 0; n < 5; n++) {
            System.out.print("Digite um número: ");
            numeros[n] = entrada.nextInt();
            if (numeros[n] == 0) {
                encontrouZero = true;
            }
        }

        if (encontrouZero) {
            System.out.println("Um dos números é igual a zero.");
        } else {
            System.out.println("Nenhum número é igual a zero.");
        }
    }
}
