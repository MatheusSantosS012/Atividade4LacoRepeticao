
import java.util.Scanner;

public class AprovacaoEscolar
{public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);


    System.out.print("Digite a média final do aluno: ");
    double mediaFinal = scanner.nextDouble();

    if (mediaFinal >= 7) {

        System.out.println("Resultado: Aprovado");


    } else if (mediaFinal >= 5) {

        System.out.println("Resultado: Recuperação");


    } else {

        System.out.println("Resultado: Reprovado");

    }
}
}