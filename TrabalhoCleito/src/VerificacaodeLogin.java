
import java.util.Scanner;

public class VerificacaodeLogin {
    public static void main(string[] args){
        String nomeDeUsuarioCorreto = "cachorro";
        String senhaCorreta = "1234";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digíte seu nome de usuário:");
        String nomeDeUsuario = scanner.nextLine();

        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();

        if (nomeDeUsuario.equals(nomeDeUsuarioCorreto) && senha.equals(senhaCorreta)) {

            System.out.println("Login bem-sucedido! Bem-vindo, " + nomeDeUsuario + ".");
        } else {

            System.out.println("Erro: Nome de usuário ou senha incorretos.");

        }
    }
}