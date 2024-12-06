package repeticaowhile;
import java.util.Scanner;

public class Exercicio40 {
    /*40 - Escreva um programa que leia um número inteiro e exiba a tabuada desse número até o décimo valor usando o loop "while".*/
    public static void main(String[] args) {
        int numero;
        int tabuada = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número para calcular a tabuada: ");
        numero = entrada.nextInt();

        while (tabuada <= 10){
            System.out.println(numero + " x " + tabuada + " = " + (numero * tabuada));
            tabuada++;
        }
    }
}
