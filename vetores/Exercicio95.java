package vetores;
import java.util.*;

public class Exercicio95 {
    public static void main(String[] args) {
        String[] nomes = new String[5];
        Scanner entrada = new Scanner(System.in);

        for (int n = 0; n < 5; n++) {
            System.out.print("Digite o nome: ");
            nomes[n] = entrada.nextLine();
        }

        Arrays.sort(nomes);

        System.out.println("Os nomes em ordem alfabética são:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
