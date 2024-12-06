package repeticaowhile;

public class Exercicio47 {
    /*47 - Crie um programa que exiba os números ímpares de 1 a 50 usando o loop "while".*/
    public static void main(String[] args) {
        int numero = 1;
        System.out.println("Números impares de 1 a 50:");

        while (numero < 50) {
            System.out.println(numero);
            numero += 2;
        }
    }
}
