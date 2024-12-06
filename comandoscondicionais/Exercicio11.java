package comandoscondicionais;
import java.util.Scanner;

public class Exercicio11 {
    /*11 - Escreva um programa que calcule a média aritmética entre três números reais inseridos pelo usuário.*/
    public static void main(String[] args) {
        float n1, n2, n3;
        double media;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        n1 = entrada.nextFloat();

        System.out.println("Digite o segundo valor: ");
        n2 = entrada.nextFloat();

        System.out.println("Digite o terceiro valor: ");
        n3 = entrada.nextFloat();

        media = (n1 + n2 + n3) / 3;

        System.out.println("A média aritmética dos valores inseridos é: " + media);
    }
}
