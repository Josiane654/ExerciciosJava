package repeticaofor;

import java.util.Scanner;

public class Exercicio70 {
    /*70) Escreva um programa que leia um número inteiro e exiba a tabuada desse número até o décimo valor.*/
    public static void main(String[] args) {
        int n;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número para calcular a tabuada: ");
        n = entrada.nextInt();

        for (int tabuada = 0; tabuada <= 10; tabuada++) {
            System.out.println(n + " x " + tabuada + " = " + (n * tabuada));
        }
    }
}
