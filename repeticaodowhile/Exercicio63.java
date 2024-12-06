package repeticaodowhile;

import java.util.Scanner;

public class Exercicio63 {
    /*63) Faça um programa que leia um número inteiro e exiba os seus dígitos separadamente usando o loop "do-while".*/
    public static void main(String[] args) {

        int n;
        int digito = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com um número inteiro: ");
        n = entrada.nextInt();

        do {
            digito = n % 10;
            n /= 10;
            System.out.println(digito);
        } while (digito != 0);
    }

}
