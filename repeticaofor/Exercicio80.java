package repeticaofor;

import java.util.Scanner;

public class Exercicio80 {
    /*80) Crie um programa que leia o nome e a idade de várias pessoas até que o nome "fim" seja informado. Ao final, exiba a média das idades.*/
    public static void main(String[] args) {
        int soma = 0;
        int contador = 0;
        String nome;

        Scanner entrada = new java.util.Scanner(System.in);

        while (true) {
            System.out.print("Digite o nome: ");
            nome = entrada.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Digite a idade: ");
            int idade = entrada.nextInt();
            entrada.nextLine();

            soma += idade;
            contador++;
        }
    }
}
