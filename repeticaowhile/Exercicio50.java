package repeticaowhile;

import java.util.Scanner;

public class Exercicio50 {
    /*50 - Crie um programa que leia o nome e a idade de várias pessoas usando o loop "while" até que o nome "fim" seja informado. Ao final, exiba a média das idades.*/
    public static void main(String[] args) {
        String nome;
        int idade;
        int soma = 0;
        double media;
        int contador = 0;

        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.print("Informe o nome: ");
            nome = entrada.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Informe a idade: ");
            idade = entrada.nextInt();
            entrada.nextLine();

            soma += idade;
            contador++;
        }

        System.out.println("A média das idades inseridas é: " + (soma / contador));
    }
}
