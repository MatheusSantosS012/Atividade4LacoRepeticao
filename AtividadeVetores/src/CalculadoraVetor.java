public class CalculadoraVetor {
    public static void main(String[] args) {

        int[] vetor = new int[4];


        vetor[0] = 3;
        vetor[1] = 6;
        vetor[2] = 9;
        vetor[3] = 12;


        int soma = vetor[0] + vetor[3];


        System.out.println("A soma do primeiro e último elementos do vetor é: " + soma);
    }
}