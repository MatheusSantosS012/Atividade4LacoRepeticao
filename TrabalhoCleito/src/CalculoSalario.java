
import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o salário bruto do funcionário: R$ ");
        double salarioBruto = scanner.nextDouble();


        System.out.print("Digite o número de anos que o funcionário trabalhou na empresa: ");
        int anosTrabalho = scanner.nextInt();


        double bonus = 0;
        double imposto = 0;


        if (anosTrabalho > 10) {
            bonus = salarioBruto * 0.10; // 10% de bônus
        } else if (anosTrabalho >= 5) {
            bonus = salarioBruto * 0.05; // 5% de bônus
        }


        if (salarioBruto > 5000) {
            imposto = salarioBruto * 0.27; // 27% de imposto
        } else if (salarioBruto >= 3000) {
            imposto = salarioBruto * 0.18; // 18% de imposto
        } else {
            imposto = salarioBruto * 0.10; // 10% de imposto
        }


        double salarioLiquido = salarioBruto + bonus - imposto;


        System.out.printf("Salário bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Bônus recebido: R$ %.2f%n", bonus);
        System.out.printf("Imposto descontado: R$ %.2f%n", imposto);
        System.out.printf("Salário líquido: R$ %.2f%n", salarioLiquido);


    }
}
