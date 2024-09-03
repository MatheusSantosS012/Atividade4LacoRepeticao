
import java.util.Scanner;

public class Calculadora
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o primeiro número: ");

        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");

        double numero2 = scanner.nextDouble();

        System.out.print("Escolha a operação (+, -, *, /): ");

        char operacao = scanner.next().charAt(0);


        double resultado;

        switch (operacao) {

            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");

                    return;
                }
                break;
            default:
                System.out.println("Erro: Operação inválida.");

                return;
        }


        System.out.println("O resultado da operação " + numero1 + " " + operacao + " " + numero2 + " é: " + resultado);

    }
}