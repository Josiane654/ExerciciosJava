package repeticaodowhile;

import java.util.Scanner;

public class Exercicio56 {
    /*56) Crie um programa que leia um número inteiro positivo e exiba todos os divisores desse número usando o loop "do-while".*/
    public static void main(String[] args) {

        int n;
        int divisor = 1;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com um número: ");
        n = entrada.nextInt();

        System.out.println("Divisores do número " + n + ": ");

        do {
            if (n % divisor == 0) {
                System.out.println(divisor);
            }
            divisor++;
        } while (divisor < n);
    }
}