import java.util.Scanner;

public class ValidacaoIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;

        do {
            System.out.print("Digite uma idade válida (maior que 0): ");
            idade = scanner.nextInt();
        } while (idade <= 0);

        System.out.println("Idade válida inserida: " + idade);
    }
}