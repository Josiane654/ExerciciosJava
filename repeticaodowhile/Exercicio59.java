package repeticaodowhile;

import java.util.Scanner;

public class Exercicio59 {
    /*59) Crie um programa que leia o nome e a idade de 5 pessoas usando o loop "do-while" e exiba a média das idades.*/
    public static void main(String[] args) {

        String nome;
        int idade;
        int soma = 0;
        int contador = 0;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Digite o nome: ");
            nome = entrada.nextLine();

            System.out.println("Digite a idade: ");
            idade = entrada.nextInt();

            soma += idade;

        } while (!nome.equalsIgnoreCase("fim"));
        contador++;

        System.out.println("A média das idades inseridas é: " + soma / contador);


    }
}
