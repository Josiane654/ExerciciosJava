package repeticaodowhile;

import java.util.Scanner;

public class Exercicio64 {
    /*64) Escreva um programa que calcule o fatorial de um número inteiro inserido pelo usuário usando o loop "do-while".*/
    public static void main(String[] args) {
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        n = scanner.nextInt();

        int fatorial = 1;
        int contador = 1;

        do {
            fatorial *= contador;
            contador++;
        } while (n <= n);

        System.out.println("O fatorial de " + n + " é: " + fatorial);
    }
}
