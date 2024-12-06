package repeticaofor;

import java.util.Scanner;

public class Exercicio78 {
    /*78) Faça um programa que leia um número inteiro e exiba os seus dígitos separadamente.*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        String numeroStr = Integer.toString(numero);

        System.out.println("Os dígitos do número " + numero + " são:");
        for (int n = 0; n < numeroStr.length(); n++) {
            System.out.println(n);
        }
    }
}
