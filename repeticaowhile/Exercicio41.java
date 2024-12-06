package repeticaowhile;

import java.util.Scanner;

public class Exercicio41 {
    /*41 - Crie um programa que leia um número inteiro positivo e exiba todos os divisores desse número usando o loop "while".*/
    public static void main(String[] args) {
        int numero;
        int divisor = 1;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com um número: ");
        numero = entrada.nextInt();

        System.out.println("Divisores do número " + numero + ": ");

        while (divisor <= numero){
            if (numero % divisor == 0){
                System.out.println(divisor);
                divisor++;
            }
        }
    }
}
