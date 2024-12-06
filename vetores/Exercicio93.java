package vetores;

import java.util.Scanner;

public class Exercicio93 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int contadorIntervalo = 0;
        Scanner entrada = new Scanner(System.in);

        for (int n = 0; n < 10; n++) {
            System.out.print("Digite um número: ");
            numeros[n] = entrada.nextInt();
            if (numeros[n] >= 10 && numeros[n] <= 50) {
                contadorIntervalo++;
            }
        }

        System.out.println("Quantidade de números no intervalo de 10 a 50: " + contadorIntervalo);
    }
}
