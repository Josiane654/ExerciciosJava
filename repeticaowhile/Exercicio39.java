package repeticaowhile;
import java.util.Scanner;

public class Exercicio39 {
    /*39 - Faça um programa que leia 5 números inteiros usando o loop "while" e exiba a média aritmética dos valores lidos.*/
    public static void main(String[] args) {
        int contador = 0;
        int n = 0;
        int soma = 0;
        double media;

        while (contador < 5) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um número: ");
            n = sc.nextInt();
            soma += n;
            contador++;
        }

        media = soma / 5;
        System.out.println("A média dos números informados é: " + media);
    }
}
