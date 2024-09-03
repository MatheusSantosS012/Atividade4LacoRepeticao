
import java.util.Scanner;

public class CalculoDescontoProgressivo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o valor total da compra: R$ ");
        double valorOriginal = scanner.nextDouble();


        double desconto = 0;
        double valorFinal;


        if (valorOriginal > 500) {
            desconto = 0.20; // 20% de desconto
        } else if (valorOriginal >= 200) {
            desconto = 0.10; // 10% de desconto
        } else if (valorOriginal >= 100) {
            desconto = 0.05; // 5% de desconto
        } else {
            desconto = 0; // Sem desconto
        }


        double valorDescontado = valorOriginal * desconto;
        valorFinal = valorOriginal - valorDescontado;


        System.out.printf("Valor original: R$ %.2f%n", valorOriginal);
        System.out.printf("Percentual de desconto: %.0f%%%n", desconto * 100);
        System.out.printf("Valor descontado: R$ %.2f%n", valorDescontado);
        System.out.printf("Valor final da compra: R$ %.2f%n", valorFinal);


    }
}
