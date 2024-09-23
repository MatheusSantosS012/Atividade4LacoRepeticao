
import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        int palpite;

        do {
            System.out.print("Adivinhe o número entre 1 e 100: ");
            palpite = scanner.nextInt();

            if (palpite < numeroAleatorio) {
                System.out.println("Muito baixo!");
            } else if (palpite > numeroAleatorio) {
                System.out.println("Muito alto!");
            }
        } while (palpite != numeroAleatorio);

        System.out.println("Parabéns! Você acertou o número.");
    }
}