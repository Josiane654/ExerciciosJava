package comandoscondicionais;
import java.util.Scanner;

public class Exercicio1 {
    /*1 - Faça um programa que solicite dois números inteiros e exiba a soma, subtração, multiplicação e divisão entre eles.*/

    public static void main(String[] args) {

        int n1, n2;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o primeiro número: ");
        n1 = entrada.nextInt();

        System.out.println("Entre com o segundo número: ");
        n2 = entrada.nextInt();

        int soma = n1 + n2;
        int subtracao = n1 - n2;
        int multiplicacao = n1 * n2;
        int divisao = n1 / n2;

        System.out.println("A soma dos números digitados é: " + soma);
        System.out.println("A subtração dos números digitados é: " + subtracao);
        System.out.println("A multiplcação dos números digitados é: " + multiplicacao);
        System.out.println("A divisão dos números digitados é: " + divisao);
    }
}
