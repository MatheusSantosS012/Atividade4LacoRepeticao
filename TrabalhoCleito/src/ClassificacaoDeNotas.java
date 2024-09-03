
import java.util.Scanner;

public class ClassificacaoDeNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua nota de 0 a 10");

        double nota = scanner.nextDouble();


        if (nota >= 9) {

            System.out.println("Classificação: Excelente");
        } else if (nota >= 7) {

            System.out.println("Classificação: Bom");
        } else if (nota >= 5) {

            System.out.println("Classificação: Satisfatório");
        } else {

            System.out.println("Classificação: Insatisfatório");
        }
    }
}

