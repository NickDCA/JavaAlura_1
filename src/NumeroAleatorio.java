import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(101);
        System.out.println("NÚMERO ALEATÓRIO: " + numeroAleatorio);
        Scanner leitura = new Scanner(System.in);
        int numeroChutado = -1;

        for (int tentativas = 0; tentativas < 5; tentativas++) {
            System.out.println("INSIRA UM NÚMERO DE 0 A 100: ");
            numeroChutado = leitura.nextInt();

            if (numeroChutado == numeroAleatorio) {
                System.out.println("PARABÉNS, VOCÊ ACERTOU O NÚMERO!");
                break;
            } else {
                System.out.println("VOCÊ ERROU, TENTE NOVAMENTE");
            }
        }
    }
}
