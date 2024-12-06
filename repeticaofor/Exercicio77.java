package repeticaofor;

public class Exercicio77 {
    /*77) Crie um programa que exiba os números ímpares de 50 a 1.*/
    public static void main(String[] args) {
        for (int n = 50; n >= 1; n--) {
            if (n % 2 != 0) {
                System.out.print(n + " ");
            }
        }
    }
}
