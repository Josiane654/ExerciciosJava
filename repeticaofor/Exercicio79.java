package repeticaofor;
import java.util.Scanner;

public class Exercicio79 {
    /*79) Escreva um programa que calcule o fatorial de um número inteiro inserido pelo usuário.*/
    public static void main(String[] args) {
        int n;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        n = entrada.nextInt();

        int fatorial = 1;

        for (int numero = 1; numero <= n; numero++) {
            fatorial *= numero;
        }

        System.out.println("O fatorial de " + n + " é: " + fatorial);
    }
}
