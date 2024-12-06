package repeticaowhile;
import java.util.Scanner;

public class Exercicio37 {
    /*37 - Escreva um programa que calcule a soma dos números de 1 a 100 usando o loop "while".*/
    public static void main(String[] args) {
        int n = 1;
        int soma = 0;

        while (n <= 100) {
            soma = soma + n;
            n++;
        }
        System.out.println("Soma dos números de 1 a 100: " + soma);
    }
}
