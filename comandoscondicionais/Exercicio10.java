package comandoscondicionais;
import java.util.Scanner;
public class Exercicio10 {
    /*10 - Faça um programa que leia um número inteiro e exiba a sua tabuada de multiplicação até o décimo valor.*/
    public static void main(String[] args) {

        int numero;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        numero = entrada.nextInt();

        System.out.println("Tabuada:");

        System.out.println(numero + " x 1 = " + numero);
        System.out.println(numero + " x 2 = " + (numero * 2));
        System.out.println(numero + " x 3 = " + (numero * 3));
        System.out.println(numero + " x 4 = " + (numero * 4));
        System.out.println(numero + " x 5 = " + (numero * 5));
        System.out.println(numero + " x 6 = " + (numero * 6));
        System.out.println(numero + " x 7 = " + (numero * 7));
        System.out.println(numero + " x 8 = " + (numero * 8));
        System.out.println(numero + " x 9 = " + (numero * 9));
        System.out.println(numero + " x 10 = " + (numero * 10));
    }
}
