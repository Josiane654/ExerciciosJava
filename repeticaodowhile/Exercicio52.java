package repeticaodowhile;

public class Exercicio52 {
    /*52 - Escreva um programa que calcule a soma dos números de 1 a 100 usando o loop "do-while".*/
    public static void main(String[] args) {
        int n = 1;
        int soma = 0;

        do {
            soma += n;
            n++;
        } while (n <= 100);

        System.out.println("Soma dos números de 1 a 100 = " + soma);
    }
}
