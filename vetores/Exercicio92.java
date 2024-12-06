package vetores;
import java.util.*;

public class Exercicio92 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner entrada = new Scanner(System.in);

        for (int n = 0; n < 5; n++) {
            System.out.print("Digite um número: ");
            numeros[n] = entrada.nextInt();
        }

        Arrays.sort(numeros);
        for (int n = 4; n >= 0; n--) {
            System.out.println(numeros[n]);
        }
    }
}
