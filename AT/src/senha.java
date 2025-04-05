import java.util.Scanner;
import java.util.regex.Pattern;

public class senha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        while (true) {
            System.out.print("Digite sua senha: ");
            String senha = scanner.nextLine();
            String erro = validar(senha);

            if (erro.isEmpty()) {
                System.out.println("Cadastro realizado ");
                break;
            } else {
                System.out.println("Erro: " + erro);
            }
        }
        scanner.close();
    }

    public static String validar(String senha) {
        if (senha.length() < 8) {
            return "A senha deve ter pelo menos 8 caracteres.";
        }

        if (!Pattern.compile("[@#$%^&+=!]").matcher(senha).find()) {
            return "A senha deve conter pelo menos um caractere especial (@, #, $, etc.).";
        }
        if (!Pattern.compile("[A-Z]").matcher(senha).find()) {
            return "A senha deve conter pelo menos uma letra maiúscula.";
        }

        if (!Pattern.compile("[0-9]").matcher(senha).find()) {
            return "A senha deve conter pelo menos um número.";
        }
        return "";
    }
}
