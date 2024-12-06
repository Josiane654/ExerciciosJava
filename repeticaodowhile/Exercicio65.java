package repeticaodowhile;

import java.util.Scanner;

public class Exercicio65 {
    /*65) Crie um programa que leia o nome e a idade de várias pessoas usando o loop "do-while" até que o nome "fim" seja informado. Ao final, exiba a média das idades.*/
    public static void main(String[] args) {
        String nome;
        int idade;
        int soma = 0;
        int contador = 0;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.print("Digite o nome:");
            nome = entrada.nextLine();

            if (!nome.equals("fim")) {
                System.out.print("Digite a idade:");
                idade = entrada.nextInt();
                entrada.nextLine();

                soma += idade;
                contador++;
            }
        } while (!nome.equalsIgnoreCase("fim"));


            double media = (double) soma / contador;
            System.out.println("A média das idades é: " + media);
    }
}
