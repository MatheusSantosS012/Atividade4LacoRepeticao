import java.util.Scanner;

public class MediaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos números deseja inserir? ");
        int n = scanner.nextInt();

        double soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            soma += scanner.nextDouble();
        }

        double media = soma / n;
        System.out.println("A média dos números inseridos é: " + media);
    }
}