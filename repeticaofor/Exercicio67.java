package repeticaofor;

public class Exercicio67 {
    /*67) Escreva um programa que calcule a soma dos números de 1 a 100.*/
    public static void main(String[] args) {

        int soma = 0;

        for (int n = 1; n <= 100; n++) {
            soma += n;
        }

        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }
}
