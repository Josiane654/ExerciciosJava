package repeticaofor;

public class Exercicio75 {
    /*75) Faça um programa que exiba os primeiros 20 números da sequência de Fibonacci.*/
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        System.out.println("20 primeiros números da sequência de Fibonacci: ");
        System.out.println(0);

        for (int n = 1; n < 20; n++) {
            System.out.println(b);
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
