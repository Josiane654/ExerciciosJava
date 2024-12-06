package repeticaodowhile;


public class Exercicio62 {
    /*62) Crie um programa que exiba os números ímpares de 1 a 50 usando o loop "do-while".*/
    public static void main(String[] args) {

        int n = 0;

        System.out.println("Números ímpares entre 1 e 50");

        do {
            if (n % 2 != 0) {
                System.out.println(n);
            }
            n++;
        } while (n <= 50);
    }
}