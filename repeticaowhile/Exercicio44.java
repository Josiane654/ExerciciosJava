package repeticaowhile;

import java.util.Scanner;

public class Exercicio44 {
    /*44 - Crie um programa que leia o nome e a idade de 5 pessoas usando o loop "while" e exiba a média das idades.*/
    public static void main(String[] args) {
        int idade;
        int contador = 0;
        double media;
        int soma = 0;

        Scanner entrada = new Scanner(System.in);

        while (contador < 5){
            System.out.println("Digite sua idade: ");
            idade = entrada.nextInt();
            soma += idade;
            contador++;
        }

        media = soma / 5.0;

        System.out.println("A média das idades informadas é: " + media);
    }
}
