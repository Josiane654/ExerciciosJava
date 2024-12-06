package repeticaodowhile;

public class Exercicio51 {
    /*51 - Faça um programa que exiba os números de 1 a 10 usando o loop "do-while".*/
    public static void main(String[] args) {
        int n = 1;

        System.out.println("Números de 1 a 10:");

        do {
            System.out.println(n);
            n++;
        } while (n <= 10);
    }
}
