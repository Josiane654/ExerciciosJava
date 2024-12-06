package repeticaodowhile;

import java.util.Scanner;

public class Exercicio55 {
    /*55) Escreva um programa que leia um número inteiro e exiba a tabuada desse número até o décimo valor usando o loop "do-while".*/
    public static void main(String[] args) {

        int n;
        int tabuada = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com um número para calcular a tabuada: ");
        n = entrada.nextInt();

        do {
            System.out.println(n + " x " + tabuada + " = " + (n * tabuada));
            tabuada++;
        } while (tabuada <= 10);
    }
}
