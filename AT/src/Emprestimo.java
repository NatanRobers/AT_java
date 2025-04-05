import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o valor do emprestimo: ");
        double valorEmprestimo = scanner.nextDouble();
        System.out.print("Digite o número de parcelas (mínimo 6, máximo 48): ");
        int parcelas = scanner.nextInt();

        while (parcelas < 6 || parcelas > 48) {
            System.out.println("Número de parcelas inválido.");
            System.out.print("Digite o número de parcelas (mínimo 6, máximo 48): ");
            parcelas = scanner.nextInt();
        }

        double Juros = 0.03;
        double valorT = valorEmprestimo * Math.pow(1 + Juros, parcelas);
        double valorP = valorT / parcelas;

        System.out.println("\n====================");
        System.out.printf("Cliente: %s\n", nome);
        System.out.printf("Valor do Empréstimo: R$ %.2f\n", valorEmprestimo);
        System.out.printf("Número de Parcelas: %d\n", parcelas);
        System.out.printf("Valor Total: R$ %.2f\n", valorT);
        System.out.printf("Valor da Parcela: R$ %.2f\n", valorP);
        System.out.println("====================");

        scanner.close();
    }
}
