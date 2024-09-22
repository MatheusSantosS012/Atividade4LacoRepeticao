import java.util.Scanner;

public class LeituraNomes {
    public static void main(String[] args) {

        String[] nomes = new String[3];


        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Insira o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.println("\nNomes inseridos:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome " + (i + 1) + ": " + nomes[i]);
        }

        scanner.close();
    }
}