package repeticaofor;

import java.util.Scanner;

public class Exercicio74 {
    /*74) Crie um programa que leia o nome e a idade de 5 pessoas e exiba a média das idades.*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int soma = 0;


        for (int contador = 1; contador < 5; contador++) {
            System.out.print("Digite o nome: ");
            String nome = entrada.nextLine();

            System.out.print("Digite a idade: ");
            int idade = entrada.nextInt();

            soma += idade;

            entrada.nextLine();
        }

        double media = (double) soma / 5.0;

        System.out.println("A média das idades é: " + media);
    }
}
