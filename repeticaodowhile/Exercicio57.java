package repeticaodowhile;

import java.util.Scanner;

public class Exercicio57 {
    /*57) Faça um programa que leia um número inteiro e exiba se ele é um número primo usando o loop "do-while".*/
    public static void main(String[] args) {

        int n;
        boolean primo = true;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com um número: ");
        n = entrada.nextInt();

        do {
            if (n % 2 == 0 || n <= 1) {
                primo = false;
                System.out.println(n + " não é um número primo.");
            } else {
                System.out.println(n + " é um número primo.");
            }
            break;
        } while (primo);


    }
}
