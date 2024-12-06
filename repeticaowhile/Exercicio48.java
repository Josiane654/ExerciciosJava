package repeticaowhile;

import java.util.Scanner;

public class Exercicio48 {
    /*48 - Faça um programa que leia um número inteiro e exiba os seus dígitos separadamente usando o loop "while".*/
    public static void main(String[] args) {
        int numero;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero = entrada.nextInt();

        System.out.println("Digitos do número informado: ");

        while(numero != 0){
            int digito = numero % 10;
            System.out.println(digito);
            numero = numero / 10;
        }
    }
}
