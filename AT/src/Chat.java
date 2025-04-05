import java.util.Scanner;

public class Chat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nome do 1° usuário: ");
        String usuario1 = scanner.nextLine();
        System.out.print("nome do 2° usuário: ");
        String usuario2 = scanner.nextLine();
        String[] mensagens = new String[10];
        int contador = 0;
        System.out.println("\n=== mensagens ===");
        for (int i = 0; i < 5; i++) {

            System.out.print(usuario1 + ", digite sua mensagem: ");
            mensagens[contador] = usuario1 + ": " + scanner.nextLine();
            contador++;

            System.out.print(usuario2 + ", digite sua mensagem: ");
            mensagens[contador] = usuario2 + ": " + scanner.nextLine();
            contador++;
        }

        System.out.println("\n===== Histórico =====");
        for (String mensagem : mensagens) {
            System.out.println(mensagem);
        }

        System.out.println("\neu odeio vcs por utilizarem o sistema! Não faça isso de novo .");

        scanner.close();
    }
}