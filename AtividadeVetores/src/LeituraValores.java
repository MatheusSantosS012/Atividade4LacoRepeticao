import java.util.Scanner;

public class LeituraValores {
    public static void main(String[] args) {

        int[] valores = new int[3];


        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Insira o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextInt();
        }

        System.out.println("\nValores inseridos:");
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Valor " + (i + 1) + ": " + valores[i]);
        }

        int soma = 0;
        for (int valor : valores) {
            soma += valor;
        }
        double media = (double) soma / valores.length;
        System.out.println("\nMédia dos valores: " + media);

        scanner.close();
    }
}