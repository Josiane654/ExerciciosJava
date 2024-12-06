package repeticaodowhile;

public class Exercicio53 {
    /*53 - Crie um programa que exiba os números pares de 1 a 50 usando o loop "do-while"*/

    public static void main(String[] args) {
        int n = 1;

        do {
            if (n % 2 == 0) {
                System.out.println(n);
            }
            n++;
        } while (n <= 50);
    }
}
